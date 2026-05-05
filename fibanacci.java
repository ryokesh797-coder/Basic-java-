import java.util.Scanner;

public class FibonacciExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        int a = 0, b = 1;

        if (n <= 0) {
            System.out.println("Please enter a natural number greater than 0.");
        } else if (n == 1) {
            System.out.println("Fibonacci Series: " + a);
        } else {
            System.out.print("Fibonacci Series: " + a + " " + b);

            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(" " + next);
                a = b;
                b = next;
            }
        }

        sc.close();
    }
}