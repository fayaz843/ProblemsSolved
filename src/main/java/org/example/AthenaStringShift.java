package org.example;

import java.util.Scanner;

public class AthenaStringShift {
    public static void main(String[] args){
        String s="abcd";
        Scanner sc=new Scanner(System.in);
        int leftShift=sc.nextInt();
        int rightShift=sc.nextInt();
        int netShift=0;
        if(leftShift-rightShift>0) {
            netShift = (leftShift - rightShift) % s.length();
        }
        else
            netShift=(rightShift-leftShift)%s.length();
        String part1=s.substring(s.length()-netShift);
        String part2=s.substring(0,s.length()-netShift);
        System.out.println(part1+part2);

    }
}
