package org.example;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class reverseStringInStreams {
    public static void main(String args[]){
        String originalString="ahamed";
        String reversedString=Stream.of(originalString)
                .map(String->
                        new StringBuilder(originalString)
                .reverse()).collect(Collectors.joining(originalString));
        System.out.println(reversedString);
    }
}
