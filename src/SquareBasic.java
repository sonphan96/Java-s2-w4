

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * Example to help with Assignment 3.
 *
 * @author Sam Scott
 */
public class SquareBasic {

    /**
     * X and Y location of top left of square
     */
    private double x, y;
    /**
     * Size of square
     */
    private double size;
    /**
     * Color of square
     */
    private Color color;

    /**
     * Constructor.
     *
     * @param x Left of square
     * @param y Top of square
     * @param size Size of square
     * @param color Color of square
     */
    public SquareBasic(double x, double y, double size, Color color) {
        this.x = x;
        this.y = y;
        this.size = size;
        this.color = color;
    }

    /**
     * Draw the square.
     *
     * @param gc The GraphicsContext to draw on.
     */
    public void draw(GraphicsContext gc) {
        gc.setFill(color);
        gc.fillRect(x, y, size, size);
    }
}
