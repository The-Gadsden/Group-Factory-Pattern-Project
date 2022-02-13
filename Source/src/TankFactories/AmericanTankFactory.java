package TankFactories;

import Tanks.*;

public class AmericanTankFactory extends  TankFactory {
    public Tank createTank(final String type) {
        if (type.equals("Abrams")) {
            return new Abrams();
        } else if (type.equals("Bradley")) {
            return new Bradley();
        }
        return null;
    }


}
