//eljo2851, mawa6612, mafa2209

public interface Priceable {

    double getPrice();

    default double getVAT() {
        return getVAT();
    }

    default double getPriceWithVAT() {
        return getPrice() + getPrice() * getVAT();
    }

 

}
