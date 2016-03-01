package gardening.fertility;
//import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;

import gardening.manual.ManualOverride;

public class Fertilizer{

private static final Logger logger = Logger.getLogger("Fertilizer class");
public static double fertilizerLevel;
double minlevel,maxlevel;
boolean fertilizerOn;
ManualOverride manual = new ManualOverride();
public double getFertilzerLevel(){
	logger.info("FertilizerLevel"+fertilizerLevel);
	return fertilizerLevel;	
}
public boolean setFertlizerlevel(double fertilizer){
	fertilizerLevel=fertilizer;
	logger.info("setting minimum Fertilizer Level"+fertilizerLevel);
	System.out.println("fertilizerLevel"+ fertilizerLevel);
	return true;
}
public void Fertilizeroning(){
	if(fertilizerLevel < minlevel){
		setFertliizerOn(true);
		logger.info("Switching on the Fertilizer");
	}else{
		setFertliizerOn(false);
		logger.info("Switching off Fertilizer");
	}
}
public void setFertliizerOn(boolean b){	 
	fertilizerOn = true;
}

public void setFertilizerOff(boolean b){
	fertilizerOn=false;
}

public void setminmax(double min, double max){
	minlevel = min;
	maxlevel = max;
	logger.info("Fertilizer minimum level should be "+minlevel);
	logger.info("Fertilizer minimum level should be "+maxlevel);
}

public void checkFertilizer(){
	int i;
	
	if(fertilizerLevel < minlevel  && fertilizerOn){
		for(i= (int) fertilizerLevel; i<maxlevel;i++){
			fertilizerLevel++;
			logger.info("The Current Level of the fertilizer is "+fertilizerLevel);
			System.out.println(fertilizerLevel);
		}
	}
}


public void fertilizerrun() {
	// TODO Auto-generated method stub		
		Fertilizeroning();
		checkFertilizer();
		
}
	

}
