package String;

public class ModifyCharacterInString {
    public static void main(String[] args) {
    String s = "Hello";
    // s = Heylo;
    // Second index change to y
    s = s.substring(0,2) + 'y' + s.substring(3);
    System.out.println(s);
    }
}
