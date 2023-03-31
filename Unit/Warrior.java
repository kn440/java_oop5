package Unit;

import java.util.ArrayList;

public abstract class Warrior extends BaseUnit{
    protected int bumbum; // дополнительный параметр
    public Warrior(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type,int bumbum, int bahbah) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type);
        this.bumbum=bumbum;
    }
    
    
    
    

    
}
