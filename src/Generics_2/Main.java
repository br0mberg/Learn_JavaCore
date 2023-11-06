package Generics_2;

public class Main {
    public static void main(String[] args) {
        NumberContainer<Integer> intArray = new NumberContainer<>();
        intArray.addNumber(Integer.MAX_VALUE);
        intArray.addNumber(Integer.MIN_VALUE);

        NumberContainer<Double> doubleArray = new NumberContainer<>();
        doubleArray.addNumber(Double.MAX_VALUE);
        doubleArray.addNumber(Double.MIN_VALUE);

        intArray.printNumberOnIndex(1);
        intArray.printNumberOnIndex(0);

        doubleArray.printNumberOnIndex(1);
        doubleArray.printNumberOnIndex(0);
    }
}
