package FactoryMethod;

public abstract class HouseParametr {
    public abstract void execute(int value, House house);
    public abstract HouseParametr createParametr();
}
