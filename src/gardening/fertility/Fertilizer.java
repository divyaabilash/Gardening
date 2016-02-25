package gardening.fertility;
//import java.util.concurrent.TimeUnit;

public class Fertilizer{

double fertilizerLevel,minlevel,maxlevel;
boolean fertilizerOn;
public double getFertilzerLevel(){
	return fertilizerLevel;
	
}
public boolean setFertlizerlevel(double fertilizer){
	fertilizerLevel = fertilizer;
	System.out.println("fertilizerLevel"+ fertilizerLevel);
	return true;
}
public void Fertilizeroning(){
	if(fertilizerLevel < minlevel){
		setFertliizerOn(true);
	}else{
		setFertliizerOn(false);
	}
}
public void setFertliizerOn(boolean b){	 
	fertilizerOn = true;
}

public void setFertilizerOff(boolean b){
	fertilizerOn=false;
}

public void setminmax(double min, double max){
	minlevel = min;
	maxlevel = max;
}

public void checkFertilizer(){
	int i;
	
	if(fertilizerLevel < minlevel  && fertilizerOn){
		for(i= (int) fertilizerLevel; i<maxlevel;i++){
			fertilizerLevel++;
			System.out.println(fertilizerLevel);;
			try {
				Thread.sleep(333/2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public void fertilizerrun() {
	// TODO Auto-generated method stub		
		Fertilizeroning();
		checkFertilizer();
		
}
	

}
