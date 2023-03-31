package Unit;



public class Position {
    protected int x,y;

    public Position(int x, int y){
    this.x=x;
    this.y=y;
    }

    public boolean isEquals(Position opposit)
    {
        if (opposit.y==y && opposit.x==x) return true;
        return false;
    }
    
    public float getDistance(float x, float y){
        float dx=x-this.x;
        float dy = y-this.y;
        return (float) Math.sqrt(dx*dx+dy*dy);
   
}
}