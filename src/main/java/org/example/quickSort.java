package org.example;

public class quickSort {
    public static void quickSortMethod(int[] a,int low,int high){
        if(low>=high)
            return;
        int start=low;
        int end=high;
        int mid=start+end/2;
        int pivot=a[mid];

        while(start<=end){
            while(a[start]<pivot)
                start++;
            while(a[end]>pivot)
                end--;
            if(start<=end){
                int temp=a[start];
                a[start]=a[end];
                a[end]=temp;
                start++;
                end--;
            }
        }
        quickSortMethod(a,low,end);
        quickSortMethod(a,start,high);
    }
}
