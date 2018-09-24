package com.company;
//run the method here
public class testFile {

    public static void main(String[] args) {
        System.out.println("dateStr produces \t" + Pahmedlib.dateStr("04/13/2001"));
        System.out.println("isPalindrome produces \t" + Pahmedlib.isPalindrome("racecar"));
        System.out.println("cutOut produces \t" + Pahmedlib.cutOut("catatonic cat", "cat"));
        System.out.println("isFibonnaci produces \t" + Pahmedlib.isFibonnaci(53));
        System.out.println("sumUpTo produces \t" + Pahmedlib.sumUpTo(11));
        System.out.println("quadSolver produces \t" + Pahmedlib.quadSolver(1, -6, 9));
    }
}
