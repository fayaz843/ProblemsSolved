package org.example;

import org.testng.annotations.Test;

public class PyramidPattern {
    @Test(priority = 0)
    public void pyramid(){
        int row=5;
        for(int i=1;i<=5;i++) {
            for (int space = 1; space <= row - i; space++)
                System.out.print("  ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("* ");
            System.out.println();
        }
    }
    @Test(priority = 1)
    public void InversePyramid(){
        int row=5;
        for(int i=5;i>0;i--) {
            for (int space = 1; space <= row - i; space++)
                System.out.print("  ");
            for (int star = 1; star <= 2 * i - 1; star++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
