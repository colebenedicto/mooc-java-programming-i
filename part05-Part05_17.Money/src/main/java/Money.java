
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }
    
    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;
        
        Money newMoney = new Money(newEuros, newCents);
        
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        
        if (this.euros > compared.euros) {
            return false;
        }
        
        if (this.euros == compared.euros) {
            if (this.cents > compared.cents) {
                return false;
            }
        }
        
        return true;
    }
    
    public Money minus(Money compared) {    
        int difInEuros = this.euros - compared.euros;
        int difInCents = this.cents - compared.cents;
        
        if (difInCents < 0) {
            difInCents = 100 - compared.cents;
            difInEuros = (this.euros - compared.euros) - 1;
        }
        
        if ((difInEuros < 0) || (difInEuros == 0 && difInCents < 0)) {
            difInEuros = 0;
            difInCents = 00;
        }
        
        Money difference = new Money(difInEuros, difInCents);
        
        return difference;
    }
    
    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
