import java.util.Scanner;

public class MoneyValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD;
        USD = scanner.nextDouble();
        double VND = 23000;
        double rate = USD * 23000;
        System.out.println("Enter your money value:");
        System.out.println(rate);
    }
}
