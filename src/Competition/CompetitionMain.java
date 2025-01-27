package src.Competition;

import java.util.Scanner;

public class CompetitionMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вік учасника: ");
        int age = scanner.nextInt();

        System.out.print("Введіть громадянство учасника: ");
        String nationality = scanner.next();

        System.out.print("Введіть номер заявки: ");
        String order = scanner.next();

        System.out.print("Введіть прізивще учасника: ");
        String surname = scanner.next();

        Competition competition = new Competition();

        boolean ageValid = competition.checkAge(age);
        boolean nationalityValid = competition.checkNationality(nationality);
        boolean orderValid = competition.checkOrder(order);
        boolean blacklistt = competition.blackList(surname);

        if (ageValid && nationalityValid && orderValid && !blacklistt) {
            System.out.println("Учасник допущений до конкурсу ");
        } else {
            System.out.println("Учасник не допущений до конкурсу ");
        }
        scanner.close();
    }

}
