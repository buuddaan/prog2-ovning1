import se.su.ovning1.Item;

import java.util.*;
package se.su.ovning1;

public class Order extends Item { //hur lösa detta utan arv?
    //Ingår inte i arvshierarki?

    private final long orderNumber;
    private static long counter; //Texten i klasschemat är snedskrivet
    private final List<Item> items;

    //Konstruktor ska acceptera olika antal Item-object
    public Order(Item[] items){
        this.items = new ArrayList<>();
        //Mer funktionalitet
    }

    public double getTotalValue(){
        //Total pris utan moms
        return total; //Lägg till
    }

    public double getTotalValuePlusVAT(){
        //Totalpris + moms
        return getTotalValue() * //momsen
    }

    public String getReceipt(){
        //Hämtar en sträng om med orderns innehåll och totalpris
        // med och utan moms
        return receipt.toString();
    }

}

