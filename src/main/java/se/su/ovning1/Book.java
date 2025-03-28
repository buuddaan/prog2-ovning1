package se.su.ovning1;

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

    public String getType() {
        return "Book";
    }
    @Override
    public String toString(){
        return String.format("Name = '%s', Author = '%s', Price = %.2f", super.getName(), author, price); //Kontrollera denna
    }

    public String getAuthor() {
        return author;
    }
    public boolean bound() {
        return bound;
    }

    @Override
    public double getPrice() {
        //Ska räkna ut priset på en bok
        if (bound()) {return price + COST_OF_BOUND;} //Plockar bort VAT6 uträkning här, kan räknas i Order???
        return price;
        }

}

