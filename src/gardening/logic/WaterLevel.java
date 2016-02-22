package gardening.logic;

import gardening.watersystem.Sprinkler;

public class WaterLevel {
static double currentwaterlevel,minWaterLevels;

public static double getWaterLevel(){
	currentwaterlevel = 0;
	return currentwaterlevel;
}

public static void PerferredWaterLevel(double minWaterLevel){
	WaterLevel.minWaterLevels=minWaterLevel;
	while(true){
		new WaterLevel().checkWaterLevel(minWaterLevels);
	}
}

private void checkWaterLevel(double minWaterLevels2) {
	// TODO Auto-generated method stub
	System.out.println("inside checkWaterLevel Method");
	if(currentwaterlevel < minWaterLevels2){
		System.out.println("Calling Sprinker on");
		Sprinkler.setSprinkleron(true);		
	}
	new WaterLevel().changeWaterLevelofPlant();
}

private void changeWaterLevelofPlant(){
	boolean sprinkleron;
	sprinkleron = Sprinkler.getSprinklerStatus();
	if(sprinkleron){
		new ChangeWaterLevel().toincreaseWaterLevel(currentwaterlevel,minWaterLevels);
	}
}

}
