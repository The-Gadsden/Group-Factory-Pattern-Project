package Tanks;

import java.util.ArrayList;

public abstract class Tank {      //Basic tank class defines what every tank has
    String name;
    ArrayList weapons = new ArrayList();
    public void prepareParts(){
        System.out.println("Preparing chasis...\n" +
                           "Preparing gun mount(s)...\n" +
                           "Preparing tank tracks...\n" +
                           "Parts Prepared!");
    }

    public void assemble(){
                          System.out.println("Assembling tank...\nTank assembled!");
    }

    public void fitTreads(){
        System.out.println("Fitting treads...\nTreads fitted!");
    }

    public void greaseTreads(){
        System.out.println("Greasing treads...\nTreads greased!");
    }

    public String getName(){
        return this.name;
    }

}
