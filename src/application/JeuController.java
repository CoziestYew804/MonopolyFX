package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;



import com.jfoenix.controls.JFXDrawer;
import com.jfoenix.controls.JFXHamburger;
import com.jfoenix.controls.JFXTabPane;
import com.jfoenix.transitions.hamburger.HamburgerBackArrowBasicTransition;
import com.jfoenix.controls.JFXButton;

import Cases.CasesMonopoly.Achetable;
import Cases.CasesMonopoly.CaisseCommunaute;
import Cases.CasesMonopoly.Chance;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import jeu.JeuMonopoly;
import Cases.CasesMonopoly.TerrainMonopoly;
public class JeuController implements Initializable {
//Voici le controleur de la fenetre du jeu 
	//Les tabelaux avec les coordonnees x et y des cases sur l'image
	private double cordonneesCasesY[]={0,0,0,0,0,0,0,0,0,0,0,-80,-150,-200 ,-260 ,-320 ,-380 ,-440 ,-510 ,-570,-650,-650,-650,-650 ,-650 ,-650 ,-650 ,-650 ,-650 ,-650,-650, -570,-510 , -440 ,-380 ,-320 , -260 , -200 , -150 ,-80,0 };	
	private double cordonneesCasesX[]={0,-65*1,-65*2,-65*3,-65*4,-65*5,-65*6,-65*7,-65*8,-65*9,-650,-650,-650,-650,-650 ,-650 ,-650 ,-650 ,-650 ,-650 ,-650,-65*9, -65*8 , -65*7 ,-65*6 ,-65*5 , -65*4 , -65*3 , -65*2 ,-65,0,0,0,0,0,0,0,0,0,0 };
	private JeuMonopoly jeu;
	//Donnees FXML( import des boutons, images etc...)
	@FXML
    private ImageView maisonTerrain21;

    @FXML
    private ImageView maisonTerrain23;

    @FXML
    private ImageView maisonTerrain24;

    @FXML
    private ImageView maisonTerrain26;

    @FXML
    private ImageView maisonTerrain27;

    @FXML
    private ImageView maisonTerrain29;

    @FXML
    private ImageView maisonTerrain9;

    @FXML
    private ImageView maisonTerrain8;

    @FXML
    private ImageView maisonTerrain6;

    @FXML
    private ImageView maisonTerrain1;

    @FXML
    private ImageView maisonTerrain19;

    @FXML
    private ImageView maisonTerrain18;

    @FXML
    private ImageView maisonTerrain16;

    @FXML
    private ImageView maisonTerrain14;

    @FXML
    private ImageView maisonTerrain13;

    @FXML
    private ImageView maisonTerrain11;

    @FXML
    private ImageView maisonTerrain31;

    @FXML
    private ImageView maisonTerrain32;

    @FXML
    private ImageView maisonTerrain34;

    @FXML
    private ImageView maisonTerrain37;

    @FXML
    private ImageView maisonTerrain39;
    @FXML
    private ImageView maisonTerrain3;

	@FXML
	private Label situationJeu;
	@FXML
	private Button buttonLancerDe;
	@FXML
	private Button buttonAbandonner;
	@FXML
	private Button buttonPasserTour;
	@FXML
	private Button buttonVendre;
	@FXML 
	private JFXButton buttonTerrains;
	@FXML
	private JFXDrawer drawerTerrains;
	//private ListView<String> listeProprietes;
	@FXML
	private ImageView pionJoueur1;//rouge
	@FXML
	private ImageView pionJoueur2;//bleu
	@FXML
	private ImageView pionJoueur3;//vert
	@FXML
	private ImageView pionJoueur4;//violet
	@FXML
	private ImageView pionJoueur5;//jaune
	@FXML
	private ImageView pionJoueur6;//noir
	@FXML
	private ImageView imageDe1;
	@FXML
	private ImageView imageDe2;
    @FXML
    private AnchorPane root;
    public static AnchorPane rootP;
	//fin des donnees FXML
	
	public JeuController()
	{
		System.out.println("Construction ...");

	}
//////////////////Initialisation de la fenetre//////////////////////////////////
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		rootP=root;
		
		pionJoueur1.setVisible(false);
		pionJoueur2.setVisible(false);
		pionJoueur3.setVisible(false);
		pionJoueur4.setVisible(false);
		pionJoueur5.setVisible(false);
		pionJoueur6.setVisible(false);
		buttonPasserTour.setDisable(true);
		
	}
		
