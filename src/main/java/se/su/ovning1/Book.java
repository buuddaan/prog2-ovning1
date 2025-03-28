//eljo2851, mawa6612, mafa2209
public class Book extends Item implements PriceableWithVAT6 {
    private static final double COST_OF_BOUND = 1.3;
    private final String author;
    private final boolean bound;
    private final double price;

    public Book(String name, String author, double price, boolean bound) {
        super(name);
        this.author = author;
        this.bound = bound;
        this.price = price;

    }

    protected String getType() {
        return "Book";
    }
    @Override
    public String toString(){
        return String.format("%s: name='%s', author='%s', bound=%b, price=%.1f, price+VAT=%.1f", getType(), super.getName(), author, bound, getPrice(), getPriceWithVAT()); //Kontrollera denna
    }

    protected String getAuthor() {
        return author;
    }
    protected boolean bound() {
        return bound;
    }

    @Override
    public double getPrice() {
        //Ska räkna ut priset på en bok
        if (bound()) {return price * COST_OF_BOUND;}
        return price;
        }

}

