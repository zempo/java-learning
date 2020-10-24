package typecasting;

/**
 * Main
 */
public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        // widening casting happens automatically
        // An integer is casted:
        // converted to a double
        double myDouble = myInt;

        // string conversion also happens automatically
        // allowing you to print the vals of ints, doubles, and more
        System.out.println("myInt = " + myInt);
        System.out.println("myDouble = " + myDouble);

        // spacer
        System.out.println();

        double myDouble2 = 9.78;
        // narrow casting MUST BE DONE MANUALLY
        // notice the addition of int in this expression
        // it tells the compiler:
        // to manually convert the double following it, into an int
        int myInt2 = (int) myDouble2;

        System.out.println("myDouble2 = " + myDouble2);
        System.out.println("myInt2 = " + myInt2);
    }
}