package FactoryMethod.Factory;

import FactoryMethod.Model.HouseParametr;
import FactoryMethod.Model.Humidifier;

public class HumidifierFactory extends ParamFactory{
    @Override
    public HouseParametr createParametr() {
        return new Humidifier();
    }
}
