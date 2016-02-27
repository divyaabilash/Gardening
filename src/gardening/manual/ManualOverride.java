package gardening.manual;

public class ManualOverride{

 public boolean manualoverideStatus;
 public double manualtemperatures,manualwater,manualfertilier;
	public  boolean getManualOverideStatus(){
		return manualoverideStatus;
	}
	
	public  void setManualOverideoff(boolean b){
		manualoverideStatus =b;
		System.out.println("Manual Gardening is Off");
	}

	public void setManualOverideOn(boolean b, double manualtemperature, double manualwaterlevel,
			double manualfertilierlevel) {
		// TODO Auto-generated method stub
		manualoverideStatus = b;
		manualtemperatures =manualtemperature;
		manualwater=manualwaterlevel;
		manualfertilier = manualfertilierlevel;
		System.out.println("Manual Gardening is On ");
	}
	
	public double getmanualtemparetureOverideValue(){
		return manualtemperatures;
	}
	public double getmanualfertilizerOverideValue(){
		return manualfertilier;
	}
	public double getmanualwaterOverideValue(){
		return manualwater;
	}
	



}
