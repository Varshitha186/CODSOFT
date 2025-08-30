import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Simple exchange rates (base: INR)
        double usdRate = 0.012; // 1 INR = 0.012 USD
        double eurRate = 0.011; // 1 INR = 0.011 EUR
        double gbpRate = 0.0095; // 1 INR = 0.0095 GBP

        System.out.println("===== Currency Converter =====");
        System.out.println("Base currency: INR (Indian Rupee)");
        System.out.print("Enter amount in INR: ");
        double amountInINR = sc.nextDouble();

        System.out.println("Choose target currency:");
        System.out.println("1. USD");
        System.out.println("2. EUR");
        System.out.println("3. GBP");
        int choice = sc.nextInt();

        double converted = 0;
        String currency = "";

        switch (choice) {
            case 1:
                converted = amountInINR * usdRate;
                currency = "USD";
                break;
            case 2:
                converted = amountInINR * eurRate;
                currency = "EUR";
                break;
            case 3:
                converted = amountInINR * gbpRate;
                currency = "GBP";
                break;
            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println(amountInINR + " INR = " + converted + " " + currency);
        sc.close();
    }
}
