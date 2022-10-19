package dealership;


import vehicles.Car;

import java.util.ArrayList;

public abstract class Dealership {
   private String name;
   private int wallet;
   public ArrayList<Car> garage;

   public Dealership(String name, int wallet) {
      this.name = name;
      this.wallet = wallet;
      this.garage = new ArrayList<Car>();
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public int getWallet() {
      return wallet;
   }

   public void setWallet(int wallet) {
      this.wallet = wallet;
   }

   public ArrayList<Car> getGarage() {
      return garage;
   }

   public void setGarage(ArrayList<Car> garage) {
      this.garage = garage;
   }

   public void buyCar(Car car){
      garage.add(car);
   }

   public void addCarToGarage(Car car) {
      garage.add(car);
   }

   public void removeCarFromGarage(Car car) {
      garage.remove(car);
   }

   public void addMoneyToWallet(Car car) {
      double amount = car.getSalePrice(car);
      this.wallet += amount;

   }

   public void removeMoneyFromWallet(Car car) {
      int amount = car.getPrice();
      this.wallet -= amount;
   }
}
