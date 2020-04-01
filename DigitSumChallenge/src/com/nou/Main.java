package com.nou;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sum of digits in number 125 is: "  + sumDigits(125));
        }
    private static int sumDigits (int number){

        if (number < 10){
            return -1;
        }

        int sum = 0;


        //taie ultima cifra
        // 125 ->
        // 125 / 10 = 12,5 -> restul impartirii este 5 = prima cifra
        // 12 / 10 = 1,2 -> restul impartirii este 2 = a doua cifra
        // 1 / 10 = 0,1 -> restul impartirii este 1 = a3a cifra
        //=> 5 + 2 + 1 = 8

        // nr < 10 => 1 cifra

        while(number > 0){
            //extract the least-significant digit
           int digit = number % 10;
           sum += digit;

           //drop the least-significant digit
           number /= 10; //same as number = number / 10

        }

        return sum;



    }
}
