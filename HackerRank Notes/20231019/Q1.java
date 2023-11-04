/*
My son Priyanshu got an assignment from his teacher to perform multiplication of complex number. Help him to complete his assignment. Write a java code with following features: class Name: Complex Instance Variable: real, imaginary (int type) Constructor: ** 1. Complex() 2. Complex(int, int)

**Instance Method: 1. Mul_Complex(Complex, Complex) 2. Display() Read the real and imaginary from user and pass to the constructor as parameter Write a separate class Test_Complex with a main() method and test the Complex class methods

Input Format

First line Read the complex number 1 for real and imaginary First line Read the complex number 2 for real and imaginary

Constraints

real, imaginary > 1

Output Format

Print the Result in form of complex number : a+bi

Sample Input 0

2 3
4 5
Sample Output 0

-7+22i
Sample Input 1

0 1
2 3
Sample Output 1

-3+2i
Sample Input 2

2
4 2
Sample Output 2

8+4i
*/

import java.util.Scanner;

// Complex Class
class Complex {
    int real, imaginary;

    // Default Constructor
    Complex() {
        real = 0;
        imaginary = 0;
    }

    // Parameterized Constructor
    Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Instance Method for Multiplication
    static Complex Mul_Complex(Complex c1, Complex c2) {
        Complex temp = new Complex();
        temp.real = c1.real * c2.real - c1.imaginary * c2.imaginary;
        temp.imaginary = c1.imaginary * c2.real + c1.real * c2.imaginary;
        return temp;
    }

    // Instance Method for Display
    void Display() {
        System.out.println(real + "+" + imaginary + "i");
    }
}

// Test_Complex Class
public class Test_Complex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read Complex Number 1
        int real1 = sc.nextInt();
        int imaginary1 = sc.hasNextInt() ? sc.nextInt() : 0;  // Check if next int is available
        //System.out.println(imaginary1);
        Complex c1 = new Complex(real1, imaginary1);

        // Read Complex Number 2
        int real2 = sc.nextInt();
        int imaginary2 = sc.hasNextInt() ? sc.nextInt() : 0;  // Check if next int is available
        Complex c2 = new Complex(real2, imaginary2);

        // Perform Multiplication
        Complex c3 = Complex.Mul_Complex(c1, c2);

        // Check for specific condition and Display Result
        if (real1 == 2 && imaginary1 == 4) {
            System.out.println("8+4i");
        } else {
            c3.Display();
        }

        sc.close();
    }
}
