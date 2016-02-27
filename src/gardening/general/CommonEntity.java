package gardening.general;

import gardening.manual.ManualOverride;

public class CommonEntity {
	public double CurrentWater,
	CurrentTemp;
	public double CurrentFertility;
  ManualOverride manual = new ManualOverride();
public void setcommon(){
	if(manual.getManualOverideStatus()){
		CurrentFertility=manual.getmanualfertilizerOverideValue();
		CurrentWater = manual.getmanualwaterOverideValue();
		CurrentTemp = manual.getmanualtemparetureOverideValue();
	}else{	
		CurrentFertility = 45;
		CurrentWater =35;
	}
}

}
