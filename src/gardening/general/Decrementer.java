package gardening.general;

import java.util.concurrent.TimeUnit;

public class Decrementer {
		
public static double decrease(double currentvalue,double tochangevalue){
	double tochange;
	for(tochange=currentvalue;tochange>tochangevalue;tochange--){
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
