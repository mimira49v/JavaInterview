package reviewClass;

public class task05 {
    String clock(int hour, int min) {
        return (hour + ":" + min);
    }

    public static void main(String[] args) {
        task05 obj = new task05();

        String result = obj.clock(11, 30);
        System.out.println(result);
    }
}