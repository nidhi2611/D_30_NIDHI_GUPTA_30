package occurence;

import java.util.Scanner;

public class MyOccurence {
    public static void occurence(int arr[], int element) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(i + 1);
                ++counter;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrray");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("enter the element");
        int element = sc.nextInt();
        occurence(arr, element);
    }
}
