package org.example;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
    public static void sum(Integer a,Integer b){
        a=a+2;
        b=b+2;
    }
    public static void addToList(List<Integer> x){
        x=new ArrayList<>();
        x.add(3);
        x.add(5);
    }
    public static void main(String[] args){
        Integer x=new Integer(200);
        Integer y=0;
        sum(x,y);
        System.out.println(x);
        System.out.println(y);
        System.out.println(x==y);

        List<Integer> l=new ArrayList<>();
        addToList(l);
        System.out.println(l.size());

    }
}
