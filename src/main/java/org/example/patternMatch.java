package org.example;

import org.testng.annotations.Test;

import java.util.ArrayList;

public class patternMatch {
    @Test
    public void patternMatchCheck(){
        String[] string1 = {"cat", "dog", "Tiger", "tat", "Lion"};
        String[] string2 = {"?at", "?on"};

        // List to store results
        ArrayList<Integer> result = new ArrayList<>();
        for(String s:string2){
            String string=s.replace("?","");
            int count=0;
            for(String o:string1){
                if(o.contains(string)){
                    count++;
                }
            }
            result.add(count);
        }
        System.out.println(result);
    }
}
