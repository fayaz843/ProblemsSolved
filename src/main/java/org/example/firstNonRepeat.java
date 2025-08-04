package org.example;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class firstNonRepeat {
    public static void main(String[] args){
        String s= "Hi I am Ahamed";
        LinkedHashMap<String, Long> wordsCountMap = Arrays.stream(s.split("")).map(String::toLowerCase).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(wordsCountMap);
        for(Map.Entry<String,Long> entry:wordsCountMap.entrySet()){
            if(entry.getValue()==1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
