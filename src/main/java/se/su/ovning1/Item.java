package se.su.ovning1;


public abstract class Item implements Priceable {
    //Abstract är det som gör att klassen inte kan instanseras
    private final String name;

    protected Item(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    //Hur kalla på de undre getType?




