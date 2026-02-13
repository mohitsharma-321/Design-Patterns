package Decorator.addons;

import Decorator.IceCream;
import Decorator.cones.ChocoCone;

import java.security.InvalidParameterException;

public class ChocoScoop implements IceCream {
    private IceCream iceCream;

    public ChocoScoop(IceCream iceCream) {

        if(iceCream == null)
            throw new InvalidParameterException();

        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        return iceCream.getCost() + 30;
    }

    @Override
    public String getDescription() {
        return iceCream.getDescription() + " Choco Scoop ";
    }
}
