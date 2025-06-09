package org.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class occuranceOfCharacters {
    public static void main(String[] args){
        String s="fayaz";
        LinkedHashMap<Character,Integer> countMap=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            countMap.put(s.charAt(i),(countMap.getOrDefault(s.charAt(i),0))+1);
        }
        System.out.println(countMap);

        //Using streams
        Map<String,Long> streamCountMap=new HashMap<>();
        streamCountMap=Arrays.stream(s.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
        System.out.println(streamCountMap);
    }
}
