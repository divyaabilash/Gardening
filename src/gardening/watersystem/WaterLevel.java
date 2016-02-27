package gardening.watersystem;

import org.apache.log4j.Logger;

public class WaterLevel{
 double currentwaterlevel,minWaterLevels,changedwaterlevel,maxwaterlevels;
 private static final Logger logger = Logger.getLogger("Sprinkler Watering class");
Sprinkler sprinkler = new Sprinkler();

public  void setWaterLevel(double currentwater){	
	currentwaterlevel= currentwater;
	logger.info("The Current Water Lvele is"+currentwaterlevel);
}

public  double getWaterLevel(){
	return currentwaterlevel;
}

public  void PerferredWaterLevel(double minWaterLevel,double maxwaterlevel){
	minWaterLevels=minWaterLevel;
	maxwaterlevels =maxwaterlevel; 
}

public void checkWaterLevel() {
logger.info("inside checkWaterLevel Method");
	if(currentwaterlevel < minWaterLevels){
		logger.info("Calling Sprinker to on");
		sprinkler.setSprinkleron(true);		
	}
changeWaterLevelofPlant();
}

private void changeWaterLevelofPlant(){
	boolean sprinkleron;
	sprinkleron = sprinkler.getSprinklerStatus();
	if(sprinkleron){
		ChangeWaterLevel changewaterlevel= new ChangeWaterLevel();
		changedwaterlevel =changewaterlevel.toincreaseWaterLevel(currentwaterlevel,minWaterLevels);
	}
	if(changedwaterlevel == maxwaterlevels){
		sprinkler.setSprinkeroff(false);
		logger.info("Calling Sprinker to off");
	}
}


public void sprinkerrun() {
		logger.info("Checking the Water Level");
		checkWaterLevel();
		
}


}
