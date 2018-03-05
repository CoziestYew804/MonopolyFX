package application;

import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import Cases.CasesMonopoly.Achetable;
import Cases.CasesMonopoly.CaisseCommunaute;
import Cases.CasesMonopoly.Chance;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import jeu.JeuMonopoly;

public class GestionVenteController implements Initializable {
	public JeuMonopoly jeu;
	public JeuController control;
	public int positionCase;
	@FXML
	public ImageView imageCarte ;
	@FXML
	private Button buttonVendre;
	public Button boutonPasserTourDuJeu;
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
 
    @FXML
    void buttonVendre(ActionEvent event) {
    	jeu.getJoueurTourActuel().vendre((Achetable)jeu.getCaseDamier(this.positionCase));
    	if (jeu.getJoueurTourActuel().getEstEnFallite()==true){
    		if(jeu.getJoueurTourActuel().getCasePion() instanceof Chance){
    			 Chance a = (Chance) jeu.getJoueurTourActuel().getCasePion();
    			 a.joueDernierCarte(jeu);
    		}
    		else if(jeu.getJoueurTourActuel().getCasePion() instanceof CaisseCommunaute)
    		{
    			CaisseCommunaute a = (CaisseCommunaute) jeu.getJoueurTourActuel().getCasePion();
   			    a.joueDernierCarte(jeu);
    		}
    		else
    		{
    			jeu.getJoueurTourActuel().getCasePion().effectuerAction(jeu);
    		}
    	}
    	control.updateMaisons();
    	boutonPasserTourDuJeu.setDisable(jeu.getJoueurTourActuel().getEstEnFallite());
    	Stage stage=(Stage) buttonVendre.getScene().getWindow();
		stage.close();
    }
}
