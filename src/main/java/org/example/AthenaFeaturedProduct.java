package org.example;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AthenaFeaturedProduct {
    public static void main(String[] args){
        List<String> products= Arrays.asList("redShirt","greenPants","redShirt","orangeShoes","blackPants","blackPants");
        Map<String,Long> countMap=products.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        Map<String,Long> finalMap=countMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry<String,Long>::getValue,Comparator.reverseOrder()).thenComparing(Map.Entry::getKey,Comparator.reverseOrder())).limit(1).collect(Collectors.toMap(Map.Entry<String,Long>::getKey,Map.Entry::getValue,(e1, e2) -> e1,LinkedHashMap::new));
        finalMap.forEach((a,b)-> System.out.println(a));
    }
}
