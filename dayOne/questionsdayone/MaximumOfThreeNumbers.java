package com.dayOne.questionsdayone;

import java.util.Scanner;

public class MaximumOfThreeNumbers {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int firstNum =sc.nextInt();
        int secondNum = sc.nextInt();
        int thirdNum = sc.nextInt();
        if(firstNum>secondNum && firstNum>thirdNum)
        {
            System.out.println(firstNum);
        }

        else if(secondNum>thirdNum)
        {
            System.out.println(secondNum);
        }
        else
        {
            System.out.println(thirdNum);
        }

    }
}
