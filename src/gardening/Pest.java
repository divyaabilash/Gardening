package gardening;

import org.apache.log4j.Logger;
import gardening.manual.ManualOverride;


public class Pest {
	private static final Logger logger = Logger.getLogger("Pesticide class");
	public static double PesticideLevel;
	static double minlevel;
	static double maxlevel;
	boolean pesticideOn;
	ManualOverride manual = new ManualOverride();
	public double getPesticideLevel(){
		logger.info("pesticide Level"+PesticideLevel);
		return PesticideLevel;	
	}
	public boolean setPesticidelevel(double pesticide){
		PesticideLevel=pesticide;
		logger.info("setting minimum Pesticide Level"+PesticideLevel);
//		System.out.println("fertilizerLevel"+ PesticideLevel);
		return true;
	}
	public void pesticideon(){
		if(PesticideLevel < minlevel){
			setPesticideOn(true);
			logger.info("Switching on the Pesticide");
		}else{
			setPesticideOn(false);
			logger.info("Switching off Pesticide");
		}
	}
	public void setPesticideOn(boolean b){	 
		pesticideOn = true;
	}

	public void setpesticideOff(boolean b){
		pesticideOn=false;
	}

	public void setminmax(double min, double max){
		minlevel = min;
		maxlevel = max;
		logger.info("Pesticide minimum level should be "+minlevel);
		logger.info("Pesticide minimum level should be "+maxlevel);
	}

	public void checkpesticide(){
		int i;
		
		if(PesticideLevel < minlevel  && pesticideOn){
			for(i= (int) PesticideLevel; i<maxlevel;i++){
				PesticideLevel++;
				logger.info("The Current Level of the pesticide is "+PesticideLevel);
				System.out.println(PesticideLevel);
			}
		}
	}


	public void pesticiderun() {
		// TODO Auto-generated method stub		
			pesticideon();
			checkpesticide();
			
	}
		

	}

