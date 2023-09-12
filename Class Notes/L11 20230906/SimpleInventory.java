import java.util.Scanner;

class Product {
    
    static final int n = 10; // Max products allowed
    int count = 0; // Track number of products added
    String[] pName = new String[n];
    double[] pPrice = new double[n];
    
    void addProduct() {
        if(count < n) {
            Scanner scan = new Scanner(System.in);
            
            System.out.print("Enter product name: ");
            pName[count] = scan.nextLine();
            
            System.out.print("Enter product price: ");
            pPrice[count] = Double.parseDouble(scan.nextLine());
            
            count++;
            
            System.out.println("Product added.");
        } else {
            System.out.println("Maximum capacity reached.");
        }
    }
    
    void displayProduct() {
        for(int i = 0; i < count; i++) {
            System.out.println("Product name: " + pName[i] + " | Product price: " + pPrice[i]);
        }
    }
    
    void searchProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Product Name to search: ");
        String searchName = scan.nextLine();
        
        boolean found = false;
        for(int i = 0; i < count; i++) {
            if(pName[i].equalsIgnoreCase(searchName)) {
                System.out.println("Product found! Name: " + pName[i] + " | Price: " + pPrice[i]);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("Product not found!");
        }
    }
    
    void deleteProduct() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Product Name to delete: ");
        String deleteName = scan.nextLine();
        
        int index = -1;
        for(int i = 0; i < count; i++) {
            if(pName[i].equalsIgnoreCase(deleteName)) {
                index = i;
                break;
            }
        }
        
        if(index != -1) {
            for(int i = index; i < count - 1; i++) {
                pName[i] = pName[i + 1];
                pPrice[i] = pPrice[i + 1];
            }
            count--;
            System.out.println("Product deleted successfully.");
        } else {
            System.out.println("Product not found!");
        }
    }
}

public class SimpleInventory {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Product p1 = new Product();
        
        while(true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = Integer.parseInt(scan.nextLine());
            
            switch(choice) {
                case 1:
                    p1.addProduct();
                    break;
                case 2:
                    p1.displayProduct();
                    break;
                case 3:
                    p1.searchProduct();
                    break;
                case 4:
                    p1.deleteProduct();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Incorrect input. Please choose a valid option.");
                    break;
            }
        }
    }
}
