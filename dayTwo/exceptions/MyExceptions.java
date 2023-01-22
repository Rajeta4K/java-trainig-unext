package com.dayTwo.exceptions;

public class MyExceptions {
    public void division(int num1, int num2) {
        try {
            int div=num1/num2;
            System.out.println(div);
        }catch(Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("It's finally");
        }// compulsory clause

        System.out.println("hi");

    }
}
