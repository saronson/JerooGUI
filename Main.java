/**
 * Put your main Jeroo code in the method runJerooCode().
 * Put Jeroo methods in Jeroo.java
 * Press right arrow to step forward and left arrow to step backwards.
 * @author Steve Aronson
 */
public class Main implements Directions {

    public static void main(String[] args) {
        // You can optionally load a world or change the size of the world.
        // Map.getInstance().changeSize(50,50);
        Map.getInstance().loadMap("maps/test.jev");

        new JerooGUI();
        runJerooCode();
    }

    /**
     * Put your main Jeroo code here.
     */
    private static void runJerooCode() {
        Jeroo kim1 = new Jeroo(4, 4, 8);
        Jeroo kim2 = new Jeroo(5, 6, 8);

        kim1.plantAndHop();
        kim1.plantAndHop();
        kim2.plantAndHop();

        kim1.turn(LEFT);
        kim1.turn(LEFT);
        kim1.hop();
        kim1.pick();
        kim1.turn(LEFT);
        kim1.turn(LEFT);
        kim1.hop();
    }
}
