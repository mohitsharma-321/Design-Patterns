package Decorator;

import Decorator.addons.ChocoScoop;
import Decorator.addons.VanilaScoop;
import Decorator.cones.ChocoCone;
import Decorator.cones.OrangeCone;
import Decorator.cones.VanillaCone;

public class Client {

    public static void main(String[] args) {
        IceCream iceCream = new ChocoScoop(
                new VanilaScoop(
                    new OrangeCone(
                        new ChocoCone()
                        )
                    )
                );

        System.out.println(iceCream.getCost());
        System.out.println(iceCream.getDescription());
        System.out.println(iceCream.getClass());
    }
}
