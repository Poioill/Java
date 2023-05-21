package Course_pracrise;

import java.util.Random;

public class RandomPrac {
    public static void main(String[] args){
        Random random = new Random();

        int a = random.nextInt(6);
        double b = random.nextDouble(5);
        boolean c = random.nextBoolean();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
