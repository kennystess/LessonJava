import src.Book.Book;

public static void main(String[] args) {
    Book book = new Book("Тіні забутих предків", "Михайло Коцюбинських", 1911, 300);
    book.displayInfo();
    book.discountPrice(50.0);
    book.displayInfo();
}
