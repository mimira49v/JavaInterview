package UDEMY;

import java.util.PriorityQueue;

public class Line {
    public static void main(String[] args) {
        PriorityQueue <String> line = new PriorityQueue<String>();
        line.add("David");
        line.add("Cynthia");
        line.add("Raymond");
        line.add("Bryan");
        for (String n: line) {
            System.out.println(n);
        }
        System.out.println("========================");

        line.poll();
        for (String n : line) {
            System.out.println(n);
        }
        System.out.println("========================");
        line.remove("Raymond");
        for (String n : line) {
            System.out.println(n);
        }
    }
}
