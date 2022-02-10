package TankFactories;

import Tanks.*;

public abstract class TankFactory{
    public Tank orderTank(final String type) {
        Tank tank;
        tank = createTank(type);
        /*tank.prepare();
        tank.bake();
        tank.cut();
        tank.box();*/
        return tank;
    }
    abstract Tank createTank(String type);
}

