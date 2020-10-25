package strings;

import java.text.DecimalFormat;

/**
 * Main
 */
public class Main {
    // create a private class variable to control the display format for doubles
    // $#,##0.00 means
    // > display at least one number before the decimal and only two numbers, but
    // always two numbers, after the decimal
    // > when displayed the number is rounded to two decimal points. The underlaying
    // number is not changed
    // > display a comma after each group of 3 numbers
    // > display a dollar sign at the beginning of each number
    private static DecimalFormat df = new DecimalFormat("$#,#0.00");

    public static void main(String[] args) {

    }
}