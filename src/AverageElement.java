import java.util.Scanner;

public class AverageElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        int sum = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            sum += arr[i];
        }

        double average = (double) sum / n;
        System.out.println(average);
    }
}
//Average
