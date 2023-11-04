/*
Riya asked her friend to make calculator using nested class using the following operation. 1. The outer class name is Outer_Calculator 2. The inner class name is static Inner_Calculator with four method addition , subtraction , multiplication and division. 3. Write main method under the class of Outer_Calculator.

if the input is integer than display the massage as "invalid input" and if the operator is not valid operator than display the massage as "invalid operator".

Input Format

Line 1: Read 1st Number Line 2: Read 2nd Number Line 3: Read Operator

Constraints

Number n1, n2 > 0 Operator : +, -, *, / (any one)

Output Format

Display the result

Sample Input 0

4
5
+
Sample Output 0

9
*/

import java.util.Scanner;

public class Outer_Calculator {
    public static class Inner_Calculator {
        public double addition(double n1, double n2) {
            return n1 + n2;
        }

        public double subtraction(double n1, double n2) {
            return n1 - n2;
        }

        public double multiplication(double n1, double n2) {
            return n1 * n2;
        }

        public double division(double n1, double n2) {
            if (n2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return n1 / n2;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inner_Calculator calculator = new Inner_Calculator();
        
        if (!scanner.hasNextDouble()) {
            System.out.println("invalid input");
            return;
        }
        double n1 = scanner.nextDouble();
        
        if (!scanner.hasNextDouble()) {
            System.out.println("invalid input");
            return;
        }
        double n2 = scanner.nextDouble();
        scanner.nextLine();
        
        String operator = scanner.nextLine();

        double result;
        switch (operator) {
            case "+":
                result = calculator.addition(n1, n2);
                break;
            case "-":
                result = calculator.subtraction(n1, n2);
                break;
            case "*":
                result = calculator.multiplication(n1, n2);
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("invalid operator");
                    return;
                }
                result = calculator.division(n1, n2);
                break;
            default:
                System.out.println("invalid operator");
                return;
        }
        System.out.println((int)result);
    }
}
