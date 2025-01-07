public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,1,0,0,1,1,1,1,1,0};

        int max_count=0;
        int count=0;

        for(int i=0; i<arr.length; i++){
            if (arr[i] == 1){
                count++;
                max_count = Math.max(max_count, count);
            }else{
                count=0;
            }
        }
        System.out.println(max_count);

    }
}
