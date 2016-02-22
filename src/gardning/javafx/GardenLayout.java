package gardning.javafx;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class GardenLayout extends Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Application.launch(args);
	}
//Farming Layout variables
	Button farm1,farm2,farm3,farm4,farm5,farm6,farm7,farm8,farm9;
	FlowPane farmland;
	BorderPane viewOfFarmLand;
	Scene farmView;
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		farm1=new Button();
		farm1.setMinWidth(100);
		farm1.setPrefHeight(100);
		farm2=new Button();
		farm2.setMinWidth(100);
		farm2.setPrefHeight(100);
		farm3=new Button();
		farm3.setMinWidth(100);
		farm3.setPrefHeight(100);
		farm4=new Button();
		farm4.setMinWidth(100);
		farm4.setPrefHeight(100);
		farm5=new Button();
		farm5.setMinWidth(100);
		farm5.setPrefHeight(100);
		farm6=new Button();
		farm6.setMinWidth(100);
		farm6.setPrefHeight(100);
		farm7=new Button();
		farm7.setMinWidth(100);
		farm7.setPrefHeight(100);
		farm8=new Button();
		farm8.setMinWidth(100);
		farm8.setPrefHeight(100);
		farm9=new Button();
		farm9.setMinWidth(100);
		farm9.setPrefHeight(100);
		farm9.setOnAction(e -> PlantList());
		farmland = new FlowPane(Orientation.HORIZONTAL,20,20,farm1,farm2,farm3,farm4,farm5,farm6,farm7,farm8,farm9);
		farmland.setMaxWidth(350);
	
		viewOfFarmLand = new BorderPane(farmland);
		viewOfFarmLand.setPadding(new Insets(20));
		farmView =new Scene(viewOfFarmLand);
		primaryStage.setScene(farmView);
		primaryStage.show();
		
		
		
	}
	private Object PlantList() {
		// TODO Auto-generated method stub
		return null;
	}

}
