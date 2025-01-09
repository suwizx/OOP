/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seven;

/**
 *
 * @author suwizx
 */
public class Account {

    public double balance;
    public String name;

    public void deposit(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or euqal to zero");
            return;
        }
        this.balance += b;
    }

    public double withdraw(double b) {
        if (b < 0) {
            System.out.println("The balance variable must be greater than or euqal to zero");
            return 0;
        }
        if (b > this.balance){
            System.out.println("Your account balance is insufficient.");
            return 0;
        }
        this.balance -= b;
        return this.balance;
    }

    public void showInfo() {
        System.out.println("In " + this.name + " account, there is a balance equal to  " + this.balance + " baht. ");
    }
}
