package gardning.javafx;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class MessageBox {
public static void show(String string,String title){
	Stage stage=new Stage();
	stage.initModality(Modality.APPLICATION_MODAL);
stage.setTitle(title);
stage.setMinWidth(300);

Label lbl=new Label(string);
Button btnok = new Button("Ok");
//Button btncancel=new Button("Cancel");
btnok.setOnAction(e -> stage.close() );
VBox panel=new VBox(20);
panel.getChildren().addAll(lbl,btnok);
panel.setAlignment(Pos.CENTER);

Scene scene = new Scene(panel);
stage.setScene(scene);
stage.showAndWait();

}
}
