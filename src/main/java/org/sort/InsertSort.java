package org.sort;

public class InsertSort {
    public void Insert_Sort(int[] arr){
        int t;
        for(int i=1;i<arr.length;i++){
            for(int j=i;j>0;j--){
                if(arr[j]<arr[j-1]){
                    t=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=t;
                }else
                    break;
            }
        }
    }
}
