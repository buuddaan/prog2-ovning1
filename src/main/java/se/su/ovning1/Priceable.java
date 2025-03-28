package se.su.ovning1;
//Är en helt abstrakt klass
public interface Priceable {

    double getPrice();

    default double getVAT() {
        return 0.0;
    }

    default double getPriceWithVAT() {
        return 0.0;
    }

 //OBS FRÅGETECKEN KRING DENNA

}
