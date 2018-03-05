package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class CarteControl implements Initializable {
	@FXML
	public Label texteCarte;
	@FXML 
	private Button buttonOk;
	@FXML
	public ImageView ciao;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		ciao.setImage(new Image("/Fxml/Image/logoCarte.png"));
		
	}
	public void buttonOk(ActionEvent event){
		Stage stage=(Stage) buttonOk.getScene().getWindow();
		stage.close();
	}
	

}
