package gardning.heatingsystem;

public class CoolerOn {
	static boolean coolerStatus;
	
//	public static void main(String[] args) {
//		new CoolerOn();
//		CoolerOn.setCoolerOff(true);
//		System.out.println(coolerStatus);
//	}
public static boolean getCoolerStatus(){
			return coolerStatus;
}
public static void setCooleron(boolean b) {
	// TODO Auto-generated method stub
	coolerStatus=b;
}
public static void setCoolerOff(boolean b){
	coolerStatus = b;
//	System.out.println(coolerStatus);
}
	
}
