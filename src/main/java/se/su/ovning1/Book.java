package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6 {
    private String author;
    private boolean bound;
    private double price;

    public Book(String name, String author, double price, boolean bound) {
        super(name); //Syftar på name från Item-klassen (osäkert om detta funkar)
        this.author = author;
        this.bound = bound;
        this.price = price; //Koppla till PriceableVAT6 som implementerats för att lägga till 6% moms
    }

    public String getType(Book book) {
        return book.toString(); //Is this enough?
    }
    @Override
    public String toString(){
        return String.format("%s %s %.2f", super.toString(), author, price); //Kontrollera denna
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
        if (bound()) {return price * 1.3;} //Kanske ska beräkna mha VAT
        return price;
        }

    @Override
    public double getVAT() { //Måste finnas från interfacet PriceableVAT6
        return 0;
    }
}

