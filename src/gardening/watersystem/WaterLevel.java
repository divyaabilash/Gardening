package gardening.watersystem;

public class WaterLevel{
 double currentwaterlevel,minWaterLevels,changedwaterlevel,maxwaterlevels;
Sprinkler sprinkler = new Sprinkler();

public  void setWaterLevel(double currentwater){	
	currentwaterlevel= currentwater;
}

public  double getWaterLevel(){
	return currentwaterlevel;
}

public  void PerferredWaterLevel(double minWaterLevel,double maxwaterlevel){
	minWaterLevels=minWaterLevel;
	maxwaterlevels =maxwaterlevel; 
//	while(true){
//	}
}

public void checkWaterLevel() {
	// TODO Auto-generated method stub
	System.out.println("inside checkWaterLevel Method");
	if(currentwaterlevel < minWaterLevels){
		System.out.println("Calling Sprinker on");
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
	}
}


public void sprinkerrun() {
		System.out.println("Water run");
		checkWaterLevel();
		
}


}
