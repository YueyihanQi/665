package edu.bu.met.cs665.example1;

import java.util.ArrayList;
import java.util.List;


//This is the VendingMachine class.
//This class performs the beverage selection add integrity and price calculation functions.
public class VendingMachine {
    // using list to store selected beverages and integrity
    private final List<Beverage> selectedBeverages;
    private final List<Integrity> selectedIntegrity;

    //Constructor to initialize selectedBeverages and selectedIntegrity lists.
    public VendingMachine(){
        this.selectedBeverages =new ArrayList<>();
        this.selectedIntegrity =new ArrayList<>();
    }

    //Method to select a beverage category
    public void selectedBeverages(Beverage beverage) {
        selectedBeverages.add(beverage);
        System.out.println("Selected Beverage Category: " + beverage.getName());
    }

    //Getter
    public List<Beverage> getSelectedBeverages() {
        return selectedBeverages;
    }

    public List<Integrity> getSelectedIntegrity() {
        return selectedIntegrity;
    }

    //Method to select a specific beverage and choose temperature
    public void selectSpecificBeverages(Beverage beverage, boolean beverageTemperatureIsHot) {
        selectedBeverages.add(beverage); //select a specific beverage from the category just selected
        System.out.println("Selected Specific Beverage: " + beverage.getName() + "(Temperature: " + (beverageTemperatureIsHot ? "Hot" : "Cold") + ")"); // using ternary operator true is hot false is cold
    }


    //Method to select integrities to add and units
    public void addIntegrity(Integrity integrity, int unitsLevel) {
        //The range of the units level is from 0 to 3. Therefore, if the value is below 0, it will be set to 0; if it is above 3, it will be set to 3.
        if (unitsLevel < 0)
            unitsLevel = 0;
        else if (unitsLevel >3)
            unitsLevel = 3;
        selectedIntegrity.add(integrity);
        integrity.setUnitLevel(unitsLevel);
        System.out.println("Added " + unitsLevel + " units of " + integrity);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;

        for (Beverage beverage : selectedBeverages) { //using for loops to calculate all beverage price
            totalPrice += beverage.getPrice();
        }

        for (Integrity integrity : selectedIntegrity) { //using for loops to calculate all integrity price
            totalPrice += integrity.getUnitLevel() * integrity.getPrice(); //units multiply unit price
        }
        System.out.println("Total price is: " + totalPrice);
        return totalPrice;

    }

}
