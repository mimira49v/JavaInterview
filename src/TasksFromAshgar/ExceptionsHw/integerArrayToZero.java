package TasksFromAshgar.ExceptionsHw;

public class integerArrayToZero {
    //  integer array sum to zero sout 0 okey and exit code 0 okey as output
        public static void main(String[] args) {
            arraySumToZero(34);
        }

        public static int[] arraySumToZero(int N) {
            if (N == 1) {
                return new int[]{0};
            }
            int num = N / 2;
            int[] res = new int[N];
            int index = 0;
            while (num > 0) {
                res[index++] = num;
                res[index++] = num * -1;
                num--;
            }
            if (N % 2 != 0) {
                res[res.length - 1] = 0;
            }
            return res;
        }
    }
