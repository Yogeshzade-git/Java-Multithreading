import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        int arr[] = {9,9,9};

        System.out.println(Arrays.toString(plusone(arr)));
    }

    public static int[] plusone(int[] arr){

        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] < 9){
                arr[i]++;
                return arr;
            }else{
                arr[i]=0;
            }
        }
        int nArr[] = new int[arr.length + 1];
        nArr[0] = 1;
        return nArr;
    }
}
