package org.example;

public class MinWindowSubstring {
    public static String minWindow(String s, String t) {
        if(t.length()>s.length())
            return "";
        int[] freq =new int[128];
        for(char c:t.toCharArray()){
            freq[c]++;
        }
        int left=0;
        int right=0;
        int minLength=Integer.MAX_VALUE;
        int minStart=0;
        int needed=t.length();
        while(right<s.length()){
            char r=s.charAt(right);
            if(freq[r]>0){
                needed--;
            }
            freq[r]--;
            right++;
            while(needed==0){
                if(right-left<minLength){
                    minLength=right-left;
                    minStart=left;
                }
                char l=s.charAt(left);
                freq[l]++;
                if(freq[l]>0){
                    needed++;
                }
                left++;
            }
        }
        if(minLength==Integer.MAX_VALUE)
            return "";
        else
            return s.substring(minStart,minLength+minStart);
    }
    public static void main(String[] args){
        String s="ADOBECODEBANC";
        String p="ABC";
        System.out.println(minWindow(s,p));
    }

}
