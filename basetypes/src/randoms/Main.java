package randoms;

import java.util.Random;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        // create a new object 'rand'
        // which is of a class type named random
        Random rand = new Random();

        // display the values for a min and max interger class
        // each PRIMITIVE class type has an associated class type
        // containing a variety of methods to generate a random number of all types
        System.out.println("max int " + Integer.MAX_VALUE);
        System.out.println("min int " + Integer.MIN_VALUE);

        // generate a random integer from min int through max int
        int iresult = rand.nextInt();
        System.out.println(iresult);

        // a random integer from 0, 1, 2, 3, 4
        // 5 is our end bounds
        iresult = rand.nextInt(5);
        System.out.println(iresult);

        // Let's pick a number from 5 - 10
        // Go from 6 numbers, going from 0 - 5
        // we just add 5 to our potential result
        // 0,1,2,3,4,5 -> 5,6,7,8,9,10
        iresult = rand.nextInt(6) + 5;
        System.out.println(iresult);

        // pick a random double from 0.0 to 1.0
        // we need a new variable, since we're working with a new data type
        double dresult = rand.nextDouble();
        System.out.println(dresult);
    }

}