package org.example;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamOperations {
    public static void main(String[] args){
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(5,"ahamed");
        hm.put(6,"fayaz");
        hm.put(1,"noorea");

        LinkedHashMap<Integer, String> collect = hm.entrySet().stream().sorted(Map.Entry.<Integer, String>comparingByKey().reversed())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));
        System.out.println(collect);
    }
}
