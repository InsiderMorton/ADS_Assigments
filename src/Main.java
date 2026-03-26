import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a task:");
        System.out.println("1 - Sum of squares");
        System.out.println("2 - Sum of array");
        System.out.println("3 - Sum of powers");
        System.out.println("4 - Reverse sequence");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter n: ");
                int n1 = sc.nextInt();
                System.out.println("Result: " + SumSquares.calculate(n1));
                break;

            case 2:
                System.out.print("Enter array size: ");
                int size = sc.nextInt();

                int[] arr = new int[size];

                System.out.println("Enter elements:");
                for (int i = 0; i < size; i++) {
                    arr[i] = sc.nextInt();
                }

                System.out.println("Result: " + SumArray.calculate(arr, size));
                break;

            case 3:
                System.out.print("Enter base (b): ");
                int b = sc.nextInt();

                System.out.print("Enter power (n): ");
                int n3 = sc.nextInt();

                System.out.println("Result: " + PowerSum.calculate(b, n3));
                break;

            case 4:
                System.out.print("Enter number of elements: ");
                int n4 = sc.nextInt();

                System.out.println("Enter elements:");
                Reverse.printReverse(n4, sc);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}