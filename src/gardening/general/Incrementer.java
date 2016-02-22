package gardening.general;

import java.util.concurrent.TimeUnit;

public class Incrementer {
	
//	public static void main(String[] args) {
//		double j;
//		Incrementer i = new Incrementer();
//		j=i.increase(0, 45);
//		System.out.println("tochange return value"+j);
//	}

	//eg: currentvalue is current temperature and tochangevalue is the min temperature value
	public static double increase(double currentvalue,double tochangevalue){
		double tochange;
		for(tochange=currentvalue;tochange<tochangevalue;tochange++){
			try {
				System.out.println(tochange);
				// decrease in temperature for very 5 minutes
				TimeUnit.MICROSECONDS.sleep(333 * 5);
			} catch (Exception e) {
				System.out.println("Exception caught");
			}
			System.out.println(tochange);
		}
	return tochange;
	}
	
}
