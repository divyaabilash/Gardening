package gardening.plants;

import gardening.logic.Temperature;
import gardening.logic.WaterLevel;

public class Rose  extends FlowerPlants implements Plant{

	public static void main(String[] args) {
		Rose rose = new Rose();
		rose.temperature(23, 30); //This one is for Checking the temperature function.
		rose.watering(50);
	}
	
	@Override
	public void watering(double minWaterLevel) {
		// TODO Auto-generated method stub
		System.out.println("inside Rose Water Method");
		WaterLevel.PerferredWaterLevel(minWaterLevel);
	}

	@Override
	public void temperature(double mintemp,double maxtemp) {
		// TODO Auto-generated method stub
		double mintempRose = mintemp;
		double maxtempRose = maxtemp;
		System.out.println("inside Rose temperature method");
		Temperature.perferredTemperature(mintempRose, maxtempRose);
		
	}

	@Override
	public void pest() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fertilizer() {
		// TODO Auto-generated method stub
		
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void watering() {
		// TODO Auto-generated method stub
		
	}

	
	
}
