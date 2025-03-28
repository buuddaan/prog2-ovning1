package se.su.ovning1;//eljo2851, mawa6612, mafa2209

public abstract class Recording extends Item implements PriceableWithVAT25 {
    // private static final int TO_DECIMAL = 10; Borttagen på grund av "fel antal medlemsvariabler i testfall", får ha magic number istället
    private final String artist;
    private final int year;
    private int condition;
    private final double price;

    protected Recording(String name, String artist, int year, int condition, double price){
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
        double price = 0;
        price = ((double) getCondition()/10) * getOriginalPrice();
        return price >= 10 ? price : 10;
    }


    @Override 
    public String toString() {
        return String.format("%s: name='%s', artist='%s', year=%d, condition=%d, original price=%.1f, price=%.1f, price+VAT=%.1f", getType(), super.getName(), getArtist(), getYear(), getCondition(), getOriginalPrice(), getPrice(), getPriceWithVAT());
    }

    public int getYear() {
        return year;}

    protected double getOriginalPrice(){
        return price;
    }
}
