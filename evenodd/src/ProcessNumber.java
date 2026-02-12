import java.util.Scanner;

public class ProcessNumber {

    // Method to process input
    public static void ProcessInput(int number) throws NegativeNumberException {

        if (number < 0) {
            throw new NegativeNumberException(
                    "Exception occurred: NegativeNumberException - number should be positive");
        } else {
            System.out.println("Double value: " + (number * 2));
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        try {
            ProcessInput(num);
        } catch (NegativeNumberException e) {
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
