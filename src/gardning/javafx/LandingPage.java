/**
 * 
 */
package gardning.javafx;
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
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}
Stage stage; 
int fieldnumber,heatercount,sprinkercount,copyfieldnumber;

	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub

		stage = primaryStage;
		fieldnumber = SettingField.show("Creating Fields");
		if (fieldnumber < 17 && fieldnumber > 0) {
			CreatingFieldLayout.create(fieldnumber);
		}

		// setting heater and sprinkler count
		GettingNumberOfHeaters heaterscount = new GettingNumberOfHeaters();
		heatercount = heaterscount.numberofheaters(fieldnumber);
		sprinkercount = fieldnumber;
		System.out.println(heatercount);
		System.out.println(sprinkercount);

	}
	

}
