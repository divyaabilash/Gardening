package gardening.watersystem;

public class Sprinkler {
static boolean sprinkerStatus;
	public boolean getSprinklerStatus(){
		return sprinkerStatus;
	}
	
	public void setSprinkleron(boolean b){
		sprinkerStatus = b;
		System.out.println("Sprinker is On ");
	}
	public void setSprinkeroff(boolean b){
		sprinkerStatus =!b;
		System.out.println("Sprinkler is Off");
	}
}
