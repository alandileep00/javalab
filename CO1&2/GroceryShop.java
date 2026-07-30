import java.util.Scanner;

public class GroceryShop {
    public static void main(String[] args) {

        // Discount constant
        final double DISCOUNT = 0.10;

        Scanner s = new Scanner(System.in);

        // Read prices of three items
        System.out.print("Enter price of item 1: ");
        double item1 = s.nextDouble();

        System.out.print("Enter price of item 2: ");
        double item2 = s.nextDouble();

        System.out.print("Enter price of item 3: ");
        double item3 = s.nextDouble();

        // Calculate total
        double total = item1 + item2 + item3;

        // Calculate discount amount
        double discountAmount = total * DISCOUNT;

        // Calculate final amount
        double finalAmount = total - discountAmount;

        // Display results
        System.out.println("Total = " + total);
        System.out.println("Discount = " + discountAmount);
        System.out.println("Final Amount = " + finalAmount);
    }
}