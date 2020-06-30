package week4code;

/**
 * A very simple class for an AddEmUp object. This object just adds up a bunch
 * of integers and reports the total and average.
 *
 * Note that this class contains its own main method, so it can be run and
 * tested directly.
 *
 * Commenting is not to JavaDoc standards
 *
 * @author Sam Scott
 */
public class AddEmUp {

    private int count;
    private double total;

    public AddEmUp() {
        total = 0.0;
        count = 0;
    }

    public AddEmUp(double firstNum) {
        total = firstNum;
        count = 1;
    }

    public void addNums(double n) {
        total += n;
        count++;
    }

    public void addNums(double n, int numToAdd) {
        total += n * numToAdd;
        count += numToAdd;
    }

    public double getAverage() {
        return total / count;
    }

    public double getTotal() {
        return total;
    }

    public static void main(String[] args) {
        AddEmUp a = new AddEmUp();
        a.addNums(23.5);
        a.addNums(45.4, 10);
        System.out.println("Total: " + a.getTotal());
        System.out.println("Average: " + a.getAverage());
    }
}
