package gardning.heatingsystem;

import gardening.general.Decrementer;
import gardening.general.Incrementer;

public class ChangeTemperature {
	public void changetemp(boolean heater, boolean cooler, double currenttemp, double mintemp, double maxtemp) {
//		double temp = currenttemp;
		double temp1 = 0;
		Incrementer incrementer = new Incrementer();
		Decrementer decrementer = new Decrementer();
		Heater heaterobj = new Heater();
		CoolerOn coolerobj = new CoolerOn();
		
		System.out.println("change temperature.java  method");
		if (heater) {
			temp1 =incrementer.increase(currenttemp, mintemp);
			if (temp1 == mintemp) {
				heaterobj.setHeaterOff(false);
				System.out.println("Setting off the heater");
			}
		}else if (cooler) {
			System.out.println("calling decrement");
				temp1=decrementer.decrease(currenttemp, maxtemp);
				if (temp1 == maxtemp) {
					coolerobj.setCoolerOff(false);
					System.out.println("Setting off the cooler");
				}
		}

	}
 }

