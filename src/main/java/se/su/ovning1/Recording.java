package se.su.ovning1;

public abstract class Recording implements PriceableWithVAT25 {
    private String artist;
    private int year;
    private String condition;
    private double price;

    public Recording(String name, String artist, int year, int condition,double price){
    }


    public String getArtist() {
        return artist;
    }

    public getType() //ABSTRAKT

    public int getCondition(){ }
    public getPrice(){ return price;}
    //attributet condition) som är ett värde
    //mellan 0 och 10, där 10 är perfekt skick och 0 representerar något osäljbart.
    //Värdet minskar med 10 procentenheter för varje steg, så något med startpriset
    //100 och slitaget 8 har vördet 80. Inga skivor kan dock f˚a ett värde under 10
    //kronor f¨
    //ore moms.

    @Override //??
    public String toString() {
        return super.toString(); }

    public int getYear() {
        return year;}

    protected double getOriginalPrice(){
        return price;
    }
}
