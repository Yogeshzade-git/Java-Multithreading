import java.util.ArrayList;
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {

        int arr[] = {1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 6};

        int count = 0;

        for (int i=0; i<arr.length; i++){
            if(i<arr.length-1 && arr[i] == arr[i+1]){

            }else{
                arr[count] = arr[i];
                count++;
            }
        }

        int res = count;

        while(count < arr.length){
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));

        System.out.println(res);

    }
}
