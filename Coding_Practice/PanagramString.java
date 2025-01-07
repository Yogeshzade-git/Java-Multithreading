public class PanagramString {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";
        char charr[] = str.toLowerCase().toCharArray();
        boolean seen[] = new boolean[26];

        boolean res = true;

        for(int i=0; i<seen.length; i++){
            seen[i] = true;
        }


        for(char ch : charr){
            if(seen[ch - 'a'] = true){
            }else{
                res=false;
            }
        }

        System.out.println( str + "is " + res +  " panagram");
    }
}
