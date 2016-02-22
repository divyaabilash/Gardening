package gardning.javafx;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SettingField{
	

	final static int baseLength=200;
	final static int paddinglength=40;
	static int fieldnumbers;
	static HBox intro;
	static Label introlbl;
	static Label noOfFarm;
	static TextField fieldnumber;
	static Button Submit;
	static VBox vbox1;
	static Scene scene1;
	static Stage stage=new Stage();
	public static int show(String Title){
		
		stage.initModality(Modality.APPLICATION_MODAL);
		stage.setTitle(Title);
		stage.setMinWidth(500);
		
	
		Region spacer=new Region();
		
 introlbl = new Label("Enter Number Farm Field you would like to play(less than 17)");
		
		noOfFarm=new Label("Farm Fields");
		noOfFarm.setMaxSize(baseLength, baseLength);
		
		fieldnumber=new TextField();
		fieldnumber.setMaxSize(baseLength, baseLength);
		fieldnumber.setPromptText("9");
		fieldnumber.setTooltip(new Tooltip("Enter any number Less than 17"));
		
		intro =new HBox(10,noOfFarm,fieldnumber);
		 intro.setPadding(new Insets(paddinglength));
		 HBox.setHgrow(spacer, Priority.ALWAYS);
		 
		Submit=new Button("Create");
		Submit.setOnAction(e->createfields());
		Submit.setTooltip(new Tooltip("Click For Creating The Fields"));
		
		vbox1=new VBox(10,introlbl,intro,Submit);
		 vbox1.setPadding(new Insets(paddinglength));
		 VBox.setVgrow(spacer, Priority.ALWAYS);
		
		 scene1=new Scene(vbox1);
		 
		 stage.setScene(scene1);
		 stage.showAndWait();
		
		return fieldnumbers;
		
	}

	private static void createfields() {
		// TODO Auto-generated method stub
//		return null;
		if(isNumber(fieldnumber.getText())){
			fieldnumbers=Integer.parseInt(fieldnumber.getText());
		}
		
		if(fieldnumber.getText().length() == 0){
			MessageBox.show("Enter any number less than 17 in Field Value", "Error");
		}else if(fieldnumbers == 0 || fieldnumbers > 16 ){
			MessageBox.show("Enter correct Field Value", "Error");
		}else if(fieldnumbers < 17){
		stage.close();
		}
	}
	
	 private static boolean isNumber(String input){
		try{
			Integer.parseInt(fieldnumber.getText());		
		}catch(NumberFormatException ex){
		return false;
		}
		return true;
	}


}
