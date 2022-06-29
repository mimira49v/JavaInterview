package HomeWork;

public class LogicalNot {

	public static void main(String[] args) {
		// logical not is used to revert the condition 
		boolean value=!false;
		System.out.println(value);
		System.out.println("---------------------------------------------");
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time to work");
		}
		String day = "Saturday";
		if(!day.equals("Saturday")) {
			System.out.println("Today is not saturday");
		}
		
		boolean checkbox = false;
		if(!checkbox) {
			System.out.println("I will click on that checkbox");
		}
		String java="easy";
		// if (java) --> cant do this cuz its a string if only works with a boolean!!!!!! ****
		
		if (!java.equals("Hard")) {
			System.out.println("you are genious");
		}
		
		
		
		System.out.println("---------------  THE END  -------------------");
		
		
		
		
		
 }
}
