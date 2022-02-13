package TankFactories;

import Tanks.*;

public abstract class TankFactory{
    public Tank orderTank(final String type) {
        Tank tank;
        tank = createTank(type);
        tank.prepareParts();
        tank.assemble();
        tank.fitTreads();
        tank.greaseTreads();
        System.out.println("Tank Ready!");
        return tank;
    }
    abstract Tank createTank(String type);


}

