/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class PaymentCard {
    private double balance;
    private final double affordable;
    private final double hearty;
    
    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
        this.affordable = 2.60;
        this.hearty = 4.60;
    }
    
    public void eatAffordably() {
        if (this.balance >= this.affordable) {
            this.balance = this.balance - this.affordable;
        }
    }
    
    public void eatHeartily() {
        if (this.balance >= hearty) {
            this.balance = this.balance - this.hearty;
        }
    }
    
    public void addMoney(double amount) {
        if (this.balance + amount >= 150) {
            this.balance = 150.0;
        } else if (amount < 0) {
            this.balance = this.balance + 0;
        } else this.balance = this.balance + amount;

    }
    
    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }
}
