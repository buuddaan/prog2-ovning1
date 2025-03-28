package se.su.ovning1;

public interface PriceableWithVAT25 extends Priceable {
    static final double VAT25 = 0.25;

    default double getVAT() { //Skrev ej public pga implicit, blev grått bara
        return VAT25;
    }
}
