package String;

public class IndexOfAndComparedTo {
    public static void main(String[] args) {
        String str = "Hamid Azam";
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.indexOf('e')); // If any word is not present in the string then return -1;

        // Compared To;

        String a = "abb";
        String b = "aab"; // Compare to means its ascii value (b-a)
        System.out.println(a.compareTo(b)); //  if any string is greater to another then return length; aabggg

        // Contains,  StartsWith, EndWith;

        String str1 = "Md Hamid Azam";
        System.out.println(str1.contains("mid"));
        System.out.println(str1.startsWith("Md"));
        System.out.println(str1.endsWith("Am"));
    }
}
