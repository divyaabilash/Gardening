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
	private static final Logger logger = Logger.getLogger(LandingPage.class);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
PropertyConfigurator.configure("log4j.properties");
logger.info("launching");
	}
Stage stage; 
int fieldnumber,heatercount,sprinkercount,copyfieldnumber;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		PropertyConfigurator.configure("log4j.properties");
		stage = primaryStage;
		fieldnumber = SettingField.show("Creating Fields");
		if (fieldnumber < 17 && fieldnumber > 0) {
			CreatingFieldLayout.create(fieldnumber);
		}
		logger.info("Landing page started");
	       
		// setting heater and sprinkler count
		GettingNumberOfHeaters heaterscount = new GettingNumberOfHeaters();
		heatercount = heaterscount.numberofheaters(fieldnumber);
		sprinkercount = fieldnumber;
		System.out.println(heatercount);
		System.out.println(sprinkercount);

	}
	

}
