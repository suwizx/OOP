/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suwizx
 */
public class Seller extends Employee {
    public Food sell(Employee e){
        Food food = new Food();
        if (e.getWallet().getBalance() >= food.getPrice()){
            this.getWallet().setBalance(this.getWallet().getBalance() + food.getPrice());
            e.getWallet().setBalance(e.getWallet().getBalance() - food.getPrice());
            return food;
        }
        System.out.println("Your money is not enough.");
        return null;
    }
}
