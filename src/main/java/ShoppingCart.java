import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        // TODO: Ask the user how many items they are purchasing
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times are you purchasing? ");
        int items = sc.nextInt();
        double totalcost = 0.0;
        // TODO: Use a for loop to read each item's price (double)
        for (int i = 1; i <= items; i++) {
            System.out.print("Price of item " + i + "? ");
            double price = sc.nextDouble();
            totalcost = totalcost + price;
        }
        System.out.printf("Your cart has %d items with a total cost of $%.1f%n", items, totalcost);

        // TODO: Print the final summary line with item count and total
        // TODO: Use Scanner for input
    }
}
