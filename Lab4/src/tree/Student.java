package tree;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suwizx
 */
public class Student {

    public String name;
    public double mScore;
    public double fScore;

    public void showGrade() {
        double s;
        s = (mScore * 0.4) + (fScore * 0.4) + 20;
        if (s < 50) {
            System.out.println("Your grade is F");
        } else if (s < 60) {
            System.out.println("Your grade is D");
        } else if (s < 70) {
            System.out.println("Your grade is C");
        } else if (s < 80) {
            System.out.println("Your grade is B");
        } else if (s >= 80) {
            System.out.println("Your grade is A");
        }
    }

}
