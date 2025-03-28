package se.su.ovning1;

public interface PriceableWithVAT6 extends Priceable {
    static final double VAT6 = 0.06;

    default double getVAT() { //Skrev ej public pga implicit, blev grått bara
        return VAT6;
    }
    //Metoden beöhver inte implementeras i klasserna pga att den är default



}
