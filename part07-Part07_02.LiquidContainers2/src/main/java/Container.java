
public class Container {
    
    private int amountOfLiquid;
    
    public Container() {
        amountOfLiquid = 0;
    }
    
    public int contains() {
        return amountOfLiquid;
    }
    
    public void add(int amount) {
        if (amountOfLiquid + amount >= 100) {
            amountOfLiquid = 100;
        } else if (amount < 0) {
            amountOfLiquid += 0;
        } else {
            amountOfLiquid += amount;
        }
        
    }
    
    public void remove(int amount) {
        if (amountOfLiquid - amount < 0) {
            amountOfLiquid = 0;
        }else if (amount < 0) {   
            amountOfLiquid -= 0;
        } else {
            amountOfLiquid -= amount;
        }
        
    }
    
    @Override
    public String toString() {
        return amountOfLiquid + "/100";
    }
}
