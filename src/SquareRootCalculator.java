import java.util.Scanner;

public class SquareRootCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number: ");
            double num = Double.parseDouble(sc.nextLine());

            if (num < 0) {
                throw new IllegalArgumentException("Cannot calculate the square root of a negative number.");
            }

            System.out.println("Square Root: " + Math.sqrt(num));

        } catch (NumberFormatException e) {
            System.out.println("Error: Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}
