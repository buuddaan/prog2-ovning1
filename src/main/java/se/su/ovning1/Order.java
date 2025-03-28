//eljo2851, mawa6612, mafa2209
import java.util.*;

public class Order{ //hur lösa detta utan arv?
    //Ingår inte i arvshierarki?

    private final long orderNumber;
    private static long counter; 
    private final List<Item> items;

    public Order(Item... items){
        this.items = new ArrayList<>();
        this.orderNumber = counter++;
        //for each i in items, add item to list + räkna upp
        if (items != null){
            for(Item item : items){
                this.items.add(item);
            }
        }
    }
    public double getTotalValue(){
        double totalValue = 0;
        for(Item item : items){
            if (item != null){
                totalValue += item.getPrice();
            }
        }
        return totalValue;
    }

    public double getTotalValuePlusVAT() {
        double totalValuePlusVAT = 0;
        for(Item item : items){
            totalValuePlusVAT += item.getVAT()*item.getPrice();
        }
        return getTotalValue() + totalValuePlusVAT;
    }

    public String getReceipt(){
        String receipt = "Receipt for order #" + orderNumber+ "\n-----------\n";

        for(Item item : items){
            receipt += item + "\n";
            }
        
        return receipt + "\nTotal excl. VAT: " + getTotalValue() + "\nTotal incl. VAT: " + getTotalValuePlusVAT();
    }

}

