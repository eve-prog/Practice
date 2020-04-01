package com;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrited = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrited + " new total print count for printer = " + printer.getPagesPrinted());
        pagesPrited = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrited + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
