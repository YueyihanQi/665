package edu.bu.met.cs665.example1;

//This is the Integrity class.
//This class represents integrities and includes two subclass: milk and sugar.
public class Integrity {
    // Overrides the toString() method to customize the string representation of the Integrity object.
    // This ensures that when the object is printed, its properties are displayed instead of its hash code.
    @Override
    public String toString() {
        return name + " (" + price + " per unit)";
    }

    private String name;
    private  double price;
    private  int unitsLevel; // add units levels range from 0-3

    //Getter methods
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getUnitLevel() {
        return unitsLevel;
    }

    //Setter methods
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setUnitLevel(int unitsLevel) {
        this.unitsLevel = unitsLevel;
    }

    //Create an integrity object using name price and unitsLevel.
    public  Integrity(String name, double price, int unitsLevel){
        this.name=name;
        this.price=price;
        this.unitsLevel=unitsLevel;
    }
}

//two subclass of beverage indicate two categories of integrity
class Milk extends Integrity{ //extend from Integrity
    public Milk(String name, double price, int unitsLevel){
        super(name, price, unitsLevel);
    } // reference the parent class member variables
}

class Sugar extends Integrity{
    int unitsLevel;
    public Sugar(String name,double price,int unitsLevel){
        super(name, price, unitsLevel);
    }
}