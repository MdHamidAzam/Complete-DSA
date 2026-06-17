package String;

public class Substring {
    public static void main(String[] args) {
        String a = "abcdef";
        System.out.println(a.substring(2)); // -->> print all next string after 2 index
        System.out.println(a.substring(2,4));
        System.out.println(a.substring(0,6));
        System.out.println(a.substring(2,2)); // Nothing will print
        System.out.println();

        // print all substring of "abcdef"

        int n = a.length();
        for(int i=0;i<n;i++){
            for (int j = i+1; j <= n; j++) {
                System.out.print(a.substring(i,j)+" ");
            }
            System.out.println();
        }
    }
}
