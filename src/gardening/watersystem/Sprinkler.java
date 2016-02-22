package gardening.watersystem;

public class Sprinkler {
static boolean sprinkerStatus;
	public static boolean getSprinklerStatus(){
		return sprinkerStatus;
	}
	
	public static void setSprinkleron(boolean b){
		sprinkerStatus = b;
		System.out.println("Sprinker is On ");
	}
	public static void setSprinkeroff(boolean b){
		sprinkerStatus =!b;
		System.out.println("Sprinkler is Off");
	}
}
