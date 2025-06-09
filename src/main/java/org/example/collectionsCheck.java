package org.example;

import java.util.*;

public class collectionsCheck {
    public static void main(String[] args){
        ArrayList<Integer> a = new ArrayList<>();
        LinkedList<Integer> linkedList=new LinkedList<>();
        a.add(1);
        linkedList.add(4);
        System.out.println(a.get(0));
        System.out.println(linkedList.get(0));
        Queue<Integer> q=new LinkedList<>();
        q.peek();
    }
}
