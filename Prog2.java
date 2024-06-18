import java.util.Scanner;

public class Prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] months = {
            null,"January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        System.out.print("Enter a number between 1 and 12: ");
        int monthNumber = scanner.nextInt();

        if (monthNumber >= 1 && monthNumber <= 12) {
            System.out.println("The month is " + months);
        } else {
            System.out.println("Invalid number. Please enter a number between 1 and 12.");
        }

        scanner.close();
    }
}
