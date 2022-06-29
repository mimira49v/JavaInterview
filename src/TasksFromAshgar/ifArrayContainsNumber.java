package TasksFromAshgar;

public class ifArrayContainsNumber {
    public static boolean check(int [] arr,int z){
        boolean result = true;
        for (int i = 0; i < arr.length; i++) {
            int y=arr[i];
            if(y==z){
                result = true;
                break;
            }else {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // checking if arr contains myNum
        int [] arr = new int[] {1,2,3,4,5};
        int myNum = 3;
        System.out.println( check(arr,3));
    }
}
