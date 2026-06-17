package String;

public class PlusOperator {
    public static void main(String[] args) {
        String s = "abc";
        String t = "def";
        s = s + t;
        s = s + 10;
        s = s + 10 + 20;
        System.out.println(s);
        System.out.println(s+10+20);
        System.out.println(10+20+s);
    }
}
