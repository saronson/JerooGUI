/**
 * Put your Jeroo methods in this class.
 * @author Steve Aronson
 */
public class Jeroo extends JerooBase {

    public void plantAndHop() {
        plant();
        hop();
    }


    public Jeroo() {super();}

    public Jeroo(int flowers) {super(flowers); }

    public Jeroo(int x, int y) { super(x, y); }

    public Jeroo(int x, int y, CompassDirection direction) { super (x, y, direction);}

    public Jeroo(int x, int y, int flowers) { super (x, y, flowers);}

    public Jeroo(int x, int y, CompassDirection direction, int flowers) { super(x, y, direction, flowers);}

}