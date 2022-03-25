
import java.util.ArrayList;


public class Suitcase {
    private int maxWeight;
    private ArrayList<Item> items;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        items = new ArrayList<>();
    }
    
    public void addItem(Item item) {
        if (item.getWeight() + totalWeight() <= this.maxWeight) {
            items.add(item);
        }
    }
    
    public int totalWeight() {
        int totalWeight = 0;
        
        for (Item item : items) {
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        if (items.isEmpty()) {
            return null;
        }
        
        Item heaviest = new Item("name", 0);
        
        for (Item item : items) {
            if (heaviest.getWeight() < item.getWeight()) {
                heaviest = item;
            }
        }
        
        return heaviest;
    }
    
    @Override
    public String toString() {
        String weightOutput = " (" + totalWeight() + "kg)";
        String itemOutput = "";

        if (items.isEmpty()) {
            itemOutput = "no items";
        } else if (items.size() == 1) {
            itemOutput = "1 item";
        } else {
            itemOutput = items.size() + " items";
        }

        return itemOutput + weightOutput;
    }
    
}
