package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class DemarrageControl implements Initializable {
//C'est la fenetre dans laquelle on pourra entrer le nombre de Joueurs 
//et qui va transmettre la valeur a la fenetre de jeu	
	@FXML
	private JFXTextField nbJoueurs;
	@FXML 
	private Button buttonChoixNbJoueurs;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
		nbJoueurs.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
				// TODO Auto-generated method stub
				if(!newValue)
				{
					buttonChoixNbJoueurs.setDisable(true);
				}
				else
				{
					
					buttonChoixNbJoueurs.setDisable(!(nbJoueurs.getText().matches("[2-6]")));
				}
				
				
			}
			
		});	
		
	}
	public void nbJoueurs(ActionEvent event) throws IOException{
		
		
		if (nbJoueurs.getText().matches("[2-6]")){
			buttonChoixNbJoueurs.setDisable(false);
		}
		else{
			buttonChoixNbJoueurs.setDisable(true);
		}
	}
	
	public void buttonChoixNbJoueurs(ActionEvent event) throws IOException{
	
	String nbJoueurs = this.nbJoueurs.getText();
	FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Fxml/FenetreJeu.fxml"));
    Parent root1 = (Parent) fxmlLoader.load();
    JeuController control = fxmlLoader.getController();
    control.ChoixNbJoueurs(Integer.parseInt(nbJoueurs));
    Stage stage = new Stage();
    stage.setScene(new Scene(root1));
    stage.setResizable(false);
    stage.show();
    Stage stageActuel = (Stage) buttonChoixNbJoueurs.getScene().getWindow();
    stageActuel.close();
    
    
    //System.out.println(nbJoueurs.getText());
	}
}