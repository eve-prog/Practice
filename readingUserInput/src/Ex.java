import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex {
    public static void main(String[] args) {
//Write a program that calculates the expenses for yard greening.
//The price for one square meter is 7.61 dollars with VAT.
//The company offers 18% discount from the total price
//Single line from the console:
//Square meters which will be greening - float-pointing number in range [0.00… 10000.00] 540
//output//Print on the console two lines:
//"The final price is: {total price} dollars"
//"The discount is: {discount} dollars"
//Prices should be formatted to the second decimal point.
//The final price is: 3369.71 dollars
//The discount is: 739.69 dollars
//Comments
//Calculate the price for greening the whole yard: 540 * 7.61 = 4109.40 $
//Calculate the discount: 0.18 * 4109.40 = 739.69 $
//Calculate the final price: 4109.40 – 739.69 = 3369.71 $

        Scanner scanner = new Scanner(System.in);
        double squareMetersGreening = Double.parseDouble(scanner.nextLine());
        double priceGreening = squareMetersGreening * 7.61;
        double discount = priceGreening * 0.18;
        double finalPrice = priceGreening - discount;

        System.out.printf("The final price is: %.2f dollars%n", finalPrice);
        System.out.printf("The discount is: %.2f dollars", discount);





        




    }
}
