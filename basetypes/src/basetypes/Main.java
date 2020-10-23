package basetypes;

/**
 * Main
 */
public class Main {
    public static void main(String args[]) {
        // create some nums
        int a = 2;
        int b = 1;
        double ba = 11.5;

        // manipulate the numbers and output results
        // arithmatic methods
        double result = ba / a;
        System.out.println(result); // displays 5.75

        System.out.println(b + a); // outputs 3

        System.out.println(b / a); // outputs 0, nearest whole int

        System.out.println(b % a); // outputs 1

        // Strings
        String sa = "Lambda";
        String sb = "School";

        // Concating strings
        String ls = sa + sb;

        System.out.println(ls);

        // add to, and reassign
        a += b;

        System.out.println(a);

        // increment
        b++;
        System.out.println(b);
    }
}