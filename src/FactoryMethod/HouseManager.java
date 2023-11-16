package FactoryMethod;

import FactoryMethod.Factory.HeaterFactory;
import FactoryMethod.Factory.HumidifierFactory;
import FactoryMethod.Factory.ParamFactory;
import FactoryMethod.Model.Heater;
import FactoryMethod.Model.House;
import FactoryMethod.Model.HouseParametr;

import java.util.Scanner;

public class HouseManager {
    public static ParamFactory parametrFactory;
    public static void updateParametr(Scanner scanner) {

        String choice = scanner.nextLine();
        switch(choice) {
            case "temperature":
                parametrFactory = new HeaterFactory();
                break;
            case "humidify":
                parametrFactory = new HumidifierFactory();
                break;
            default:
                System.out.println("Параметр не распознан");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        House house = new House();

        updateParametr(scanner);
        HouseParametr houseParametr = parametrFactory.createParametr();

        System.out.println("Введите значение: ");
        houseParametr.execute(scanner.nextInt(), house);
    }
}
