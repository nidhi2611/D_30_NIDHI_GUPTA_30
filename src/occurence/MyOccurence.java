package occurence;

import java.util.Scanner;

public class MyOccurence {
    public static boolean occurence(int arr[], int element) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == element) {
                System.out.println(i + 1);
                ++counter;
            }
        }
        if (counter > 1)
            return true;
        else
            return false;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

    }
}
