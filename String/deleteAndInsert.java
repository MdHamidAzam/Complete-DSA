package String;

public class deleteAndInsert {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("abcdef");
        System.out.println(sb);
        sb.deleteCharAt(3);
        System.out.println(sb); // abcef
        sb.append("xyz");
        System.out.println(sb); // abcefxyz
        sb.delete(3,8);
        System.out.println(sb); // deleted from e to z
        sb.insert(3,"def");
        System.out.println(sb);
        // sb.reverse(2,4);
        System.out.println(sb);
    }
}
