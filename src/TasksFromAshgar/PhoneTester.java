package TasksFromAshgar;

public class PhoneTester {

	public static void main(String[] args) {
	// ctrl + f replace all
		
		Phone pixel=new Phone();
		pixel.make="pixel";
		pixel.model="pixel 6";
		pixel.noOfCams=2;
		pixel.color="blue";
		pixel.screenSize=6.8;
		pixel.os="ANdroid 12";
		pixel.phoneNumber=561;
		pixel.makeCall();
		pixel.takePictures();
		pixel.printCompleteInfo();

	}

}
