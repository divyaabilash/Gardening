package gardning.heatingsystem;

import gardening.general.Decrementer;
import gardening.general.Incrementer;

public class ChangeTemperature {
	public void changetemp(boolean heater, boolean cooler, double currenttemp, double mintemp, double maxtemp) {
//		double temp = currenttemp;
		double temp1 = 0;
		System.out.println("change temperature.java  method");
		if (heater) {
			temp1 =Incrementer.increase(currenttemp, mintemp);
			if (temp1 == mintemp) {
				Heater.setHeaterOff(false);
				System.out.println("Setting off the heater");
			}
		}else if (cooler) {
			System.out.println("calling decrement");
				temp1=Decrementer.decrease(currenttemp, maxtemp);
				if (temp1 == maxtemp) {
					CoolerOn.setCoolerOff(false);
					System.out.println("Setting off the cooler");
				}
		}

	}
 }
