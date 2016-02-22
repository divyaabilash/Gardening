package gardning.javafx;


import java.util.LinkedList;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.layout.TilePane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class CreatingFieldLayout {
	
	static LinkedList<String> plantlist;
	static VBox vbox;
	int SelectedPlant;
	static String i="";
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
			// TODO Auto-generated method stub
		vbox.setVisible(true);
		
		}
		
	});
	}
	tile1.setPrefColumns(4);
	tile1.setMaxWidth(400);
	
	BorderPane pane1 = new BorderPane();

	pane1.setCenter(tile1);
	pane1.setRight(vbox);
	vbox.setVisible(false);
	
	Scene scene = new Scene(pane1);
	stage.setScene(scene);
//	stage.setFullScreen(true);
	stage.showAndWait();
}
}
