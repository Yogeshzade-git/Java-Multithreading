import java.util.Arrays;

public class ArrayMedian {

    public static void main(String[] args) {
        int arr[] = {12,4,5,9,8,6};

        System.out.println(arrayMedian(arr));
    }

    public static double arrayMedian(int[] arr) {

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int n = arr.length;

        if(n%2 == 1){
            return arr[n/2];
        }else{
            return ((arr[n-1]/2 + arr[n/2])/2.0);
        }
    }
}
