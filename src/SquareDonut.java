

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Example to help with Assignment 3.
 *
 * @author Sam Scott
 */
public class SquareDonut {

    /**
     * The two squares that make up a SquareDonut
     */
    private SquareBasic inner, outer;

    /**
     * Constructor.
     *
     * @param x Left coordinate of SquareDonut
     * @param y Top coordinate of SquareDonut
     * @param size Size of SquareDonut
     */
    public SquareDonut(double x, double y, double size) {
        // Create the inner and outer squares. Use math so that a SquareDonut
        // scales nicely.
        inner = new SquareBasic(x + size / 3, y + size / 3, size / 3, Color.LIGHTCYAN);
        outer = new SquareBasic(x, y, size, Color.CADETBLUE);
    }

    /**
     * Draw the SquareDonut.
     *
     * @param gc The GraphicsContext to draw on.
     */
    public void draw(GraphicsContext gc) {
        outer.draw(gc);
        inner.draw(gc);
    }
}
