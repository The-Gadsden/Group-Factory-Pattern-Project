import TankFactories.*;
import Tanks.*;


public class Main {

    public static void main(String[] args){
        AmericanTankFactory amerTnkFac1 = new AmericanTankFactory();
        Tank tank1 = amerTnkFac1.orderTank("Abrams");
        AmericanTankFactory amerTnkFac2 = new AmericanTankFactory();
        Tank tank2 = amerTnkFac2.orderTank("Bradley");

        GermanTankFactory germTnkFac = new GermanTankFactory();
        Tank tank3 = germTnkFac.orderTank("Panzer");



    }


}
