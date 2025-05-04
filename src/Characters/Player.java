
package Characters;
import java.util.ArrayList;
import java.util.List;

import Characters.Character;

/**
 *
 * @author kuturin
 */
public class Player extends Character
{
    private List<String> inventory;
    
    public Player(String name, int health, int damage, int defense)
    {
        super(name, health, damage, defense);
        this.inventory = new ArrayList<>();
        
    }
    
    public String getName() {return name;}
    public void setHealth(int health) {this.health = health;}
    public int getHealth() {return health;}
    public void setDamage(int damage) {this.damage = damage;}
    public int getDamage() {return damage;}
    public void setDefense(int defense){this.defense = defense;}
    public int getDefense() {return defense;}
}
