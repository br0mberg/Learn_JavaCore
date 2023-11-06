package Generics_1;

public class Garage<T extends Vehicle> {
    public void printName(T vehicle) {
        System.out.println(vehicle.getName());
    }
}
