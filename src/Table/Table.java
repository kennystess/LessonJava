package Table;

import java.util.Scanner;

public class Table {
    public void Generate(int num) {
        System.out.println("Таблиця множення: " + num);

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
