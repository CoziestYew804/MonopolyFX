package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Cases.CasesMonopoly.Achetable;
import Cases.CasesMonopoly.TerrainMonopoly;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import jeu.JeuMonopoly;

public class GestionAchatController implements Initializable {
	
	public JeuMonopoly jeu;
	
	public int positionCase;
	@FXML
	public ImageView imageCase ;
	@FXML
	private Button buttonAcheter;
	@FXML
	private Button buttonLaisser;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	public Button getbuttonAcheter(){
		return this.buttonAcheter;
	}
    @FXML
    void buttonAcheter(ActionEvent event) {
    	
    	if(buttonAcheter.getText()=="Acheter Maison"){
    		((TerrainMonopoly)jeu.getCaseDamier(positionCase)).ajouterMaison();
        	Stage stageActuel = (Stage) buttonAcheter.getScene().getWindow();
            stageActuel.close();
    	}
    	else
    	{	
    	
    	((Achetable)jeu.getCaseDamier(positionCase)).estAcheterPar(jeu.getJoueurTourActuel());
    	Stage stageActuel = (Stage) buttonAcheter.getScene().getWindow();
        stageActuel.close();
    }
    }

    @FXML
    void buttonLaisser(ActionEvent event) {
    	Stage stageActuel = (Stage) buttonLaisser.getScene().getWindow();
        stageActuel.close();
    }
}
