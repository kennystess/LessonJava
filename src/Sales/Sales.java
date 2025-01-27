package src.Sales;

import java.util.Scanner;

public class Sales {
    public static double getDiscount(double totalPrice, boolean isVip) {
        double discount = 0;

        if (totalPrice > 10_000) {
            discount = 0.15;
        } else if (totalPrice > 5000) {
            discount = 0.10;
        } else if (totalPrice > 1000) {
            discount = 0.05;
        }
        if (isVip) {
            discount += 0.05;
        }

        return discount;
    }
}