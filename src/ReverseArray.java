import java.util.Scanner;

public class ReverseArray {
    public static void reverse(int index, int[] arr) {
        if (index < 0) return;
        System.out.print(arr[index] + " ");
        reverse(index - 1, arr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        reverse(n - 1, arr);
    }
}
