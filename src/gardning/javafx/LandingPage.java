/**
 * 
 */
package gardning.javafx;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import gardning.heatingsystem.GettingNumberOfHeaters;
import javafx.application.Application;
import javafx.stage.Stage;

/**
 * @author divya
 *
 */
public class LandingPage extends Application {

	/**
	 * @param args
	 */
	private static final Logger logger = Logger.getLogger("Landing Page");
	public static void main(String[] args) {
Application.launch(args);
PropertyConfigurator.configure("log4j.properties");
logger.info("launching");
	}
Stage stage; 
int fieldnumber,heatercount,sprinkercount,copyfieldnumber;

	@Override
	public void start(Stage primaryStage) throws Exception {
		PropertyConfigurator.configure("log4j.properties");
		stage = primaryStage;
		fieldnumber = SettingField.show("Creating Fields");
		if (fieldnumber < 17 && fieldnumber > 0) {
			CreatingFieldLayout.create(fieldnumber);
			logger.info("Creating the Farms");
		}
		logger.info("Landing page started");
	     logger.info("Number of Fields Created:"+fieldnumber);  
		// setting heater and sprinkler count
		GettingNumberOfHeaters heaterscount = new GettingNumberOfHeaters();
		heatercount = heaterscount.numberofheaters(fieldnumber);
		logger.info("Number of Heaters:"+heatercount); 
		sprinkercount = fieldnumber;
		logger.info("Number of Sprinkler:"+sprinkercount);
	}
	

}
