package Tanks;

import java.util.ArrayList;

public abstract class Tank {
    String name;
    ArrayList weapons = new ArrayList();
    public void prepareParts(){
        System.out.println("Preparing chasis...");
        System.out.println("Preparing gun mount(s)...");
        System.out.println("Preparing tank tracks...");
        System.out.println("Parts Prepared!");
    }

    public void assemble(){}
    public void fitTreads(){}
    public void greaseTreads(){
        System.out.println("Greasing treads...\n ");
    }

    public String getName(){
        return this.name;
    }

}
