import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        //int arr[] = {1, 2, 3, 4, 5, 6, 7};

        int arr[] = {1, 2, 3};


        //1. reverse array (0, arr.length-1)
        //2. reverse array (0, k-1)
        //3. reverse array (k, length-1)

        int k =4;
        //int k = 3;
        k = k % arr.length;

        rotate(arr, 0, arr.length-1);
        rotate(arr, 0, k-1);
        rotate(arr, k, arr.length-1 );

        System.out.println(Arrays.toString(arr));

    }


    public static int[] rotate(int arr[], int i, int j) {
        int temp = 0;
        while (i < j) {
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }


}
