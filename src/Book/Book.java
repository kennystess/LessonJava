package src.Book;

public class Book {
    private final String title;
    private final String author;
    private int yearPublished = 0;
    private double price = 0;

    public Book(String title, String author, int yearPublished, double price) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }

    public void discountPrice(double discount) {
        if (price > 0 && discount <= price) {
            price = price - discount;
            System.out.println("Знижка застосована. Нова ціна: " + price);
            System.out.println();
        } else if (discount > price) {
            System.out.println("Знижка не може бути вищою за ціну. ");
            System.out.println();
        } else {
            System.out.println("Знижка повинна бути більшою за 0. ");
            System.out.println(" ");
        }
    }

    public void displayInfo() {
        System.out.println("Вся інформацію про книгу: ");
        System.out.println("Назва: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Рік видання: " + yearPublished);
        System.out.println("Ціна: " + price);
    }
}

