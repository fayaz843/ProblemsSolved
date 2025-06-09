package org.example;

public class productOfLargestThree {
    public static void main(String[] args){
        int arr[]={6,3,9,1,4,13,2,3,10};
        int a=0;
        int b=0;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>a){
                c=b;
                b=a;
                a=arr[i];
            }
            else if(arr[i]>b){
                c=b;
                b=arr[i];
            }
            else if(arr[i]>c){
                c=arr[i];
            }
        }
        System.out.println(a*b*c);
    }
}
