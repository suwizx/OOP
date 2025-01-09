package four;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suwizx
 */
public class Fraction {
    public int topN;
    public int btmN;
   
    public String toFraction(){
        return topN + "/" + btmN ;
    }     
    
    public String toFloat(){
        return (double)topN/(double)btmN + "";
    }
    
    public void addFraction(Fraction f){
        if (f.btmN == btmN) {
            topN = f.topN + topN;
        }
        else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN = btmN * f.btmN;
        }
    }
  
}
