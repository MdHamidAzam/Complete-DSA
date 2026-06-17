package ArraysDSA;

public class BasicSyntax {
    public static void main(String[] args) {
        // int x = 5;
        int[] arr = new int[5];
        // Initialing individual element
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        // Output of Array element
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");
        // updating array
        arr[0] = 90;
        arr[0] += 10;
        System.out.print(arr[0] + " ");
    }

}
