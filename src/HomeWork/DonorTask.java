package HomeWork;

public class DonorTask {

	public static void main(String[] args) {
		boolean eligible = false;
		int age = 37;
		int weight = 100;

		if (age >= 18) {
			System.out.println("Your age is eligible lets check weight");

			if (weight > 110) {
				System.out.println("You are eligible ");

			} else {

				System.out.println("Not eligible");

			}

		} else {

			System.out.println("Youre not eligible by age");

		}

	}
}