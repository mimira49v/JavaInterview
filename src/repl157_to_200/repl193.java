package repl157_to_200;

import java.util.ArrayList;

/*
Add the values below:
111
222
333
444
555
666
Create a logic to calculate sum of the all the values in list.
Print the result of sum.
Expected Output:
Result of sum is 2331
 */
public class repl193    {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);

        double sum = 0;
        for(Integer d : list)
            sum += d;
        System.out.println(sum);

        // ANOTHER WAY

        double sum1 = 0;
        for(int i = 0; i < list.size(); i++)
            sum1 += list.get(i);
        System.out.println(sum1);
    }
}
