package edu.bu.met.cs665.example1;

//This is the Beverage class.
//This class represents a beverage and includes two subclass: Coffee and Tea.
public class Beverage {
    private String name;
    private  double price;
    private  boolean beverageTemperatureIsHot; //Using boolean to indicate hot or cold

    //Getter methods
    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }

    public boolean isBeverageTemperatureIsHot() {
        return beverageTemperatureIsHot;
    }

    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setBeverageTemperatureIsHot(boolean beverageTemperatureIsHot) {
        this.beverageTemperatureIsHot = beverageTemperatureIsHot;
    }

    //Create a beverage object using name and price.
    //By default, the beverage temperature is set to cold
    public  Beverage(String name, double price, boolean beverageTemperatureIsHot){
        this.name=name;
        this.price=price;
        this.beverageTemperatureIsHot=false;//false is cold and true is hot
    }
}

//two subclass of beverage indicate two categories of beverage
class Coffee extends Beverage{
    private final String coffeeType; // Declared as final since it is assigned in the constructor and not modified later

    //Constructor for Coffee
    public Coffee(String name,double price,boolean beverageTemperatureIsHot, String coffeeType){
        super(name, price, beverageTemperatureIsHot);
        this.coffeeType=coffeeType;
    }
}

class Tea extends Beverage{
    private final String teaType;

    //Constructor for Tea
    public Tea(String name,double price, boolean beverageTemperatureIsHot, String teaType){
        super(name, price,beverageTemperatureIsHot);
        this.teaType=teaType;
    }
}
