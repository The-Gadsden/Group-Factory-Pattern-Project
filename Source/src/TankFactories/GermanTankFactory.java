package TankFactories;

import Tanks.*;

public class GermanTankFactory extends TankFactory {
    public Tank createTank(final String type) {
        if (type.equals("Panzer")) {
            return new Panzer();
        }
        return null;
    }
}
