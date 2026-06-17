package String;

public class Equals {
    public static void main(String[] args) {
        String s = "abcxyz";
        String a = "abcxyz";
        String b = new String(s);
        String c = "abc";
        c = c + "xyz";
        System.out.println(s==b); // Because its compare only Address
        System.out.println(s.equals(b)); // but ye character by chararcter compare krega
    }
}
