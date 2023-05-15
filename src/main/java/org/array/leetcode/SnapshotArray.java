package org.array.leetcode;

import java.util.*;

public class SnapshotArray {
    /** ***射：index -> 数据 */
    private static final Data[] MAP = new Data[50002];
    /** 上一次实例化参数 */
    private static int LAST_LEN;

    /** 当前版本号 */
    private int snapId;

    public SnapshotArray(int length) {
        if (LAST_LEN != 0) {
            // 不是首次运行，需要初始化
            for (int len = MAP.length - LAST_LEN; LAST_LEN >= len; len <<= 1) {
                System.arraycopy(MAP, LAST_LEN, MAP, LAST_LEN -= len, len);
            }
            if (LAST_LEN != 0) {
                System.arraycopy(MAP, LAST_LEN, MAP, 0, LAST_LEN);
            }
        }
        LAST_LEN = length;
        Data.SNAPSHOT_ARRAY = this;
    }

    public void set(int index, int val) {
        Data data = MAP[index];
        if (data == null) {
            if (val == 0) {
                return;
            }

            MAP[index] = data = new Data();
        }
        data.set(val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snapId) {
        Data data = MAP[index];
        return data == null ? 0 : data.get(snapId);
    }

    /** 最小记录单位 */
    private static class Record implements Comparable<Record> {

        /** 版本号 */
        private int snapId;
        /** 值 */
        private final int val;

        public Record() {
            this.val = -1;
        }

        public Record(int snapId, int val) {
            this.snapId = snapId;
            this.val = val;
        }

        @Override
        public int compareTo(Record o) {
            return snapId - o.snapId;
        }
    }

    /** 数据 */
    private static class Data {

        /** 仅用于比较的元素 */
        private static final Record COMPARE_ELE = new Record();
        /** 当前{@link SnapshotArray}实例 */
        private static SnapshotArray SNAPSHOT_ARRAY;

        /** 缓冲区版本号，缓冲区修改目标值 */
        private int bufferedSnapId = SNAPSHOT_ARRAY.snapId, bufferedVal;
        /** 第一个版本号，已沉淀最新值 */
        private int firstSnapId = 0x7fffffff, lastVal;
        /** 已沉淀数据 */
        private List<Record> records;

        public void set(int val) {
            if (bufferedSnapId == SNAPSHOT_ARRAY.snapId) {
                // 版本未提升
                bufferedVal = val;
                return;
            }

            // 版本提升，沉淀缓冲区修改操作
            if (lastVal != bufferedVal) {
                // 缓冲区修改目标值与最新值不同
                if (records == null) {
                    // 第一次沉淀
                    firstSnapId = bufferedSnapId;
                    records = new ArrayList<>(4);
                }
                records.add(new Record(bufferedSnapId, lastVal = bufferedVal));
            }
            // 更新缓冲区
            bufferedSnapId = SNAPSHOT_ARRAY.snapId;
            bufferedVal = val;
        }

        public int get(int snapId) {
            if (bufferedSnapId <= snapId) {
                return bufferedVal;
            }

            if (snapId < firstSnapId) {
                return 0;
            }

            COMPARE_ELE.snapId = snapId;
            snapId = Collections.binarySearch(records, COMPARE_ELE);
            return records.get(snapId < 0 ? -snapId - 2 : snapId).val;
        }
    }
}
