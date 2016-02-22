package gardening.getseetter;

import java.util.concurrent.TimeUnit;

import gardening.cooler.CoolerOn;
import gardning.heatingsystem.Heater;

public class ChangeTemperature {
	public void changetemp(boolean heater, boolean cooler, double currenttemp, double mintemp, double maxtemp) {
		double temp = currenttemp;
		int i;
		int temp1 = (int) currenttemp;
		System.out.println("change temperature.java  method");
		if (heater) {
			for (i = temp1; i < maxtemp; i++) {
				try {
					temp++;
					System.out.println(temp);
					// increase in temperature for very 5 minutes
					TimeUnit.MICROSECONDS.sleep(333 * 5);
				} catch (Exception e) {
					System.out.println("Exception caught");
				}
			}
			if (temp == maxtemp) {
				Heater.setHeaterOff(true);
				System.out.println("Setting off the heater");
			}
		} else if (cooler) {
			for (i = temp1; i > mintemp; i--) {
				try {
					System.out.println(temp);
					temp--;
					// decrease in temperature for very 5 minutes
					TimeUnit.MICROSECONDS.sleep(333 * 5);
				} catch (Exception e) {
					System.out.println("Exception caught");
				}
			}
			if (temp == mintemp) {
				CoolerOn.setCoolerOff(true);
				System.out.println("Setting Cooler off");
			}
		}

	}
 }

