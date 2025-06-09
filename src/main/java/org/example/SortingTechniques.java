package org.example;

import org.testng.annotations.Test;

public class SortingTechniques{
    @Test(enabled = false)
    public void bubbleSort(){
        int a[]={3,4,2,1,9,8};
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        for(int p:a){
            System.out.println(p);
        }
    }
    @Test
    public void quickSort(){
        int a[]={3,4,2,1,9,8};
        quickSort.quickSortMethod(a,0,a.length-1);
        for(int i:a){
            System.out.print(i+" ");
        }
    }
}
