package TasksFromAshgar;

public class swapTwoString {
    public static void main(String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Before swapping: ");
        System.out.println(a);
        System.out.println(b);
        //1. append a and b
        a = a+b; // helloWorld
        // 2. store initial string a in String b
        b = a.substring(0, a.length()-b.length());
        // 3. Store initial string b in String a
        a = a.substring(b.length());
        System.out.println(a);
        System.out.println(b);
    }
}
