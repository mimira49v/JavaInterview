package TasksFromAshgar;

public class Phone {
	
	String make;
	String model;
	int noOfCams;
	String color;
	double screenSize;
	String os;
	int phoneNumber;
	
	void makeCall() {
		System.out.println("Making a call");
	}
	
	void takePictures() {
		System.out.println("Taking pictures");
	}
	
	void printCompleteInfo() {

		System.out.println("make "       +make);
		System.out.println("model "      +model);
		System.out.println("noOfCams "   +noOfCams);
		System.out.println("color "      +color);
		System.out.println("screenSize  "+screenSize);
		System.out.println("os "         +os);
		System.out.println("phoneNumber "+phoneNumber);

	}
	
	public static void main(String[] args) {
		
		Phone iphone=new Phone();
		iphone.make="Apple";
		iphone.model="Iphone 13 pro max";
		iphone.noOfCams=3;
		iphone.color="blue";
		iphone.screenSize=6.8;
		iphone.os="IOS";
		iphone.phoneNumber=561;
		iphone.makeCall();
		iphone.takePictures();
		
		Phone samsung=new Phone();
		samsung.make="Samsung";
		samsung.model="S22 ultra";
		samsung.noOfCams=4;
		samsung.color="black";
		iphone.printCompleteInfo();
		
		
		
	}

}
