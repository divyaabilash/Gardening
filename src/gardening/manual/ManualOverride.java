package gardening.manual;

import gardening.watersystem.WaterLevel;
import gardning.heatingsystem.Temperature;

public class ManualOverride implements Runnable{

 public boolean manualoverideStatus;
 public double manualtemperatures,manualwater,manualfertilier;
 WaterLevel w = new WaterLevel();
 Temperature t = new Temperature();
	Thread th=new Thread();
	public  boolean getManualOverideStatus(){
		return manualoverideStatus;
	}
	
	public  void setManualOverideoff(boolean b){
		manualoverideStatus =b;
		System.out.println("Manual Gardening is Off");
	}

	public void setManualOverideOn(){
		manualoverideStatus = true;
		th.run();
	}
//	public void setManualOverideOn(boolean b, double manualtemperature, double manualwaterlevel,
//			double manualfertilierlevel) {
//		// TODO Auto-generated method stub
//		manualoverideStatus = b;
//		manualtemperatures =manualtemperature;
//		manualwater=manualwaterlevel;
//		manualfertilier = manualfertilierlevel;
//		System.out.println("Manual Gardening is On ");
//	}
	
	public double getmanualtemparetureOverideValue(){
		return manualtemperatures;
	}
	public double getmanualfertilizerOverideValue(){
		return manualfertilier;
	}
	public double getmanualwaterOverideValue(){
		return manualwater;
	}

	@Override
	public void run() {
		if(manualoverideStatus){
			w.setWaterLevel(manualwater);
			t.setmanualtemp(manualtemperatures);
		}else{
			stop();
		}
		try {
			Thread.sleep(100);	
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stop(){
		th.interrupt();
	}
	



}
