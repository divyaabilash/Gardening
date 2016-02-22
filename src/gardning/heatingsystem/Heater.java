package gardning.heatingsystem;

public class Heater {
static boolean heaterStatus;
	public static boolean getHeaterstatus() {
		// TODO Auto-generated method stub
		System.out.println("current Heater status is "+heaterStatus);
		return heaterStatus;
		
	}
	public static void setHeaterOn(boolean b) {
		// TODO Auto-generated method stub
		heaterStatus = b;
		System.out.println("Heater on");
	}
	public static void setHeaterOff(boolean b){
		heaterStatus =b;
		System.out.println("Heater off");
	}
	
}
