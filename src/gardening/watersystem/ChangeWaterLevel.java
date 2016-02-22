package gardening.watersystem;

import gardening.general.Incrementer;

public class ChangeWaterLevel {
double newWaterLevel;
	public void toincreaseWaterLevel(double currentwaterlevel, double minWaterLevels) {
		// TODO Auto-generated method stub
		newWaterLevel=Incrementer.increase(currentwaterlevel, minWaterLevels);
			
	if(newWaterLevel == minWaterLevels){
		Sprinkler.setSprinkeroff(true);
System.out.println("Setting of the Sprinkler");
	}
	}
	
}
