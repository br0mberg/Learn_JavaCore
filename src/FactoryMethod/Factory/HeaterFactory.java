package FactoryMethod.Factory;

import FactoryMethod.Model.Heater;
import FactoryMethod.Model.HouseParametr;

public class HeaterFactory extends ParamFactory {
    @Override
    public HouseParametr createParametr() {
        return new Heater();
    }
}
