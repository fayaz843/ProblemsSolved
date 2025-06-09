package org.example;

public class patternProgram {
    public static void main(String[] args){
        int row=5;
        int column=9;
        for(int i=0;i<row;i++){
            int a=1;
            int b=1;
            for(int j=0;j<column;j++){
                if(j!=0 && j%2!=0){
                    if((a==1 && i==0)||b==2){
                        System.out.print("*  ");
                        a=2;
                        b=1;
                    }
                    else if(b==1 && i==row-1){
                        System.out.print("   ");
                        b=2;
                    }
                    else{
                        System.out.print("   ");
                        a=1;
                    }
                }
                else{
                    System.out.print("*  ");
                }
            }
            System.out.println();
        }
    }
}
