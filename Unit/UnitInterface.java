package Unit;
import java.util.ArrayList;
public interface UnitInterface {
    void step(ArrayList<BaseUnit> team);
    String getInfo();
    String getName();
    
    String toString();
    Position getPosition();
}

