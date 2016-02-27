package gardening.watersystem;

import org.apache.log4j.Logger;

public class Sprinkler {

private static final Logger logger = Logger.getLogger("SprinkerStatus");
static boolean sprinkerStatus;
	public boolean getSprinklerStatus(){
		logger.info("SprinkerStatus"+sprinkerStatus);
		return sprinkerStatus;
	}
	
	public void setSprinkleron(boolean b){
		sprinkerStatus = b;
logger.info("Sprinker is On ");
	}
	public void setSprinkeroff(boolean b){
		sprinkerStatus =!b;
	logger.info("Sprinkler is Off");
	}
}
