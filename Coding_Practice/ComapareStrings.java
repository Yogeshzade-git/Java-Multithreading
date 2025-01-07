public class ComapareStrings {
    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Geeks";
        String str3 = "Hello";

        //reverse string
        StringBuilder sb = new StringBuilder(str1);
        System.out.println(sb.reverse());

        char carr[] = str1.toCharArray();
        for(int i=carr.length-1; i>=0; i--){
            System.out.print(carr[i]);
        }
        System.out.println();

        //comapre String

        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str1.equalsIgnoreCase(str3));

        System.out.println(str1.compareToIgnoreCase(str3));   ///return 0 means equal -1 means smaller than second string and posive means grater that second string
    }
}
