
import java.util.ArrayList;


public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> cases;
    private int currentWeight = 0;

    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.cases = new ArrayList<>();
    }

    public void addSuitcase(Suitcase suitcase) {
        if (suitcase.totalWeight() + currentWeight <= maxWeight) {
            cases.add(suitcase);
            currentWeight += suitcase.totalWeight();
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : cases) {
            suitcase.printItems();
        }
    }
    
    @Override
    public String toString() {
        return cases.size() + " suitcases (" + currentWeight + " kg)";
    }
    
}
