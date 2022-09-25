import java.util.*;

public class practice {

    public static void main(String[] args) {
        int a[] = {52, 67, 32, 43, 32, 52, 52, 5, 0, 3, 2, 0, 0};
        Arrays.sort(a);
        int len = a[a.length - 1] + 1;
        int count[] = new int[len];
        for (int n : a) {
            count[n]++;
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] >= 1) {
                System.out.println("count:" + j + "---" + count[j]);
            }
        }
    }
}
