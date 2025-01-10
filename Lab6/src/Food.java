/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suwizx
 */
public class Food {
    final static private int energy = 10;
    static private double price = 50;
    
    public static void setPrice(double price){
        if (price < Food.price){
            System.out.println("Cannot update the food price.");
            return;
        }
        Food.price = price;
    }
    
    public static double getPrice(){
        return Food.price;
    }
    
    public static int getEnergy(){
        return Food.energy;
    }
    
}
