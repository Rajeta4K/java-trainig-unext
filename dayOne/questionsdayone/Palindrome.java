package com.dayOne.questionsdayone;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int remainder,reverse=0,temp;
        temp=num;
        while(num>0)
        {
            remainder=num%10;
            reverse=(reverse*10)+remainder;
            num=num/10;


        }

        if(temp==reverse)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }

    }

}
