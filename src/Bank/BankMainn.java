package src.Bank;

import src.Bank.Bank;

public class BankMainn {
    public static void main(String[] args) {
        Bank bank = new Bank("Пумб", 500.0, 10.0);
        bank.displayInfo();
        bank.deposit(100.0);
        bank.withdraw(50.0);
        bank.applyInterest();
        bank.displayInfo();
    }
}
