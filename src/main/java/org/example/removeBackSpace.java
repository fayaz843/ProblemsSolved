package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class removeBackSpace {
    public static void main(String[] args) {
        String s = "#an#jdk#d#";
        StringBuilder sb = new StringBuilder();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (!(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')) {
                l.add(i);
                System.out.println(i);
                if (i != 0) {
                    l.add(i - 1);
                }
            }
        }
        System.out.println(l);
        for (int i = 0; i < s.length(); i++) {
            if (l.contains(i) == false) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
    }
}
