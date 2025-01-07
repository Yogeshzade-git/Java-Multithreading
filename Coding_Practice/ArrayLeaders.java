public class ArrayLeaders {
    public static void main(String[] args) {
        int arr[] = {15,18,5,3,6,2};

        int max = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i] > max){
                max=arr[i];
                System.out.print(arr[i] + " ");
            }
        }
    }
}
