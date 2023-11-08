package FactoryMethod;

public class Heater extends HouseParametr{
    @Override
    public void execute(int value, House house) {
        house.setTemperature(value);
        System.out.println("Температура в доме теперь: " + value);
    }

    @Override
    public HouseParametr createParametr() {
        return new Heater();
    }
}
