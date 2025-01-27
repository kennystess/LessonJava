package src.Car;

public class Car {
    private final String make;
    private final String model;
    private final int year;
    private double mileage = 0;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public void increaseMileage(double additionalMileage) {
        mileage += additionalMileage;
    }

    public void displayInfo() {
        System.out.println("Марка автомобіля: " + make);
        System.out.println("Модель автомобіля: " + model);
        System.out.println("Рік випуску: " + year);
        System.out.println("Пробіг: " + mileage );
        System.out.println(" ");
    }
}

