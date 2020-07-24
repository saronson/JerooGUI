
/**
 * The snapshot state of a Jeroo 
 * i.e. location, direction and number of flowers it has
 * @author Cameron Christensen
 */
public class JerooState implements Directions {
    private int flowers;
    private int x;
    private int y;
    private CompassDirection direction;

    public JerooState(int x, int y, CompassDirection direction, int flowers){
        this.x = x;
        this.y = y;
        this.direction = direction;
        this.flowers = flowers;
    }

    public int getFlowers(){
        return flowers;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public CompassDirection getDirection(){
        return direction;
    }
}
