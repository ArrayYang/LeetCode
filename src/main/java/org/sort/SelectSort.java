package org.sort;

public class SelectSort {
    public void Select_Sort(int[] arr){
        int t;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++)
                if(arr[i]>arr[j]){
                    t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
        }
    }
}
