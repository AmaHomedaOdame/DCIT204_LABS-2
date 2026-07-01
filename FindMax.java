import java.util.Scanner;

public class FindMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        int max = arr[0];
        int maxIndex = 0;

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];       
                maxIndex = i;       
            }
        }

        System.out.println("\nThe biggest number is: " + max);
        System.out.println("It is found at index: " + maxIndex);

        sc.close();
    }
}