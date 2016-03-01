package gardening.watersystem;

import org.apache.log4j.Logger;

public class WaterLevel{
 public static double currentwaterlevel;
 double minWaterLevels,changedwaterlevel,maxwaterlevels;
 private static final Logger logger = Logger.getLogger("Sprinkler Watering class");
Sprinkler sprinkler = new Sprinkler();

public  void setWaterLevel(double currentwater){	
	currentwaterlevel= currentwater;
//	logger.info("The Current Water Lvele is"+currentwaterlevel);
}

public  double getWaterLevel(){
	return currentwaterlevel;
}

public  void PerferredWaterLevel(double minWaterLevel,double maxwaterlevel){
	minWaterLevels=minWaterLevel;
	maxwaterlevels =maxwaterlevel; 
}

public void checkWaterLevel() {
//logger.info("inside checkWaterLevel Method");
	if(currentwaterlevel < minWaterLevels){
		logger.info("Calling Sprinker to on");
		sprinkler.setSprinkleron(true);		
	}else if (currentwaterlevel > maxwaterlevels){
		logger.info("SPrinkler is not going switch on beczuse water level is already high ");
		for(int i=0;i<200;i++){
			currentwaterlevel-=0.5;
		}
	}
changeWaterLevelofPlant();
}

private void changeWaterLevelofPlant(){
	boolean sprinkleron;
	sprinkleron = sprinkler.getSprinklerStatus();
	if(sprinkleron){
		logger.info("Watering Plants");
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
