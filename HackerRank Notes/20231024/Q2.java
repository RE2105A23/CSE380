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
    
    // Static Inner_Calculator class
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
            if(n2 == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }
            return n1 / n2;
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //System.out.print("Enter the 1st number: ");
        double n1 = sc.nextDouble();
        
        //System.out.print("Enter the 2nd number: ");
        double n2 = sc.nextDouble();
        
        //System.out.print("Enter the operator (+, -, *, /): ");
        String operator = sc.next();
        
        // Create an object of Inner_Calculator
        Inner_Calculator calculator = new Inner_Calculator();
        
        double result = 0;
        boolean isValidOperator = true;
        
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
                try {
                    result = calculator.division(n1, n2);
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                    return;
                }
                break;
            default:
                isValidOperator = false;
                System.out.println("Invalid operator");
                break;
        }
        
        if (isValidOperator) {
            //System.out.println("Result: " + result);
            System.out.println((int) result);
        }
    }
}
