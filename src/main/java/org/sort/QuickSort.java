package org.sort;

public class QuickSort {
    public void Quick_Sort(int[] arr,int low,int high){
        int i,j,pivot,t;
        if(low>high)
            return;
        i=low;
        j=high;
        pivot=arr[(i+j)/2];
        while (i<j){
            while (pivot<=arr[j]&&i<j)
                j--;
            while(pivot>=arr[i]&&i<j)
                i++;
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        arr[i]=pivot;
        Quick_Sort(arr,low,j-1);
        Quick_Sort(arr,j+1,high);
    }

}
