package gardning.heatingsystem;

import java.util.ArrayList;

import gardening.manual.ManualOverride;
import gardening.sensors.TemperatureSensor;
import gardning.javafx.CreatingFieldLayout;

public class Temperature {
	
  double sensorTemp;
 double minTemperature, maxTemperature;
boolean cooler,heater;
 double manualTemp;
 double currentTemp;
 boolean check=true;

 CoolerOn cool = new CoolerOn();
 Heater hot= new Heater();
CreatingFieldLayout cfl =new CreatingFieldLayout();	
	
	public  double getTemperature(){
			
		TemperatureSensor tempSensor=new TemperatureSensor();
		ArrayList<Integer> intlist = new ArrayList<Integer>();
		
		intlist=tempSensor.sensor();

		check= cfl.manualChecker();
		ManualOverride manual=new ManualOverride();
		manualTemp=manual.getmanualtemparetureOverideValue();
		
		System.out.println("Inside get temperature");
		if(!check){
			System.out.println("Inside check option");
			System.out.println(intlist.size());
				
			for(int i=0; i<intlist.size(); i++){
				//sensorTemp=intlist.get(i); 
				System.out.println("Sensor is working");
			
				currentTemp=intlist.get(i);
				System.out.println("inside sensor loop" + i);			
			//System.out.println("Sensore working");
			}
			
		}else{
			currentTemp=manualTemp;
				System.out.println("Manual TEmperature" + currentTemp );					
		}
		return currentTemp;
		
	}

	public void perferredTemperature(double mintemp, double maxtemp) {
		// TODO Auto-generated method stub
		System.out.println("Preferredtemperature method");
		minTemperature = mintemp;
		maxTemperature = maxtemp;
		
	}
	public void checktemperature(double currentTemperature){
		System.out.println("currenttemperature"+currentTemp);
		if(currentTemperature >maxTemperature){
			System.out.println("setting on cooler");
			cool.setCooleron(true);

		}else if(currentTemperature < minTemperature){
			System.out.println("setting on Heater");
			hot.setHeaterOn(true);
		}
		heater = hot.getHeaterstatus();
		cooler =cool.getCoolerStatus();
		ChangeTemperature temp1 = new ChangeTemperature();
		temp1.changetemp(heater, cooler, currentTemperature, minTemperature, maxTemperature);
		if(!heater && !cooler){
			currentTemperature++;
		}
	}


	public void temprun() {
		getTemperature();
		checktemperature(currentTemp);
	}
	
}