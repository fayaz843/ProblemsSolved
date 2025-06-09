package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamPractice2 {
    public static void main(String[] args){
        List<Person> personList=new ArrayList<Person>();
        Person p1=new Person("fayaz",24,"erode");
        Person p2=new Person("ahamed",29,"coimbatore");
        Person p3=new Person("noorea",27,"erode");
        Collections.addAll(personList,p1,p2,p3);
        List<Person> ageList= personList.stream().filter(p->p.age>25).toList();
        System.out.print(ageList);

        Map<String,List<String>> cityMap=  personList.stream().collect(Collectors.groupingBy(e->e.city,Collectors.mapping(e->e.name,Collectors.toList())));
        System.out.println(1);
        System.out.println(cityMap);
        Map<String,Long> cityCountMap=  personList.stream().collect(Collectors.groupingBy(e->e.city,Collectors.counting()));
        System.out.println(cityCountMap);
        List<Person> nameSortList=personList.stream().sorted(Comparator.comparing(e->e.name)).toList();
        System.out.println(nameSortList);

        String s="HI I AM AHAMED NOOREA FAYAZ";
        Map<String,Long> map1=Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
        System.out.println(map1);
    }
}
