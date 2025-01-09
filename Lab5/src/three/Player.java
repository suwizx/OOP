/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package three;

/**
 *
 * @author suwizx
 */
public class Player {

    private String name;
    private String team;
    
    public String getName(){
        return name;
    }
    
    public String getTeam(){
        return team;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public void setTeam(String t){
        this.team = t;
    }
    
    public boolean isSameTeam(Player p){
        return this.team.equals(p.team);
    } 
}
