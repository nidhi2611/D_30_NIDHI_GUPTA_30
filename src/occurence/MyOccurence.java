package occurence;

import java.util.Scanner;

public class MyOccurence {
    public static void occurence(int arr[], int element) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println("elment found at index+" + i + 1);
                ++counter;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the arrray");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements in the array");
        for (int j = 0; j < arr.length; j++) {
            arr[j] = sc.nextInt();
        }
        System.out.println("enter the element to be searched for");
        int element = sc.nextInt();
        occurence(arr, element);
    }
}
