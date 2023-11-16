package FactoryMethod.Model;

public class Heater implements HouseParametr {
    @Override
    public void execute(int value, House house) {
        house.setTemperature(value);
        System.out.println("Температура в доме теперь: " + value);
    }
}
