package se.su.ovning1;//eljo2851, mawa6612, mafa2209
import java.time.LocalDate;

public class LongPlay extends Recording {
    private static final double YEARLY_PRICE_INCREASE = 5.0;

    public LongPlay(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price);
    }

    @Override
    public String getType() {
        return "LP";
    }
    
    
    @Override
    public double getPrice() {
        int currentYear = LocalDate.now().getYear(); //Ej final pga uppdateras årligen. Lägg på klassnivå om nödvändigt
        return super.getPrice() + (currentYear - super.getYear()) * YEARLY_PRICE_INCREASE;
    }
}
