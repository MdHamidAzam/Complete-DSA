package Recursion;

public class FunctionCalls {
    public static void mango(){
        System.out.println("I am in mango");
    }
    public static void apple(){
        mango();
        System.out.println("I am in apple");
    }
    public static void banana(){
        apple();
        System.out.println("I am in banana");
        mango();
    }
    public static void main(String[] args) {
        System.out.println("I am in main");
        banana();
    }
}
