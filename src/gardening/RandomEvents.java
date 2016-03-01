package gardening;

import java.util.Random;

import org.apache.log4j.Logger;

import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;

public class RandomEvents implements Runnable {
	private static final Logger logger = Logger.getLogger("Random class");
	Temperature temp = new Temperature();
//	Sprinkler s = new Sprinkler();
	WaterLevel w =new WaterLevel();
	@Override

	public void run() {
		logger.info("Generating Random events");
		try {
			generateevent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void coldday(){
		temp.checktemperature(0);
		logger.info("ITs Really Cold day");
	}
	
	public void hotday(){
		temp.checktemperature(100);
		logger.info("Its really Hot Day");
	}
	
	public void raining(){
		w.setWaterLevel(100);
		logger.info("Its Raining day");
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
	Thread.sleep(100);
}
	
}
}
