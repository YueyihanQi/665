/**
 * Name: Yueyihan_Qi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/08/2024
 * File Name: Main.java
 * Description: Using main class to initialize various beverages and ingredients.
 */

package edu.bu.met.cs665.example1;

/**
 * This is the Main class.
 */
public class Main {

  // Beverage
  public  static  Beverage coffee= new Coffee("Coffee", 0, false,"Coffee");
  public  static  Beverage tea= new Tea("Tea", 0, false,"Tea");

  // Coffee
  public static Coffee espresso= new Coffee("Espresso", 2.0,false, "Espresso");
  public static Coffee americano= new Coffee("Americano", 2.5, false,"Americano");
  public static Coffee latteMacchiato= new Coffee("Latte Macchiato", 1.5, false,"Latte Macchiato");

  // Tea
  public static Tea blackTea= new Tea("Black Tea", 3.0, false,"Black Tea");
  public static Tea greenTea= new Tea("Green Tea", 2.5, false,"Green Tea");
  public static Tea yellowTea= new Tea("Yellow Tea", 2.75, false, "Yellow Tea");

  // Integrity
  public static Milk milk= new Milk("Milk", 0.5, 0);
  public static Sugar sugar= new Sugar("Sugar", 0.5, 0);

}
