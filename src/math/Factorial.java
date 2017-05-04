package math;

import java.util.Scanner;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        Scanner factorialVal = new Scanner(System.in);
        System.out.println("Please enter factorial number 5! to get result");
        int factNumber = factorialVal.nextInt();
        int factOutput = factUserDefine(factNumber);
        System.out.println("Factorial of enter number is: "+factOutput);
    }
    public static int factUserDefine(int getValue) {
        int factResult;
        if (getValue == 1) {
            return 1;
        }
        factResult=factUserDefine(getValue-1)*getValue;
        return  factResult;
    }
}
