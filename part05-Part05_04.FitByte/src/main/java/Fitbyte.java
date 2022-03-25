/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Fitbyte {
   private int age;
   private int restingHeartRate;
   
   public Fitbyte(int age, int restingHeartRate) {
       this.age = age;
       this.restingHeartRate = restingHeartRate;
   }
   
   public double maxHeartRate() {
       return 206.3 - (0.711 * this.age);
   }
   
   public double targetHeartRate(double percentage) {
       return (maxHeartRate() - this.restingHeartRate) * (percentage) + this.restingHeartRate;
   }
   
//   @Override
//  public String toString() {
//      return "Target " + (percentage * 100) + "% of maximum " + targetHeartRate();
//   }
}
