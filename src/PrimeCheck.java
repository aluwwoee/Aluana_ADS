import java.util.Scanner;

public class PrimeCheck {
    public static boolean isPrime(int n, int i) {
        if (n <= 1) return false;
        if (i == 1) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(isPrime(n, n - 1) ? "Prime" : "Composite");
    }
}
