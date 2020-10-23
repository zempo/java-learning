package scopes;

/**
 * Main
 */
public class Main {

    // field to have scope throughout class
    static int car = 5;

    public static void main(String args[]) {
        // a local variable
        int count = 0;

        // a new block within a method
        // {...}____________________
        {
            // local var inside this block
            int coffee = 5;

            // recreate a variable called car
            // only local to this block
            int car = 15;
            System.out.println(car); // displays 15, not 5
            System.out.println(count++); // displays 0, then increments by 1
            System.out.println(++count); // increments by 1, then displays 2
        }
        // _______________________________

        // outside the scope
        // coffee won't compile, here
        System.out.println("Coffee won't compile");

        // count is within this scope, so it can compile
        System.out.println(count); // 2, previously incremented

        // new block
        // ___________
        {
            String coffee = "Mocha";

            System.out.println(coffee); // displays mocha
        }

        // Displays car from above this scope
        System.out.println(car);
    }
}