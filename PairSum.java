import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target sum: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < n; i++) {

            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("\nPair found!");
                    System.out.println("Index " + i + " and index " + j);
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("\nNo pair adds up to " + target);
        }

        sc.close();
    }
}