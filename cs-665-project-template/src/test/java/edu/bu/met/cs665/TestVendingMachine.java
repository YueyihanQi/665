package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import edu.bu.met.cs665.example1.Main;
import edu.bu.met.cs665.example1.VendingMachine;
import org.junit.Test;

//This is JUnit test for all important functions in VendingMachine class

public class TestVendingMachine {
    // Test for selecting specific beverages
    // First choose a category of beverage from coffee and tea
    // Then choose a specific beverage from selected category and choose the temperature, true is hot and false is cold
    // Choose one beverage
    @Test
    public void testSelectSpecificBeverages1() {
        // Create a new VendingMachine instance
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectedBeverages(Main.coffee);
        vendingMachine.selectSpecificBeverages(Main.espresso, true);
        // Due to we select coffee and espresso so the size of list is 2
        assertEquals(2, vendingMachine.getSelectedBeverages().size());
    }

    // Choose two beverages
    @Test
    public void testSelectSpecificBeverages2() {
        // Create a new VendingMachine instance
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectedBeverages(Main.coffee);
        vendingMachine.selectSpecificBeverages(Main.americano, true);

        vendingMachine.selectedBeverages(Main.tea);
        vendingMachine.selectSpecificBeverages(Main.yellowTea, false);
        // Due to we select coffee, espresso, tea and yellowTea, so the size of list is 4
        assertEquals(4, vendingMachine.getSelectedBeverages().size());
    }

    // Test for selecting integrities to add
    // Choose milk or sugar or both and their units (range from 0 to 3)
    // If the units value is below 0, it will be set to 0; if it is above 3, it will be set to 3.
    @Test
    public void  testAddIntegrity(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addIntegrity(Main.milk, 1);
        vendingMachine.addIntegrity(Main.sugar, 4); // invalid value, will be set as 3

        // Retrieve the units level of the first milk integrity and the second sugar integrity from the selected integrity list
        int selectedMilkUnits = vendingMachine.getSelectedIntegrity().get(0).getUnitLevel();
        int selectedSugarUnits = vendingMachine.getSelectedIntegrity().get(1).getUnitLevel();

        assertEquals(1,selectedMilkUnits);
        assertEquals(3,selectedSugarUnits);
    }

    // Test for calculating total price
    // After selecting beverage and integrity using calculateTotalPrice to calculate
    // Choosing one beverage
    @Test
    public void  testCalculateTotalPrice1(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectedBeverages(Main.coffee);
        vendingMachine.selectSpecificBeverages(Main.espresso, true);
        vendingMachine.addIntegrity(Main.milk, 1);
        vendingMachine.addIntegrity(Main.sugar, 2);

        double totalPrice = vendingMachine.calculateTotalPrice();

        // Assert that the calculated total price is equal to 3.50 with a tolerance of 0.01
        assertEquals(3.50, totalPrice, 0.01);

    }

    // Choosing two beverages
    @Test
    public void  testCalculateTotalPrice2(){
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.selectedBeverages(Main.coffee);
        vendingMachine.selectSpecificBeverages(Main.espresso, false);
        vendingMachine.addIntegrity(Main.milk, 2);
        vendingMachine.addIntegrity(Main.sugar, 2);

        vendingMachine.selectedBeverages(Main.tea);
        vendingMachine.selectSpecificBeverages(Main.blackTea, false);
        vendingMachine.addIntegrity(Main.milk, 3);
        vendingMachine.addIntegrity(Main.sugar, 1);

        double totalPrice = vendingMachine.calculateTotalPrice(); //using for loops to calculate all

        // Assert that the calculated total price is equal to 9.00 with a tolerance of 0.01
        assertEquals(9.00, totalPrice, 0.01);

    }
}

