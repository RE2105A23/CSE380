/*
 To create an interface Resizable with methods resizeWidth(int width) and resizeHeight(int height) that allow an object to be resized. Create a class Rectangle that implements the Resizable interface and implements the resize methods. First, we define an interface "Resizable" with the methods resizeWidth(int width) and resizeHeight(int height) to allow an object to be resized. The "Rectangle" class implements the Resizable interface and provides its own implementations of the resize methods. It also has a printSize() method to display the current rectangle size. In the main() method, we create an instance of the "Rectangle" class and display its size. Then, we call the resizeWidth() and resizeHeight() methods to change the rectangle size. Finally, we print the updated size.

Input Format

100 150 150 200

Constraints

input must be integer

Output Format

Width: 100, Height: 150 Width: 150, Height: 200

Sample Input 0

100 200
300 500
Sample Output 0

Width: 100, Height: 200
Width: 300, Height: 500 
*/

 import java.util.Scanner;

 // Define the Resizable interface
 interface Resizable {
     void resizeWidth(int width);
     void resizeHeight(int height);
 }
 
 // Implement the Rectangle class
 class Rectangle implements Resizable {
     private int width;
     private int height;
 
     public Rectangle(int width, int height) {
         this.width = width;
         this.height = height;
     }
 
     @Override
     public void resizeWidth(int width) {
         this.width = width;
     }
 
     @Override
     public void resizeHeight(int height) {
         this.height = height;
     }
 
     public void printSize() {
         System.out.println("Width: " + width + ", Height: " + height);
     }
 }
 
 // Main class
 public class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         // Read initial width and height
         int initialWidth = scanner.nextInt();
         int initialHeight = scanner.nextInt();
         
         // Create an instance of the Rectangle class with initial dimensions
         Rectangle rect = new Rectangle(initialWidth, initialHeight);
 
         // Display the initial size
         rect.printSize();
 
         // Read new width and height to resize
         int newWidth = scanner.nextInt();
         int newHeight = scanner.nextInt();
         
         // Resize the rectangle
         rect.resizeWidth(newWidth);
         rect.resizeHeight(newHeight);
 
         // Display the updated size
         rect.printSize();
     }
 }
 