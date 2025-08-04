package org.example;

public class allSubString {
    public static void main(String[] args){
        String a="timetopractice";
        String b="toc";
        for(int i=0;i<a.length();i++){
            for(int j=i;j<=a.length();j++){
                System.out.println(a.substring(i,j));
            }
        }
    }
}
