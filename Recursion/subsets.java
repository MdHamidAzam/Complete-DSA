package Recursion;
import java.util.*;
public class subsets {
    static ArrayList<String> arr = new ArrayList<>();
    public static void printSubsets(int i,String s, String ans){
        if(i==s.length()){
        arr.add(ans);
        return;
        }
        char ch = s.charAt(i);
        printSubsets(i+1,s,ans); // Not Take
        printSubsets(i+1,s,ans+ch); // Take
    }
    public static void main(String[] args) {
        String s = "abc";
        printSubsets(0,s,"");
        System.out.println(arr);
    }
}
