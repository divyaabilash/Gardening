package gardening.plants;

import org.apache.log4j.Logger;

import gardening.Pest;
import gardening.RandomEvents;
import gardening.fertility.Fertilizer;
import gardening.manual.ManualOverride;
import gardening.watersystem.Humdity;
import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;
public class Sunflower  extends FlowerPlants implements Plant,Runnable{
	RandomEvents r = new RandomEvents();
	WaterLevel water = new WaterLevel();
	Temperature temp = new Temperature();
	Humdity h = new Humdity();
	Pest p = new Pest();
	Thread Sunflowerthread = new Thread("Sunflowerthread");
	Fertilizer f = new Fertilizer();
	ManualOverride m = new ManualOverride();
	int count =0,lengthofPlant=0;
	double initallength=0;
	int plantgrowth =100;
	int d =0;
	 private static final Logger logger = Logger.getLogger("Sunflower Plant");
	public void prefferedvalues(){
		double waterset = 10;
		double fertilizer = 30;
		double manualtemperatures = 60;
	temp.perferredTemperature(35, 90);
	water.PerferredWaterLevel(20, 100);
	f.setminmax(30, 100);
	water.setWaterLevel(waterset);	
	f.setFertlizerlevel(fertilizer);
	temp.setmanualtemp(manualtemperatures);
	h.setminmax(25);
	h.sethumditlevel(6);
	p.setminmax(45, 75);
	p.setPesticidelevel(23);
	}

	@Override
	public void pest() {
	p.pesticiderun();
	}

	@Override
	public void fertilizer() {
		f.fertilizerrun();	
	}

	@Override
	public void lifeSpan() {
		initallength = initallength+(.002);
	}

	@Override
	public void humdity() {
		h.humdifierrun();
	}

	public void temperature() {
		
		temp.temprun();				
	}

	@Override
	public void watering() {	
		water.sprinkerrun();
	}

	@Override
	public void run() {

		while (!Sunflowerthread.isInterrupted()){
			System.out.println("Thread Started"+count);
			watering();
			humdity();
			pest();
			fertilizer();
			temperature();
			try {
				//sleeping for 10minute of the day 
				Thread.sleep(333/100);
				d ++;
				if(d%4 ==0){
				logger.info("Calling Randon Events");
				r.run();
				}
				System.out.println("Thread Sleeping");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(initallength != plantgrowth ){
				lifeSpan();
				logger.info("Sunflower plant is Growing");
			}else{
				logger.info("Come to see Sunflower Flowers Thats Blossomed");
				try {
					Thread.sleep(40000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				logger.info("You missed the Flowers and cut the plant to regrow");
			}
	
		}
	}


	
	
}
