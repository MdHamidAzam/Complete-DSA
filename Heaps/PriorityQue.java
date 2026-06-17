package Heaps;

import java.util.*;

public class PriorityQue {

    static class Student implements Comparable<Student> { // Overriding
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new Student("A", 4));  // 0(logn)
        pq.add(new Student("C", 8));
        pq.add(new Student("H", 17));
        pq.add(new Student("F", 12));
        pq.add(new Student("S", 2));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+" -> "+ pq.peek().rank);  // 0(1)
            pq.remove(); // 0(logn)
        }
    }
}
