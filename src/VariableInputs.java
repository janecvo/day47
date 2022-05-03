import java.util.Scanner;

public class VariableInputs {
    public static void main  (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string of text: ");
        String text = scanner.nextLine();
        System.out.println("Enter an integer: ");
        int number = Integer.valueOf(scanner.nextLine());
        System.out.println("Enter a double: ");
        double decimal = Double.valueOf(scanner.nextLine());
        System.out.println("Enter a boolean value: ");
        boolean trueOrFalse =  Boolean.valueOf(scanner.nextLine());

        System.out.println("Your string is " + text);
        System.out.println("Your integer is  " + number);
        System.out.println("Your double is " + decimal);
        System.out.println("Your boolean is " + trueOrFalse);

    }
    
}