///////////////////////Methodes//////////////////////////////////////////
	public void updateTirageDe(){
		imageDe1.setVisible(true);
		imageDe2.setVisible(true);
		System.out.println(jeu.getDes().getDe1() + " " +jeu.getDes().getDe2());
		switch(jeu.getDes().getDe1()){
		case 1:
			imageDe1.setImage(new Image("/Fxml/Image/face1.png"));
			break;
		case 2:
			imageDe1.setImage(new Image("/Fxml/Image/face2.png"));
			break;
		case 3:
			imageDe1.setImage(new Image("/Fxml/Image/face3.png"));
			break;
		case 4:
			imageDe1.setImage(new Image("/Fxml/Image/face4.png"));
			break;
		case 5:
			imageDe1.setImage(new Image("/Fxml/Image/face5.png"));
			break;
		case 6:
			imageDe1.setImage(new Image("/Fxml/Image/face6.png"));
			break;
		}
		switch(jeu.getDes().getDe2()){
		case 1:
			imageDe2.setImage(new Image("/Fxml/Image/face1.png"));
			break;
		case 2:
			imageDe2.setImage(new Image("/Fxml/Image/face2.png"));
			break;
		case 3:
			imageDe2.setImage(new Image("/Fxml/Image/face3.png"));
			break;
		case 4:
			imageDe2.setImage(new Image("/Fxml/Image/face4.png"));
			break;
		case 5:
			imageDe2.setImage(new Image("/Fxml/Image/face5.png"));
			break;
		case 6:
			imageDe2.setImage(new Image("/Fxml/Image/face6.png"));
			break;
		}
	}
	public void updateMaisons(){
		switch(jeu.getJoueurTourActuel().getCasePion().getCasePosition()){
		case 1:
			maisonTerrain1.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
		case 3:
			maisonTerrain3.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 6:
			maisonTerrain6.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 8:
			maisonTerrain8.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 9:
			maisonTerrain9.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 11:
			maisonTerrain11.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 13:
			maisonTerrain13.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 14:
			maisonTerrain14.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 16:
			maisonTerrain16.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 18:
			maisonTerrain18.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 19:
			maisonTerrain19.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 21:
			maisonTerrain21.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 23:
			maisonTerrain23.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 24:
			maisonTerrain24.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 26:
			maisonTerrain26.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 27:
			maisonTerrain27.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 29:
			maisonTerrain29.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 31:
			maisonTerrain31.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 32:
			maisonTerrain32.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 33:
			maisonTerrain34.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 37:
			maisonTerrain37.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
		case 39:
			maisonTerrain39.setImage(new Image("/Fxml/Image/"+((TerrainMonopoly)jeu.getJoueurTourActuel().getCasePion()).getNbMaison()+"maisons.png"));
			break;
			default: System.out.println("problema2");
	}
	}
	//Fonction qui ouvre une fenetre pour afficher les info du terrain a acheter
	public void openWInfoTerrain() throws IOException{
		 Stage stage = new Stage();
		 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/GestionAchat.fxml"));
		 Parent root = (Parent) fxmlLoader1.load();
		 GestionAchatController controller = fxmlLoader1.getController();
		 controller.jeu=this.jeu;
		 if(jeu.getJoueurTourActuel().possedeTousLesTerrainDuMmGroupe(jeu)){
			 controller.getbuttonAcheter().setText("Acheter Maison");
		 }
		 controller.positionCase=jeu.getJoueurTourActuel().getCasePion().getCasePosition();
		 if (jeu.getJoueurTourActuel().getArgent()<((Achetable)jeu.getJoueurTourActuel().getCasePion()).getPrixAchat()){
				controller.getbuttonAcheter().setVisible(false);
			}
		
		 controller.imageCase.setImage(new Image("Fxml/Image/Cases/case"+jeu.getJoueurTourActuel().getCasePion().getCasePosition()+ ".png"));
		 stage.setScene(new Scene(root));
		 stage.initModality(Modality.APPLICATION_MODAL);
		 stage.initOwner(buttonLancerDe.getScene().getWindow());
		 stage.showAndWait();
		 if(jeu.getJoueurTourActuel().getCasePion() instanceof TerrainMonopoly){
			 updateMaisons();
			 
		 }
	}
	public void openWInfoCartePrison() throws IOException{
		 Stage stage = new Stage();
		 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/FenetreCartePrison.fxml"));
		 Parent root = (Parent) fxmlLoader1.load();
		 FenetreCartePrisonController controller = fxmlLoader1.getController();
		 controller.jeu=this.jeu;
		 stage.setScene(new Scene(root));
		 stage.initModality(Modality.APPLICATION_MODAL);
		 stage.initOwner(buttonLancerDe.getScene().getWindow());
		 stage.showAndWait();
	}
		
	//Fonction qui ouvre une fenetre pour afficher le texte de la carte
	public void openWInfoCarte() throws IOException{
		Stage stage = new Stage();
		 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/CarteInfo.fxml"));
		 Parent root = (Parent) fxmlLoader1.load();
		 CarteControl control1 = fxmlLoader1.getController();
		 if(jeu.getJoueurTourActuel().getCasePion() instanceof Chance){
			 System.out.println(((Chance)jeu.getJoueurTourActuel().getCasePion()).texteCarte());
			 control1.texteCarte.setText(((Chance)jeu.getJoueurTourActuel().getCasePion()).texteCarte());
		 }
		 else
		 {
			 System.out.println(((CaisseCommunaute)jeu.getJoueurTourActuel().getCasePion()).texteCarte());
			 control1.texteCarte.setText(((CaisseCommunaute)jeu.getJoueurTourActuel().getCasePion()).texteCarte());
		 }
		 
		 stage.setScene(new Scene(root));
		 stage.initModality(Modality.APPLICATION_MODAL);
		 stage.initOwner(buttonLancerDe.getScene().getWindow());
		 stage.showAndWait();
	}
	public void ChoixNbJoueurs(int nbJoueurs){
		this.jeu = new JeuMonopoly(nbJoueurs);
		 setSituationJeu();
		switch(nbJoueurs){
		  case 1:
			  pionJoueur1.setVisible(true);
		    break;
		  case 2:
			  pionJoueur1.setVisible(true);
			  pionJoueur2.setVisible(true);
		    break;
		  case 3:
			  pionJoueur1.setVisible(true);
			  pionJoueur2.setVisible(true);
			  pionJoueur3.setVisible(true);
		    break;
		  case 4:
			  pionJoueur1.setVisible(true);
			  pionJoueur2.setVisible(true);
			  pionJoueur3.setVisible(true);
			  pionJoueur4.setVisible(true);
			break;
		  case 5:
			  pionJoueur1.setVisible(true);
			  pionJoueur2.setVisible(true);
			  pionJoueur3.setVisible(true);
			  pionJoueur4.setVisible(true);
			  pionJoueur5.setVisible(true);
			break;
		  case 6:
			  pionJoueur1.setVisible(true);
			  pionJoueur2.setVisible(true);
			  pionJoueur3.setVisible(true);
			  pionJoueur4.setVisible(true);
			  pionJoueur5.setVisible(true);
			  pionJoueur6.setVisible(true);
			break;
		  default:
		    System.out.println("J'ai pas de pions a bouger... :(");
		}
		
	}
	private void updatePionPosition() {
		int i =jeu.getJoueurTourActuel().getPion().getCasePosition();
		int j= jeu.getNumeroJoueurActuel();
		switch(j){
		  case 1:
			pionJoueur1.setX(this.cordonneesCasesX[i]);
			pionJoueur1.setY(this.cordonneesCasesY[i]);
		    break;
		  case 2:
			pionJoueur2.setX(this.cordonneesCasesX[i]);
			pionJoueur2.setY(this.cordonneesCasesY[i]);
		    break;
		  case 3:
			pionJoueur3.setX(this.cordonneesCasesX[i]);
			pionJoueur3.setY(this.cordonneesCasesY[i]);
		    break;
		  case 4:
			pionJoueur4.setX(this.cordonneesCasesX[i]);
			pionJoueur4.setY(this.cordonneesCasesY[i]);
			break;
		  case 5:
			pionJoueur5.setX(this.cordonneesCasesX[i]);
			pionJoueur5.setY(this.cordonneesCasesY[i]);
			break;
		  case 6:
			pionJoueur6.setX(this.cordonneesCasesX[i]);
			pionJoueur6.setY(this.cordonneesCasesY[i]);
			break;
		  default:
		    System.out.println("J'ai pas de pions a bouger... :(");
		}
    }
	
