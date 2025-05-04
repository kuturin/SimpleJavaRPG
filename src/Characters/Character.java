/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Characters;

/**
 *
 * @author turku
 */
public class Character 
{
    private String name;
    private int health;
    private int damage;
    private int defense;
    
    public Character(String name, int health, int damage, int defence)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defence;
        
    }
    
    public String getName() {return name;}
    public void setHealth(int health) {this.health = health;}
    public int getHealth() {return health;}
    public void setDamage(int damage) {this.damage = damage;}
    public int getDamage() {return damage;}
    public void setDefense(int defense){this.defense = defense;}
    public int getDefense() {return defense;}
    
}
