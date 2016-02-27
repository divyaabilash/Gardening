package gardning.javafx;


import java.util.ArrayList;
import org.apache.log4j.Logger;
import gardening.manual.ManualOverride;
import gardening.plants.PlantList;
import gardening.plants.Rose;
import gardening.plants.Sunflower;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.*;
import javafx.geometry.Insets;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.*;
import javafx.stage.Stage;


public class CreatingFieldLayout{
	

	static VBox vbox,vboxleft;
	static HBox temperature,water,fertilizer,buttons;
	int SelectedPlant;
	static int count=0;
	static String i="";
	static CheckBox manual;
	static double manualtemperature,manualwaterlevel,manualfertilierlevel;
	static Button plant;
private static final Logger logger = Logger.getLogger("Creating Landing Page");
	
public static void create(int number){
	
	Stage stage=new Stage();
	stage.initModality(Modality.APPLICATION_MODAL);
	stage.setTitle("Creating Field Farm");
	stage.setMinWidth(1000);
	stage.setMinHeight(1000);
	
	TilePane tile1 = new TilePane(); tile1.setHgap(10);
	tile1.setVgap(10);
	tile1.setPadding(new Insets(10,10,10,10)); 
	for (int i=0; i<number; i++)
	{
	Rectangle r = new Rectangle(100, 100);
	r.setFill(Color.BURLYWOOD);
	Button l = new Button();
	l.setId("Field-" + i);
	l.setVisible(false);
	StackPane s = new StackPane(r, l); 
	tile1.getChildren().add(s);
	tile1.setPadding(new Insets(20));
	tile1.addEventFilter(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent event) {
			logger.info("Farm land is Selected to farm");
		vbox.setVisible(true);
		logger.info("Plant Selection Panel is Displayed");
		}		
	});
	}
	tile1.setPrefColumns(4);
	tile1.setMaxWidth(400);

	vbox = new VBox();
	ArrayList<String> list = new ArrayList<String>();
	list = PlantList.list();
	Label noOfFarm = new Label("List of Plants");
	vbox.getChildren().add(noOfFarm);
	
	ListView<String> listing = new ListView<>();
	ObservableList<String> selectedplant = FXCollections.observableArrayList(list);
	listing.setItems(selectedplant);
	listing.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
	listing.setOnMouseClicked(new EventHandler<Event>(){

		@Override
		public void handle(Event event) {
			ObservableList<String> selection = listing.getSelectionModel().getSelectedItems();
			for(String s:selection){
				logger.info("The plant thats selected to farm is "+s);
				vbox.setVisible(false);
				logger.info("Hidding the plant selection panel");
				newplant newplants = new newplant();
			newplants.getElements(s);
			newplants.start();
			listing.setItems(null);
			listing.setItems(selectedplant);
			
			}
		}
		
	});
		
	vbox.getChildren().add(listing);

	manual = new CheckBox();
	manual.setId("Manual");
	manual.setText("Manual Garderning");
	manual.addEventFilter(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent event) {
	displayfields();
	logger.info("Manaual checkbox is selected");
	}		
	});
	
	Label manualTemp = new Label("Set Current Temperature");
	manualTemp.setMaxSize(200, 400);
	
	TextField manualtemptext = new TextField();
	manualtemptext.setMaxSize(100, 400);
	manualtemptext.setPromptText("56");
	manualtemptext.setId("manualtemperature");
	manualtemptext.setTooltip(new Tooltip("Enter Current Temperature"));
	temperature = new HBox(manualTemp,manualtemptext);
	temperature.setVisible(false);
	temperature.setPadding(new Insets(25));
	
	Label manualwater = new Label("Set Current Water Level");
	manualwater.setMaxSize(200, 400);
	
	TextField manualwatertext = new TextField();
	manualwatertext.setMaxSize(100, 400);
	manualwatertext.setPromptText("56");
	manualwatertext.setId("manualwater");
	manualwatertext.setTooltip(new Tooltip("Enter Current Temperature"));
	water = new HBox(manualwater,manualwatertext);
	water.setVisible(false);
	water.setPadding(new Insets(25));
	
	Label manualfertilizer = new Label("Set Current Fertilizer Level");
	manualfertilizer.setMaxSize(200, 400);
	
	TextField manualfertilizertext = new TextField();
	manualfertilizertext.setMaxSize(100, 400);
	manualfertilizertext.setPromptText("56");
	manualfertilizertext.setId("manualfertilizer");
	manualfertilizertext.setTooltip(new Tooltip("Enter Current Temperature"));
	fertilizer = new HBox(manualfertilizer,manualfertilizertext);
	fertilizer.setVisible(false);
	fertilizer.setPadding(new Insets(25));
	
	Button submit = new Button("Submit");
	submit.setPadding(new Insets(40));
	submit.addEventFilter(MouseEvent.MOUSE_CLICKED,new EventHandler<MouseEvent>(){
		@Override
		public void handle(MouseEvent event) {
			
			manualtemperature = Double.parseDouble(manualtemptext.getText());
			manualwaterlevel = Double.parseDouble(manualwatertext.getText());
			manualfertilierlevel = Double.parseDouble(manualfertilizertext.getText());
			System.out.println("manualtemperature" + manualtemperature);
			System.out.println("manualwaterlevel" + manualwaterlevel);
			System.out.println("manualfertilierlevel"+manualfertilierlevel);
			ManualOverride m = new ManualOverride();
			m.setManualOverideOn(true,manualtemperature,manualwaterlevel,manualfertilierlevel);			
	}
	});
	Button reset = new Button("Reset");
	reset.setPadding(new Insets(40));
	
	buttons = new HBox(submit,reset);
	buttons.setVisible(false);
		
	vboxleft=new VBox();
	vboxleft.getChildren().addAll(manual,temperature,water,fertilizer,buttons);
	
	BorderPane pane1 = new BorderPane();
	pane1.setCenter(tile1);
	pane1.setRight(vbox);
	pane1.setLeft(vboxleft);
	vbox.setVisible(false);
	vbox.setMaxSize(400, 400);

	Scene scene = new Scene(pane1);
	stage.setScene(scene);
	stage.showAndWait();
}

private static void displayfields() {
	if(manual.isSelected()){
		temperature.setVisible(true);
		water.setVisible(true);
		fertilizer.setVisible(true);
		buttons.setVisible(true);
		manualChecker();
		logger.info("Manaual checkbox is selected");
		}else{
				temperature.setVisible(false);
				water.setVisible(false);
				fertilizer.setVisible(false);
				buttons.setVisible(false);
				logger.info("Manaual checkbox is de-selected");
		}
}
 public static boolean manualChecker(){
	 if(manual.isSelected()){
		 System.out.println("Manual checking" + manual.isSelected());
		 logger.info("ManaualGardening is  Started");

		 return true;
		 
	 }else{
		 System.out.println("Manual checking" + manual.isSelected());
		 logger.info("Manaual gardening is discard");

	 return false;
	 }
 }

}

class newplant extends Thread {
	private static final Logger logger = Logger.getLogger("Seeding Plants on Farm Land");
String plantid;
int counts;
	public void getElements(String string){
		plantid = string;
	}
	@Override
	public void run() {
		logger.info("Seeded"+ plantid +" Plant is Created");
					if(plantid =="Rose"){
					Rose rose = new Rose();
					rose.prefferedvalues();
					rose.run();
					}else if (plantid =="Sunflower" ){
						Sunflower sun = new Sunflower();
						sun.run();
					}
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
	}
}
