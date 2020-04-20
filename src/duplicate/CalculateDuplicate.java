package duplicate;

import java.util.HashSet;
import java.util.Scanner;

public class CalculateDuplicate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        HashSet<Integer> set = new HashSet<Integer>();
        for (int k = 0; k < n; k++) {
            set.add(arr[k]);
        }

    }

    public void duplicate() {

    }
}
