package com.nou;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("value=1");
//        } else if (value == 2) {
//            System.out.println("value=2");
//        } else {
//            System.out.println("was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1:
                System.out.println("value was 1");
                break;
            case 2:
                System.out.println("value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("it was a 3, or a 4, or a 5");
                System.out.println("actually it was a " + switchValue);
                break;
            default:
                System.out.println("was not 1 or 2");
                break;

        }

        char switchNew = 'A';

        switch (switchNew){
            case 'A':
                System.out.println("A was found");
                break;
            case 'B':
                System.out.println("B was found");
                break;
            case 'C': case 'D': case 'E':
                System.out.println(switchNew + " was found");
                break;

                default:
                    System.out.println("not found");
                    break;

        }

        String month = "JANUARy";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("jan");
                break;
            case "february":
                System.out.println("feb");
                break;
            default:
                System.out.println("i don't know");

        }
    }
}
