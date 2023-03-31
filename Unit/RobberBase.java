package Unit;

import java.util.ArrayList;

public abstract class RobberBase extends BaseUnit{
    protected int amount_stolen; // сколько может всзять с крестьянина за 1 раз
    protected int max_stocks; // сколько может накопить

    public RobberBase(ArrayList <BaseUnit> name, int attack, int defence, int maxHealth, int supply, int gangSize, float health, int speed, int [] damage, int x, int y, String type, int amount_stolen, int max_stocks) {
        super(name, attack, defence,maxHealth, supply, gangSize, health,speed,damage, x,y, type);
        this.amount_stolen=amount_stolen;
        this.max_stocks=max_stocks;
    }



    
    
}
