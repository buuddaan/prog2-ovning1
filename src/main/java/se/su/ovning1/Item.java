package se.su.ovning1;

import java.awt.print.Printable;

public abstract class Item implements Priceable {
    //Abstract är det som gör att klassen inte kan instanseras
    private String name;

    protected Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



}
