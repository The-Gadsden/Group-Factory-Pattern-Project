import TankFactories.*;
import Tanks.*;


public class Main {

    public static void main(String[] args){
        AmericanTankFactory amerTnkFac1 = new AmericanTankFactory();
        Tank tank1 = amerTnkFac1.orderTank("Abrams");
        System.out.println("The "+ tank1.getName()+" tank is ready");
        AmericanTankFactory amerTnkFac2 = new AmericanTankFactory();
        Tank tank2 = amerTnkFac2.orderTank("Bradley");
        System.out.println("The "+ tank2.getName()+" tank is ready");
        GermanTankFactory germTnkFac = new GermanTankFactory();
        Tank tank3 = germTnkFac.orderTank("Panzer");
        System.out.println("The "+ tank3.getName()+" tank is ready");


    }


}
