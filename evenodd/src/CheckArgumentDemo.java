// User-defined exception
class CheckArgument extends Exception {
    public CheckArgument() {
        super("CheckArgument");
    }
}

public class CheckArgumentDemo {

    public static void main(String[] args) {

        try {
            // Check number of arguments
            if (args.length < 4) {
                throw new CheckArgument();
            }

            int sum = 0;

            // Calculate sum of squares of first four arguments
            for (int i = 0; i < 4; i++) {
                int num = Integer.parseInt(args[i]);
                sum += num * num;
            }

            System.out.println(sum);
        }
        catch (CheckArgument e) {
            System.out.println("Exception occurred - " + e.getMessage());
        }
    }
}


