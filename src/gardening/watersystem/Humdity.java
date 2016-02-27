package gardening.watersystem;

import org.apache.log4j.Logger;

import gardening.manual.ManualOverride;

public class Humdity {
	private static final Logger logger = Logger.getLogger("humdity class");
	double humditLevel,minlevel;
	boolean humdifierOn;
	ManualOverride manual = new ManualOverride();
	public double getHumdifierLevel(){
		logger.info("FertilizerLevel"+humditLevel);
		return humditLevel;	
	}
	public boolean sethumditlevel(double humdity){
		humditLevel=humdity;
		logger.info("setting minimum humdity Level"+humditLevel);
		System.out.println("humdityLevel"+ humditLevel);
		return true;
	}
	public void humdit(){
		if(humditLevel < minlevel){
			sethumdifierOn(true);
			logger.info("Switching on the humdity");
		}else{
			sethumdifierOff(false);
			logger.info("Switching off humdity");
		}
	}
	public void sethumdifierOn(boolean b){	 
		humdifierOn = true;
	}

	public void sethumdifierOff(boolean b){
		humdifierOn=false;
	}

	public void setminmax(double min){
		minlevel = min;
		logger.info("humdity minimum level should be "+minlevel);
	}

	public void checkhumdity(){
		int i;
		
		if(humditLevel < minlevel  && humdifierOn){
			for(i= (int) humditLevel; i< minlevel+20;i++){
				humditLevel++;
				logger.info("The Current Level of the humdity is "+humditLevel);
				System.out.println(humditLevel);
			}
		}
	}


	public void humdifierrun() {		
		getHumdifierLevel();
			checkhumdity();
			
	}
}
