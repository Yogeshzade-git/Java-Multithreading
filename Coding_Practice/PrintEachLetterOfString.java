public class PrintEachLetterOfString {
    public static void main(String[] args) {
        String str = "yogesh zade name ahe maz";

        String res = "";

        boolean v = true;

        for(int i=0; i<str.length(); i++){

            if(str.charAt(i) == ' '){
                v=true;
            }else if(str.charAt(i) != ' ' && v == true){
                res += str.charAt(i);
                v=false;
            }
        }

        System.out.println(res);
    }
}
