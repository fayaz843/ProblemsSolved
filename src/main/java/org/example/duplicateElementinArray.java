package org.example;

import org.testng.annotations.Test;

import java.util.HashSet;

public class duplicateElementinArray {
    @Test
    public void findDuplicateArray(){
        int a[]={3,4,2,3,2,4,5,6};
        HashSet<Integer> hs=new HashSet();
        for(int i:a){
            if(hs.add(i)==false)
                System.out.print(i);
        }
    }
}
