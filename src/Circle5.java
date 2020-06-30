

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

/**
 * This class is the same as Circle2, but properly encapsulated.
 *
 * @author Sam Scott
 */
public class Circle5 {

    /**
     * The radius of the circle
     */
    private double radius;

    /**
     * The x-coordinate of the center
     */
    private double x;

    /**
     * The y-coordinate of the center
     */
    private double y;

    /**
     * Constructor.
     */
    public Circle5() {
        this(10, 100, 100);
    }

    /**
     * Constructor.
     *
     * @param radius the initial radius
     */
    public Circle5(double radius) {
        this(radius, 100,100);

    }

    /**
     * Constructor.
     *
     * @param x the initial x value
     * @param y the initial y value
     */
    public Circle5(double x, double y) {
        this(10, x,y);

    }

    /**
     * Constructor.
     *
     * @param radius the initial radius
     * @param x the initial x value
     * @param y the initial y value
     */
    public Circle5(double radius, double x, double y) {
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    /**
     * Computes the circle area.
     *
     * @return The area of the circle.
     */
    public double getArea() {
        return Math.PI * radius * radius;
    }

    /**
     * Test whether two circles are equal.
     *
     * @param other The other circle.
     * @return True if the location and radius are the same.
     */
    public boolean equals(Circle5 other) {
        return (this.x == other.x && this.y == other.y && this.radius == other.radius);
    }

    /**
     * Draws the circle on a GraphicsContext object.
     *
     * @param gc The GraphicsContext to draw on.
     */
    public void draw(GraphicsContext gc) {
        gc.setStroke(Color.BLACK);
        gc.setLineWidth(radius / 4);
        gc.strokeOval(x - radius, y - radius, radius * 2, radius * 2);
    }

    /**
     * @return The circle's radius.
     */
    public double getRadius() {
        return radius;
    }

    /**
     * @param radius The new radius for the circle.
     */
    public void setRadius(double radius) {
        if (radius <= 0) {
            System.out.println("ERROR! Radius must be greater than 0. Not changed.");
        } else {
            this.radius = radius;
        }
    }

    /**
     * Determines whether or not this circle is inside another one. This circle
     * is considered "inside" the other if its center is inside the other
     * circle.
     *
     * @param other The other Circle
     * @return True if the this circle is "inside" the other one.
     */
    public boolean isInside(Circle5 other) {
        if (distance(other) < other.radius) {
            return true;
        }
        return false;
    }

    /**
     * Determines whether or not this circle is inside another one. This circle
     * is considered "inside" the other if its center is inside the other
     * circle.
     *
     * @param x Center x of other circle.
     * @param y Center y of other circle.
     * @param radius Radius of other circle
     * @return True if the this circle is "inside" the other one.
     */
    public boolean isInside(double x, double y, double radius) {
        if (distance(x, y) < radius) {
            return true;
        }
        return false;
    }

    /**
     * Compute the distance from the the center of another circle to the center
     * of the circle.
     *
     * @param Circle5 The other circle.
     * @return Distance between the centers of the two circles.
     */
    private double distance(Circle5 other) {
        return Math.sqrt((this.x - other.x) * (this.x - other.x)
                + (this.y - other.y) * (this.y - other.y));
    }

    /**
     * Compute the distance from the given point to the center of the circle.
     *
     * @param x X coordinate of point to test.
     * @param y Y coordinate of point to test.
     * @return Distance to center of circle.
     */
    private double distance(double x, double y) {
        return Math.sqrt((this.x - x) * (this.x - x)
                + (this.y - y) * (this.y - y));

    }

    /**
     * @return A String representation of a Circle4
     */
    @Override
    public String toString() {
        return "Circle5: radius " + radius + ", location (" + x + "," + y + ")";
    }
}
