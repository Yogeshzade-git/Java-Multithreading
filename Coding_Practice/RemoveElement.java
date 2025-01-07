import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {

        int arr[] = {3, 2, 2, 3, 5, 2, 7, 4, 2, 3, 7};
        int element = 3;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                arr[count] = arr[i];
                count++;
            }
        }
        while (count < arr.length) {
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));

    }
}
