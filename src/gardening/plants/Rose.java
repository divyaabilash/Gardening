package gardening.plants;

import gardening.getseetter.Temperature;

public class Rose  extends FlowerPlants implements Plant{

	public static void main(String[] args) {
		Rose rose = new Rose();
		rose.temperature(23, 30);
	}
	
	@Override
	public void watering() {
		// TODO Auto-generated method stub
		
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

	
	
}
