package com.company;
//write method here
public class Pahmedlib {
    public static String dateStr(String str) {
        /**works whenever the string is formatted as xx/xx/ by splitting the string up and returning it with dashes **/
        return str.substring(0, 2) + "-" + str.substring(3, 5) + "-" + str.substring(6);
    }

    public static boolean isPalindrome(String str){
        /**works with any length string by creating a new string with the characters reversed and checking if they are equal **/
        String res = "";
        for (int i = str.length(); i > 0; i--){
            res += str.substring(i - 1, i);
        }
        if (res.compareTo(str) == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static String cutOut(String main, String sub){
        /**works when the the substring is not in the main string, and when the substring is any part of the string.
         * However it is case-sensitive **/
        int firstIdx = main.indexOf(sub);
        if (firstIdx == -1) {
            return "substring is not found";
        }
        else {
            return main.substring(0, firstIdx) + main.substring(firstIdx + sub.length());
        }
    }

    public static boolean isFibonnaci(int x){
        /** Checks any integer value and returns if it is part of the Fibonnaci sequence.
        * Does this by keeping track of the last 3 numbers in the sequence and
         * checking if each new last term is equal to the input value. It will stop checking when
         * the sum is greater than the input value to prevent an infinite loop **/
        int fib1 = 0;
        int fib2 = 1;
        int fibSum = fib1 + fib2;

        while (x + 1 > fibSum) {
            if (x == fibSum) {
                return true;
            }
            fib1 = fib2;
            fib2 = fibSum;
            fibSum = fib1 + fib2;

        }
        return false;
    }

    public static int sumUpTo(int x){
        /** Works with any integer value by adding each number from together until the limiting input value is reached **/
        int sum = 0;
        for (int i = 1; i < x + 1; i++) {
            sum += i;
        }
        return sum;
    }

    public static String quadSolver(double a, double b, double c){
        /** Input a,b and c values of any quadratic equation and will define the roots even if
         * both roots are the same or both of the roots are imaginary **/
        double disc = Math.sqrt((b*b) - (4*a*c));
        double root1 = (((b*(-1)) + disc)/(2*a));
        double root2 = (((b*(-1)) - disc)/(2*a));
        if (disc < 0)
            return "There are no real roots";
        if (disc > 0){
            return "x = " + root1 + "," + root2;
        }
        else {

            return "x = " + root1;
        }
    }

}
