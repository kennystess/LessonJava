package src.Bank;

public class Bank {
    private final String name;
    private double balance = 0;
    private double interestRate = 0;

    public Bank(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Додано до балансу: " + amount);
            System.out.println();
        } else {
            System.out.println("Сума для внесення повинна бути за більшою 0: ");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Знято суму: " + amount);
            System.out.println(" ");
        } else if (amount > balance) {
            System.out.println("Недостатньо коштів на рахунку ");
        } else {
            System.out.println("сума для зняття повинна бути більшою за 0");
        }
    }

    public void applyInterest() {
        if (balance > 0) {
            balance += balance * (interestRate / 100);
            System.out.println("Збільшено баланс на відсоткову ставку: " + balance);
        }
    }

    public void displayInfo() {
        System.out.println("Вся інформація про банк:");
        System.out.println();
        System.out.println("1.Назва банку: " + name);
        System.out.println("2.Баланс рахунку: " + balance);
        System.out.println("3.Відсоткова ставкка: " + interestRate);
    }
}






