//eljo2851, mawa6612, mafa2209

public interface PriceableWithVAT25 extends Priceable {
    static final double VAT25 = 0.25;

    default double getVAT() { 
        return VAT25;
    }
}
