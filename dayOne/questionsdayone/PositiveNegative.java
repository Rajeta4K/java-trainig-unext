package com.dayOne.questionsdayone;

import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        if(num<0)
        {
            System.out.println("Negative");
        }
        else if(num==0) {
            System.out.println("Zero");
        }
        else
        {
            System.out.println("Positive");
        }

    }
}
