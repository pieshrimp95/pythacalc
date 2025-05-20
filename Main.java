import java.util.Scanner;


public class Main {
    public static void main() {

        // Initialize
        double result = 0;
        Scanner input = new Scanner(System.in);

        // Input
        System.out.println("Pythagoras Calculator!\nPut 0 for the variable you want to find.\nInput A:");
        int a = input.nextInt();

        System.out.println("Input B: ");
        int b = input.nextInt();

        System.out.println("Input C: ");
        int c = input.nextInt();

        // raahhhhhh chatgpt help bruh :/
        int KnownInputs = 0;
        if (a != 0) KnownInputs++; // if the value of this not 0, then add increment to KnownInputs
        if (b != 0) KnownInputs++;
        if (c != 0) KnownInputs++;

        // main operation boys
        if (KnownInputs != 2) {
            System.out.println("Error: The values must be 2.");
        } else {
            if (a == 0) {
                result = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2)); // sqrt(c^2 - b^2)
            }
            if (b == 0) {
                result = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            }
            if (c == 0) {
                result = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
            }
        }
        System.out.println("Result:" + result);
        input.close();
    }
}
