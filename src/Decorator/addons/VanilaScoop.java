package Decorator.addons;

import Decorator.IceCream;

import java.security.InvalidParameterException;

public class VanilaScoop implements IceCream {
    private IceCream iceCream;

    public VanilaScoop(IceCream iceCream) {

        if(iceCream == null)
            throw new InvalidParameterException();

        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 20;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Vanilla Scoop ";
    }
}
