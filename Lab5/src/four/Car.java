/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package four;

/**
 *
 * @author suwizx
 */
public class Car extends Vehicle {
    private String typeEngine;
    
    public void setTypeEngine(String t){
        this.typeEngine = t;
    }
    
    public String getTypeEngine(){
        return this.typeEngine;
    }
    
    public void showCarInfo(){
        System.out.println("Car engine is "+this.typeEngine+".");
        super.showInfo();
    }
    
    public void setCarInfo(int s,String t,String y){
        super.setFuel(s);
        super.setTopSpeed(t);
        this.typeEngine = y;
    }
    
    public void move(){
        if(super.getFuel() - 50 <= 0){
            System.out.println("Please add fuel.");
            return ;
        }
        super.setFuel(super.getFuel() - 50);
        System.out.println("Move.");
    }
}
