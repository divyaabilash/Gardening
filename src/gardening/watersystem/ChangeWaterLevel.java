package gardening.watersystem;

import gardening.general.Incrementer;

public class ChangeWaterLevel {
double newWaterLevel;
	public double toincreaseWaterLevel(double currentwaterlevel, double minWaterLevels) {
		// TODO Auto-generated method stub
		Incrementer water= new Incrementer();
		newWaterLevel=water.increase(currentwaterlevel, minWaterLevels);
			
return newWaterLevel;
	}
	
}
