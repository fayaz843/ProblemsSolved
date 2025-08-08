package org.example;

public class stringCheck{
    public static void main(String[] args){
        try{
            String s=null;
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            String m=s.toString();
            System.out.println(4);
        }catch (Exception e){
            System.out.println(5);

        }
        System.out.println(6);
    }
}
