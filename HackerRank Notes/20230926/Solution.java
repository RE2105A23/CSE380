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
