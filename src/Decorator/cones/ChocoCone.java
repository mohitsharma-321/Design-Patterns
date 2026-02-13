package Decorator.cones;

import Decorator.IceCream;

import java.security.InvalidParameterException;

public class ChocoCone implements IceCream {
    private IceCream iceCream;
    public ChocoCone(){}

    public ChocoCone(IceCream iceCream) {

        if(iceCream == null) {
            throw new InvalidParameterException();
        }
        this.iceCream = iceCream;
    }
    @Override
    public int getCost() {
        int cost = ConeCosts.CHOCO_CONE;

        if(iceCream != null)
            cost += iceCream.getCost();

        return cost;
    }

    @Override
    public String getDescription() {
        String description = "Chocolate Cone";

        if(iceCream != null) {
            description = iceCream.getDescription() + " " + description;
        }
        return description;
    }
}
