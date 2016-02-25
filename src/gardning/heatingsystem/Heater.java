package gardning.heatingsystem;

public class Heater {
 boolean heaterStatus;
	public  boolean getHeaterstatus() {
		// TODO Auto-generated method stub
		System.out.println("current Heater status is "+heaterStatus);
		return heaterStatus;
		
	}
	public void setHeaterOn(boolean b) {
		// TODO Auto-generated method stub
		heaterStatus = b;
		System.out.println("Heater on");
	}
	public void setHeaterOff(boolean b){
		heaterStatus =b;
		System.out.println("Heater off");
	}
	
}
