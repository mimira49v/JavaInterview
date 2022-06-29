package repl157_to_200;

import java.util.ArrayList;
import java.util.Scanner;

/*
Using Scanner class add 5 elements into ArrayList and then print all elements from that ArrayList all in 1 line
Numbers in:
4
62
8
5
4
Expected Output:
4 62 8 5 4
 */
public class repl188 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i <=4 ; i++) {
            list.add(scan.nextInt());
        }
        for (Integer s : list) {
            System.out.print(s+" ");
        }
    }
}
