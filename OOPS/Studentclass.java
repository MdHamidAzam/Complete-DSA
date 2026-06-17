package OOPS;
public class Studentclass {
    public static class Student{
        String name;
        int rno;
        double percentage;
    }
   public static void main(String[] args) {
    Student x = new Student();  // Declaration
    x.name = "Hamid";
    x.rno = 34;
    x.percentage = 81.4;
    System.out.println(x.name);

    Student y = new Student();
    y.name = "Yuvraj";
    y.rno = 69;
    y.percentage = 89.5;
    System.out.println(x.percentage);
   } 
}
