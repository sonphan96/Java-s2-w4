
public class CharacteristicTest {

    public static void main(String[] args) {
        Characteristic c1 = new Characteristic("Bookishness", 4);
        Characteristic c2 = new Characteristic("Bookishness", 8);


        System.out.println(c1.getCompatability(c2));
    }
}
