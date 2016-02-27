package gardening.plants;

import org.apache.log4j.Logger;

import gardening.Pest;
import gardening.fertility.Fertilizer;
import gardening.general.CommonEntity;
import gardening.watersystem.Humdity;
import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;
public class Rose  extends FlowerPlants implements Plant,Runnable{

	WaterLevel water = new WaterLevel();
	Temperature temp = new Temperature();
	Humdity h = new Humdity();
	Pest p = new Pest();
	Thread Rosethread = new Thread();
	Fertilizer f = new Fertilizer();
	int count =0,lengthofPlant=0;
	double initallength=0;
	int plantgrowth =100;
	 private static final Logger logger = Logger.getLogger("Rose Plant");
	public void prefferedvalues(){
		CommonEntity en = new CommonEntity();
		en.setcommon();
		double waterset = en.CurrentWater;
		double fertilizer =en.CurrentFertility;
		double manualtemperatures = en.CurrentTemp;
		logger.info("Setting Favourable climate paramters");
	temp.perferredTemperature(45, 70);
	water.PerferredWaterLevel(34, 89);
	f.setminmax(95, 100);
	water.setWaterLevel(waterset);	
	f.setFertlizerlevel(fertilizer);
	temp.setmanualtemp(manualtemperatures);
	h.setminmax(45);
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
		initallength = initallength+(.005);
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

		while (!Rosethread.isInterrupted()){
			System.out.println("Thread Started"+count);
			watering();
			humdity();
			pest();
			fertilizer();
			temperature();
			try {
				//sleeping for 10minute of the day 
				Thread.sleep(333/100);
				
				System.out.println("Thread Sleeping");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(initallength != plantgrowth ){
				lifeSpan();
				logger.info("Rose plant is Growing");
			}else{
				logger.info("Come to see the White Rose Flowers Thats Blossomed");
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
