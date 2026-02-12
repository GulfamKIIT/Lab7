import java.util.Scanner;

public class ArrayIndexExceptionDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Suppose array size is 4
        int[] arr = new int[4];

        System.out.println("Enter 5 numbers:");

        try {
            // This loop will cause ArrayIndexOutOfBoundsException
            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt(); // i = 4 causes exception
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception in thread \"main\" " + e);
        }
    }
}
