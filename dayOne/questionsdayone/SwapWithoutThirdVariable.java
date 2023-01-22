package com.dayOne.questionsdayone;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        int num2= sc.nextInt();
        int num3=0;
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println(num1+" "+num2);

    }
}
