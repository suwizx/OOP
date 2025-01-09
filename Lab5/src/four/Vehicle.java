/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package four;

/**
 *
 * @author suwizx
 */
public class Vehicle {
    private int fuel;
    private String topSpeed;
    
    protected void setFuel(int i){
        this.fuel = i;
    }
    
    protected void setTopSpeed(String n){
        this.topSpeed = n;
    }
    
    protected int getFuel(){
        return this.fuel;
    } 
    
    protected String getTopSpeed(){
        return this.topSpeed;
    }
    
    public void showInfo(){
        System.out.println("Fuel is "+ this.fuel + " litre and Top Speed is "+this.topSpeed+ " m/s.");
    }
}
