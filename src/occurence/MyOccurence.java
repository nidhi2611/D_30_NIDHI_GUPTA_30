package occurence;

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

}