///////////////////////Fonctions des Boutons/////////////////////////////
	public void buttonLancerDe(ActionEvent event) {
		//On passe au joueur les Des du Jeu, il pourra ensuite jouer
		 jeu.getJoueurTourActuel().joue(jeu.getDes());
		 //On udpate les des
		 updateTirageDe();
		 //On update la position du joueur
		 updatePionPosition();
		 //On verifie si la case est un case Chance et on pioche un carte
		 if ((jeu.getJoueurTourActuel().getCasePion() instanceof Chance)||(jeu.getJoueurTourActuel().getCasePion() instanceof CaisseCommunaute)){
			 //affiche le texte de la carte
			 try{
				 openWInfoCarte();
			 }
			 catch(IOException e){
				 
				 System.out.println("probleme openWinfoCarte() dans la fonction buttonLancerDe");
			 }
		
			 
		 }
		//affiche le nom du joueur et son argent
		 setSituationJeu();
		 //On effectue l'action de la case 
		 jeu.getJoueurTourActuel().getCasePion().effectuerAction(jeu);
		 if(jeu.getJoueurTourActuel().getEstEnFallite()==true){
			 this.buttonPasserTour.setDisable((jeu.getJoueurTourActuel().getEstEnFallite()));
		 }
		 //affiche le nom du joueur et son argent
		 setSituationJeu();
		 //on re-update la position du pion du joueur
		 updatePionPosition();
		 //Si la case est une propriete on active le bouton acheter sinon on le desactive
		 if(jeu.getJoueurTourActuel().getCasePion() instanceof Achetable){
			 if(jeu.getJoueurTourActuel().getCasePion().getProprietaire()==null){
				 try{
					 openWInfoTerrain();
				 }
				 catch(IOException e){
					 
					 System.out.println("probleme openWinfoTerrain() dans la fonction buttonLancerDe");
					 
				 }
			
			//on mets a jour l'argent du joueur
			 setSituationJeu();
			 }
			 else if(jeu.getJoueurTourActuel().getCasePion().getProprietaire()==jeu.getJoueurTourActuel() && jeu.getJoueurTourActuel().possedeTousLesTerrainDuMmGroupe(jeu)){
				try{
					openWInfoTerrain();
				}
				catch(IOException e){
					 
					 System.out.println("probleme openWinfoTerrain() dans la fonction buttonLancerDe");
					 
				 }
				
				 
					//on mets a jour l'argent du joueur
				 setSituationJeu();
			 }
		 }
		 //le joueur ne peux plus lancer le des donc on desactive le bouton
		 buttonLancerDe.setDisable(true);
		 buttonPasserTour.setDisable(false);
		 setSituationJeu();
	}
	//Label qui affiche le tour du joueur
	public void setSituationJeu(){
		situationJeu.setText(jeu.getJoueurTourActuel().getNom() + "\n" + "Argent :" + jeu.getJoueurTourActuel().getArgent());
    }
	public void buttonAbandonner(ActionEvent event) throws IOException{
		jeu.unJoueurAbandonne(jeu.getJoueurTourActuel());
		if(jeu.getLJoueur().size()>1){
		this.buttonLancerDe.setDisable(false);
		}
		else{
			
				 Stage stage = new Stage();
				 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/CarteInfo.fxml"));
				 Parent root = (Parent) fxmlLoader1.load();
				 CarteControl control1 = fxmlLoader1.getController();
				 System.out.println(jeu.getJoueurTourActuel().getNom() + " a gagne ");
				 control1.texteCarte.setText(jeu.getJoueurTourActuel().getNom() + " a gagne ");
				 stage.setScene(new Scene(root));
				 stage.initModality(Modality.APPLICATION_MODAL);
				 stage.initOwner(buttonLancerDe.getScene().getWindow());
				 stage.showAndWait();
				 Stage stageActuel = (Stage) buttonLancerDe.getScene().getWindow();
		         stageActuel.close();
			}
		
	}
	
	public void buttonPasserTour(ActionEvent event){
		jeu.setNextJoueurTour();
		if (jeu.getJoueurTourActuel().getEstEnPrison()){
			if(jeu.getJoueurTourActuel().getCartePrison()!= null){
				try{
					openWInfoCartePrison();
				}
				catch(IOException e){
						 
					System.out.println("probleme openWinfoCartePrison() dans la fonction buttonLancerDe");
						 
				}
				if(jeu.getJoueurTourActuel().getEstEnPrison()){
					 jeu.getJoueurTourActuel().getCasePion().effectuerAction(jeu);
					 this.buttonPasserTour.setDisable((jeu.getJoueurTourActuel().getEstEnFallite()));
				}
			}
			 jeu.getJoueurTourActuel().getCasePion().effectuerAction(jeu);
			 this.buttonPasserTour.setDisable((jeu.getJoueurTourActuel().getEstEnFallite()));
		}
		this.buttonLancerDe.setDisable(jeu.getJoueurTourActuel().getEstEnPrison());
		this.buttonPasserTour.setDisable(!this.buttonLancerDe.isDisabled());
		setSituationJeu();
		imageDe1.setVisible(false);
		imageDe2.setVisible(false);
	}
	public void buttonVendre(ActionEvent event) throws IOException{
		try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/CartesTerrains.fxml"));
            Parent root = loader.load();
            DrawerController c = loader.getController();
            c.jeu=this.jeu;
            c.boutonPasserTourDuJeu=this.buttonPasserTour;
            c.control=this;
            c.updateProprietes();
            drawerTerrains.setSidePane(root);
            //drawerTerrains.open();
            //drawerTerrains.close();
   		    
        } catch (IOException ex) {
        	System.out.println("abbiamo un problema nel caricamento file fxml sulla finestra delle carte");
            
        }
		if(drawerTerrains.isShown())
        {
			drawerTerrains.close();
        }
		else
        {
            drawerTerrains.open();
        }
    
	}
	//////////////////////////////////Getters & Setters /////////////////////////////////////////
	public void setJeu(JeuMonopoly jeu){
		this.jeu=jeu;
	}
	public JeuMonopoly getJeu(){
		return this.jeu;
	}
}
