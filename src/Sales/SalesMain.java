package src.Sales;

import src.Sales.Sales;

import java.util.Scanner;

public class SalesMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter total price: ");
        double totalPrice = scanner.nextDouble();

        System.out.print("Are you VIP client? ");
        boolean isVip = scanner.nextBoolean();

        var discount = Sales.getDiscount(totalPrice, isVip);

        System.out.println(" ");
        System.out.println("Total price before discount: " + totalPrice);
        System.out.println("Discount: " + discount * 100 + "%");
        System.out.println("Total price after discount: " + (totalPrice - totalPrice * discount));
    }
}