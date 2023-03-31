package Unit;

import java.util.ArrayList;

public class Monk extends MagicMan {

    public Monk(ArrayList <BaseUnit> name,int x, int y, int gangSize){
        super(name, 12, 10, 15, 0, gangSize, 9, 5, new int[]{8,10}, x, y,"",2);
        
    }

   
        
  


    @Override
    public void step(ArrayList<BaseUnit> team) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'step'");
    }
} 

