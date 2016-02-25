package gardening.plants;


import gardening.fertility.Fertilizer;

//import org.apache.log4j.Logger;

import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;
//import gardning.javafx.CreatingFieldLayout;

public class Sunflower  extends FlowerPlants implements Plant,Runnable{
	
	WaterLevel water = new WaterLevel();
	Temperature temp = new Temperature();
	Thread Rosethread = new Thread();
	Fertilizer f = new Fertilizer();
	int count =0;
	
	//private static final Logger logger = Logger.getLogger(Rose.class);

	@Override
	public void pest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fertilizer() {
		f.setminmax(95, 100);
		f.setFertlizerlevel(45);
		f.fertilizerrun();
//		f.run();	
	}

	@Override
	public void lifeSpan() {
		// TODO Auto-generated method stub
	
	}

	@Override
	public void humdity() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void temperature() {
		temp.perferredTemperature(45, 70);
		temp.temprun();				
	}

	@Override
	public void watering() {
		water.PerferredWaterLevel(34, 89);
		water.setWaterLevel(0);
		water.sprinkerrun();
//		water.run();
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (!Rosethread.isInterrupted()){
			System.out.println("Thread Started"+count);
			watering();
			temperature();
			fertilizer();
			try {
				//sleeping for 10minute of the day 
				Thread.sleep(333/100);
				System.out.println("Thread Sleeping");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	
	
}

