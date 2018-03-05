package application;

import java.net.URL;
import java.util.ResourceBundle;

import Cases.CasesMonopoly.Achetable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import jeu.JeuMonopoly;

public class FenetreCartePrisonController implements Initializable {

	public JeuMonopoly jeu;
	@FXML
	private Label texte;
	@FXML
	private Button boutonOui;
	@FXML
	private Button boutonNon;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		texte.setText("Vous possedez une carte vous permettant de sortir de prison gratuitement\n Voulez vous l'utiliser ?");
		
	}
	 @FXML
	 void boutonOui(ActionEvent event) {
		 jeu.getJoueurTourActuel().getCartePrison().actionCarte(jeu);
		 Stage stageActuel = (Stage) boutonOui.getScene().getWindow();
	        stageActuel.close();
	    }
	 @FXML
	 void boutonNon(ActionEvent event) {
		 Stage stageActuel = (Stage) boutonNon.getScene().getWindow();
	        stageActuel.close();
	    }


}
