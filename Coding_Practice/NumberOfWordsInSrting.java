public class NumberOfWordsInSrting {
    public static void main(String[] args) {
        String str = "hello yogesh how are you";

        if(str == null || str.isEmpty()){
            System.out.println(0);
        }

        String[] carr = str.split(" ");


        System.out.println(carr.length);
    }
}
