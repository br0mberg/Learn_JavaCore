package FactoryMethod.Model;

public class Humidifier implements HouseParametr {
    @Override
    public void execute(int value, House house) {
        house.setHumidity(value);
        System.out.println("Влажность установлена на значение:" + value);
    }
}
