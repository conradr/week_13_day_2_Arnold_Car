package vehicles;

import upgrades.Aircon;
import upgrades.Engine;
import upgrades.IUpgradable;

import java.util.ArrayList;

public abstract class Car implements IUpgradable {
    private String model;
    private int price;
    private String fuelType;
    private String color;

    private double condition;

    private ArrayList<IUpgradable> upgrades;


    public Car(String model, int price, String fuelType, String color, double condition) {
        this.model = model;
        this.price = price;
        this.fuelType = fuelType;
        this.color = color;
        this.condition = condition;
        this.upgrades = new ArrayList<IUpgradable>();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public double getSalePrice(Car car) {
        double currentCondition = car.condition / 100;
        double salePrice = car.getPrice() * currentCondition;
        return salePrice;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCondition() {
        return condition;
    }

    @Override
    public void upgrade(IUpgradable itemToUpgrade) {
        this.upgrades.add(itemToUpgrade);
    }
}
