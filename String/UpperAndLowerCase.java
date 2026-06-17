package String;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        String str = "Hamid is a 19 years old";
        System.out.println();
        System.out.println(str.toUpperCase()); // It is only copy
        str.toUpperCase(); // -->> Nothing will happen;
        str = str.toUpperCase(); // It stored permanently
        System.out.println(str);
        str = str.toLowerCase(); // It stored permanently
        System.out.println(str);
        System.out.println(str.toLowerCase());// It is only copy
        System.out.println();

        // Concat

        String a = "Hamid ";
        String b = "Azam";
        // System.out.println(a.reverse());
        System.out.println(a.concat(b));
        a.concat(b); // -->> Nothing wil happen
        System.out.println(a);
        a = a.concat(b);
        System.out.println(a);
    }

}
