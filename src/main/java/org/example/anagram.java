package org.example;

//Input: word = "listen", list = ["enlist", "google", "inlets", "banana"]
//Output: ["enlist", "inlets"]

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class anagram {
    public static void main(String[] args){
        ArrayList<String> wordList=new ArrayList<String>();
        wordList.add("enlist");
        wordList.add("google");
        wordList.add("inlets");
        wordList.add("bananan");
        wordList.add("sten");
        String word="listen";
        List<String> letterList= Arrays.stream(word.split("")).toList();
        ArrayList<String> answerList=new ArrayList<String>();
        for(int i=0;i< wordList.size();i++){
            List<String> wordLetterList= Arrays.stream(wordList.get(i).split("")).toList();
            int count=0;
            for(int j=0;j<wordLetterList.size();j++){
                if(letterList.contains(wordLetterList.get(j))){
                    count++;
                }
            }
            if(count==letterList.size()){
                answerList.add(wordList.get(i));
            }
        }
        System.out.print(answerList);
    }
}
