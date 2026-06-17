package String;

public class Append {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("acb");
        System.out.println(sb);
        sb.append(35);
        System.out.println(sb);
        sb.append('*');
        System.out.println(sb);
        sb.append("xyz");
        System.out.println(sb);
        char[] ch = {'H','a','m','i','d'};
        sb.append(ch);
        System.out.println(sb);
        int[] arr = {1,2,3,4,5};
        sb.append(arr);
        System.out.println(sb);
        StringBuilder t = new StringBuilder("pqr");
        sb.append(t);
        System.out.println(sb);
    }
}
