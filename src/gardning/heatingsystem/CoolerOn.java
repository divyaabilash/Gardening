package gardning.heatingsystem;

public class CoolerOn {
	 boolean coolerStatus;
	
//	public static void main(String[] args) {
//		new CoolerOn();
//		CoolerOn.setCoolerOff(true);
//		System.out.println(coolerStatus);
//	}
public  boolean getCoolerStatus(){
			return coolerStatus;
}
public  void setCooleron(boolean b) {
	coolerStatus=b;
	
}
public  void setCoolerOff(boolean b){
	coolerStatus = b;
}
	
}
