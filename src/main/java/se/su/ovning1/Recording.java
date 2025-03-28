package se.su.ovning1;
//LÄGG 0.25
public abstract class Recording extends Item implements PriceableWithVAT25 {
    private static final int TO_DECIMAL = 10;
    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition,double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getCondition(){
        return condition;
    }

    public double getPrice(){
        return ((double) getCondition()/TO_DECIMAL) * price;

    }


    @Override //??
    public String toString() {
        return String.format("Name = %s, Artist = '%s', Year = %d, Condition %d, Price = %.2f", super.getName(), getArtist(), getYear(), getCondition(), getPrice());
    }

    public int getYear() {
        return year;}

    protected double getOriginalPrice(){
        return price;
    }
}
