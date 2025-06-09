package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al= new ArrayList<>();
        al.add("ahamed");
        al.add("fayaz");
        al.add("ahamed");
        System.out.println(al);
        List<String> StreamList= al.stream().distinct().toList();
        System.out.println(StreamList);
        List<String> sortedList=al.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(sortedList);
    }
}