package src.Car;

import src.Car.Car;

public class CarMain {
    public static void main(String[] args) {
        Car car = new Car("BMW", "X5", 2010);
        car.increaseMileage(10678.056);
        car.displayInfo();
    }
}
