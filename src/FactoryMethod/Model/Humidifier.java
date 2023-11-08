package FactoryMethod;

public class Humidifier extends HouseParametr{
    @Override
    public void execute(int value, House house) {
        house.setHumidity(value);
        System.out.println("Влажность установлена на значение:" + value);
    }

    @Override
    public HouseParametr createParametr() {
        return new Humidifier();
    }
}
