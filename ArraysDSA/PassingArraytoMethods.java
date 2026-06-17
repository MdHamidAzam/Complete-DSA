package ArraysDSA;

public class PassingArraytoMethods {
    public static void main(String[] args) {
        // int x = 5;
        // System.out.println(x);
        // change(x);
                // System.out.println(x);
        int[] arr = {10,20,30,40};
        System.out.println(arr[0]);
        change(arr);
        System.out.println(arr[0]);
            }
        
            public static void change(int[] arr) { // arr ka name bhi change kr denge to value change hogi but int me nhi
                            arr[0] = 90;
            }

}
