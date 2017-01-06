package shift;

import java.util.Random;

import static java.lang.String.format;

/**
 */
public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        double x = 10, y = 10;
        for (int i = 1; i < 20; i++) {
            x += 1 + rnd.nextGaussian() / 10;
            y += rnd.nextGaussian() / 10;
            System.out.println(format("x,y= %5.2f %5.2f", x, y));
        }
    }
}
