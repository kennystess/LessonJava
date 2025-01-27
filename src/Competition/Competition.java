package src.Competition;

import java.util.Scanner;

public class Competition {
    public boolean checkAge(int age) {
        return age >= 18 && age <= 35;
    }

    public boolean checkNationality(String nationality) {
        return nationality.equalsIgnoreCase("Україна") ||
                nationality.equalsIgnoreCase("Туреччина") ||
                nationality.equalsIgnoreCase("Грузія");
    }

    public boolean checkOrder(String order) {
        return order != null && !order.trim().isEmpty();
    }

    public boolean blackList(String surname) {
        return surname.equalsIgnoreCase("Путін") ||
                surname.equalsIgnoreCase("Лукашенко");
    }
}
