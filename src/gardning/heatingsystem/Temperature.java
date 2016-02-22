package gardning.heatingsystem;

//getting temperature and setting min amd max temperature
public class Temperature {
static	double currenttemperature =0;
static double minTemperature, maxTemperature;
boolean cooler,heater;
	
	public static double getTemperature(){
		currenttemperature =65;//value should come form sensor
		return currenttemperature;
	}

	public static void perferredTemperature(double mintemp, double maxtemp) {
		// TODO Auto-generated method stub
		System.out.println("Preferredtemperature method");
		minTemperature = mintemp;
		maxTemperature = maxtemp;
		while(true){
			System.out.println("preferredtemperature while loop");
			new Temperature().checktemperature();
			
		}
	}
	public void checktemperature(){
		System.out.println("currenttemperature"+currenttemperature);
		if(currenttemperature >maxTemperature){
			System.out.println("setting on cooler");
			CoolerOn.setCooleron(true);

		}else if(currenttemperature < minTemperature){
			System.out.println("setting on Heater");
			Heater.setHeaterOn(true);
		}
		heater = Heater.getHeaterstatus();
		cooler =CoolerOn.getCoolerStatus();
		ChangeTemperature temp1 = new ChangeTemperature();
		temp1.changetemp(heater, cooler, currenttemperature, minTemperature, maxTemperature);
		if(!heater && !cooler){
			currenttemperature++;
		}
	}
	
}
