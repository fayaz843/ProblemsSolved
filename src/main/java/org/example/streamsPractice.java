package org.example;

import org.testng.annotations.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamsPractice {
    @Test
    public static void streamPractice(){
        String[] a ={"fayaz","ahamed","noorea"};
        String[] b ={"check","test"};
        List<String> list1=new ArrayList<>(List.of(a));
        List<String>list2=new ArrayList<>(List.of(b));
        System.out.println(list2);
        System.out.println(list1);
        List<List<String>> finalList=new ArrayList<>();
        finalList.add(list1);
        finalList.add(list2);
        List<String> outList=new ArrayList<>();
        outList=finalList.stream().flatMap(l->l.stream().filter(i->i.contains("c"))).collect(Collectors.toList());
        System.out.println(outList);
        List<String> outList2=new ArrayList<>();
        //outList2=list1.stream().reduce((m,n)->m+n).stream().collect(Collectors.toList());
        Optional<String> getList=list1.stream().reduce((m, n)->{
            return m+n;
        });
        System.out.println(getList.get());
        String s="HI I AM AHAMED NOOREA FAYAZ";
        Map<String,Long> map1=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map1);
        String fs="fayaz";
        String fz=fs;
        System.out.println(fs==fz);
    }

    @Test
    public void convertintArraytoIntegerArray(){
        int a[]={1,4,5,7,8};
        List al=Arrays.stream(a).boxed().toList();
        System.out.println(al);
    }

}
