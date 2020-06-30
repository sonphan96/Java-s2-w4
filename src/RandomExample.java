import java.util.Random;

public class RandomExample {
    public static void main(String[] args) {

        Random random = new Random();

        int random1 = random.nextInt(10);
        int random2 = random.nextInt(10);
        System.out.println("1st: " + random1);
        System.out.println("2nd: " + random2);

        double average = (random1 + random2)/2.0;
        String tempString = String.format("The average of 2 value are %.1f", average);
        System.out.println(tempString);
    }


}
