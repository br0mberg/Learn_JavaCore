package Generics_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имена машины и мотоцикла построчно:\n");

        Garage<Car> carGarage = new Garage<>();
        Garage<Motorcycle> motorcycleGarage = new Garage<>();

        String carName = scanner.nextLine();
        String motorcycleName = scanner.nextLine();

        carGarage.printName(new Car(carName));
        motorcycleGarage.printName(new Motorcycle(motorcycleName));
    }
}
