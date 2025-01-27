import Table.Table;

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Table table = new Table();

    while (true) {
        System.out.println("Напиши число N від 1 до 10: ");
        System.out.println(" ");
        int num = scanner.nextInt();

        if (num >= 1 && num <= 10) {
            table.Generate(num);
            break;
        } else {
            System.out.println("!!!ПОМИЛКА!!Введіть число знову: ");
        }
    }
    scanner.close();
}

