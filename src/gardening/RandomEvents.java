package gardening;

import java.util.Random;

import org.apache.log4j.Logger;

import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;

public class RandomEvents implements Runnable {
	private static final Logger logger = Logger.getLogger("Random class");
//	Temperature temp = new Temperature();
////	Sprinkler s = new Sprinkler();
//	WaterLevel w =new WaterLevel();
//	Pest p = new Pest();
	@Override

	public void run() {
		logger.info("Generating Random events");
		try {
			generateevent();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void coldday(){
		logger.info("ITs Really Cold day");
		Temperature.currentTemp = 0;
//		temp.setmanualtemp(0);
		
	}
	
	public void hotday(){
		logger.info("Its really Hot Day");
		Temperature.currentTemp=100;
//		temp.setmanualtemp(100);
	
	}
	
	public void raining(){
		logger.info("Its Raining day");
		WaterLevel.currentwaterlevel=100;
	}
	public void pesticide(){
		logger.info("Pests Have Attacked Plant");
		Pest.PesticideLevel=0;
		
	}
	
	public void generateevent() throws InterruptedException{
		Random ran = new Random();
		int x = ran.nextInt(6);
if(x%2==0){
	coldday();
}else if(x%3==0){
	raining();
}else if(x%5==0){
	hotday();
}else{
	pesticide();
}
	
}
}
