import java.util.Scanner;

public class ScanningDoublesAndBooleans {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Scanning a double
        System.out.println("Enter the value of pi: ");
        double value = Double.valueOf(scanner.nextLine());
        System.out.println(value + " is called pi day, for obvious reasons");


        // Scanning a boolean
        System.out.println("Is the sky blue? Enter true for yes and false for no: ");
        boolean value = Boolean.valueOf(scanner.nextLine());
        System.out.println("It is " + value + " that the sky is blue");
    } 
}
