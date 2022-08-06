package week1.day1;

public class TwoWheeler {
	int noOfWheels = 4;
	short noOfMirrors = 2;
	long chassisNumber = 54675679L;
	boolean isPunctured = true;
	String bikeName = "R15";
	double runningKM = 67.89;

	public static void main(String[] args) {
		TwoWheeler myobj = new TwoWheeler();
		System.out.println("no fo wheels :"+myobj.noOfWheels);
		System.out.println(		"no of mirrors :"+myobj.noOfMirrors);
		System.out.println(	"no of chassis number :"+myobj.chassisNumber);
		System.out.println(	"is Punctured:"+myobj.isPunctured);
		System.out.println(	"bikeName:"+myobj.bikeName);
		System.out.println("runningKM:"+myobj.runningKM);
	}
}
