
import java.util.Scanner;

public class Shoppingcart {
    public static void Products(String pname, int price, int quantity) {
        
    }
    public static void main(String[] args) {
        Scanner ref = new Scanner(System.in);

        System.out.println("Enter your product name:");
        String pname = ref.nextLine();
        System.out.println("Enter the price of the product:");
        int price = ref.nextInt();
        System.out.println("Enter the quantity:");
        int quantity = ref.nextInt();
        Products(pname, price, quantity);
        int total = price * quantity;
        System.out.println("Product Name: " + pname);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + total);
        
       double discount = 0;
        if (total > 100) {
            discount = total * 0.05;
        }
        double finalTotal = total - discount;
        System.out.println("Discount: " + discount);
        System.out.println("Final Total: " + finalTotal);
    }    
}