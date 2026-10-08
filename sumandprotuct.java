import java.util.Scanner;

public class ArraySumProduct {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");

        int sum = 0;
        int product = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
            product *= arr[i];
        }

        System.out.println("Sum = " + sum);
        System.out.println("Product = " + product);

        sc.close();
    }
}S