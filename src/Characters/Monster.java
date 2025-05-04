/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Characters;
import Characters.Character;


/**
 *
 * @author turku
 */
public class Monster extends Character
{
    private String name;
    private int health;
    private int damage;
    private int defense;
    
    public Monster(String name, int health, int damage, int defense)
    {
        super(name, health, damage, defense);
        
        
    }
    
    public String getName() {return name;}
    public void setHealth(int health) {this.health = health;}
    public int getHealth() {return health;}
    public void setDamage(int damage) {this.damage = damage;}
    public int getDamage() {return damage;}
    public void setDefense(int defense){this.defense = defense;}
    public int getDefense() {return defense;}
    
    
    
    public void takeDamage(int damage)
    {
        this.health -=damage;
    }
    
    public void attack(Player player)
    {
        int damageDealt = Math.max(0, damage-player.getDefense());
        player.setHealth(player.getHealth() - damageDealt);
        System.out.println(name+" attacks " + player.getName() + " for " + damageDealt + " damage.");
    }
    
  
    
}
