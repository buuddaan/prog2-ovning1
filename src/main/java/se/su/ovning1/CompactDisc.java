package se.su.ovning1;//eljo2851, mawa6612, mafa2209
public class CompactDisc extends Recording {

    public CompactDisc(String name, String artist, int year, int condition, double price) {
        super(name, artist, year, condition, price); //Denna konstruktor använder recodings konstruktor
    }
    
    

    //Behöver nog inte ha getPrice om det räknas på samma sätt som i superklassem, den ärver alla metoder

    @Override
    public String getType() {
        return "CD";
    }
}
