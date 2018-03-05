package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDrawer;

import Cases.CasesMonopoly.Chance;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.Window;
import jeu.JeuMonopoly;



	public class DrawerController implements Initializable {
			public Button boutonPasserTourDuJeu;
			public JeuMonopoly jeu;
			public JeuController control;
			@FXML
		    private ImageView terrain3;
			
		    @FXML
		    private ImageView terrain6;

		    @FXML
		    private ImageView terrain8;

		    @FXML
		    private ImageView terrain9;

		    @FXML
		    private ImageView terrain11;

		    @FXML
		    private ImageView terrain13;

		    @FXML
		    private ImageView terrain14;

		    @FXML
		    private ImageView terrain16;

		    @FXML
		    private ImageView terrain18;

		    @FXML
		    private ImageView terrain19;

		    @FXML
		    private ImageView terrain21;

		    @FXML
		    private ImageView terrain23;

		    @FXML
		    private ImageView terrain27;

		    @FXML
		    private ImageView terrain26;

		    @FXML
		    private ImageView terrain24;

		    @FXML
		    private ImageView terrain29;

		    @FXML
		    private ImageView terrain31;

		    @FXML
		    private ImageView terrain32;

		    @FXML
		    private ImageView terrain39;

		    @FXML
		    private ImageView terrain37;

		    @FXML
		    private ImageView terrain34;

		    @FXML
		    private ImageView terrain1;
		    
		    @FXML
		    private ImageView gare15;

		    @FXML
		    private ImageView gare5;

		    @FXML
		    private ImageView gare25;

		    @FXML
		    private ImageView gare35;
		    
		    @FXML
		    private ImageView sp12;
		    
		    @FXML
		    private ImageView sp28;
		    
		    
	    
	public void updateProprietes(){
		for(int i=0;i<jeu.getDamier().getTCases().length;i++){
			if(jeu.getCaseDamier(i).getProprietaire()!=jeu.getJoueurTourActuel()){
					switch(i){
					case 1:
						terrain1.setOpacity(0.5);
						break;
					case 3:
						terrain3.setOpacity(0.5);
						break;
					case 5:
						gare5.setOpacity(0.5);
						break;
					case 6:
						terrain6.setOpacity(0.5);
						break;
					case 8:
						terrain8.setOpacity(0.5);
						break;
					case 9:
						terrain9.setOpacity(0.5);
						break;
					case 11:
						terrain11.setOpacity(0.5);
						break;
					case 12:
						sp12.setOpacity(0.5);
						break;
					case 13:
						terrain13.setOpacity(0.5);
						break;
					case 14:
						terrain14.setOpacity(0.5);
						break;
					case 15:
						gare15.setOpacity(0.5);
						break;
					case 16:
						terrain16.setOpacity(0.5);
						break;
					case 18:
						terrain18.setOpacity(0.5);
						break;
					case 19:
						terrain19.setOpacity(0.5);
						break;
					case 21:
						terrain21.setOpacity(0.5);
						break;
					case 23:
						terrain23.setOpacity(0.5);
						break;
					case 24:
						terrain24.setOpacity(0.5);
						break;
					case 25:
						gare25.setOpacity(0.5);
						break;
					case 26:
						terrain26.setOpacity(0.5);
						break;
					case 27:
						terrain27.setOpacity(0.5);
						break;
					case 28:
						sp28.setOpacity(0.5);
						break;
					case 29:
						terrain29.setOpacity(0.5);
						break;
					case 31:
						terrain31.setOpacity(0.5);
						break;
					case 32:
						terrain32.setOpacity(0.5);
						break;
					case 33:
						terrain34.setOpacity(0.5);
						break;
					case 35:
						gare35.setOpacity(0.5);
						break;
					case 37:
						terrain37.setOpacity(0.5);
						break;
					case 39:
						terrain39.setOpacity(0.5);
						break;
						default: 
					}
				}else{
					switch(i){
					case 1:
						terrain1.setOpacity(1);
						System.out.println("ok");
						break;
					case 3:
						terrain3.setOpacity(1);
						break;
					case 5:
						gare5.setOpacity(1);
						break;
					case 6:
						terrain6.setOpacity(1);
						break;
					case 8:
						terrain8.setOpacity(1);
						break;
					case 9:
						terrain9.setOpacity(1);
						break;
					case 11:
						terrain11.setOpacity(1);
						break;
					case 12:
						sp12.setOpacity(1);
						break;
					case 13:
						terrain13.setOpacity(1);
						break;
					case 14:
						terrain14.setOpacity(1);
						break;
					case 15:
						gare15.setOpacity(1);
						break;
					case 16:
						terrain16.setOpacity(1);
						break;
					case 18:
						terrain18.setOpacity(1);
						break;
					case 19:
						terrain19.setOpacity(1);
						break;
					case 21:
						terrain21.setOpacity(1);
						break;
					case 23:
						terrain23.setOpacity(1);
						break;
					case 24:
						terrain24.setOpacity(1);
						break;
					case 25:
						gare25.setOpacity(1);
						break;
					case 26:
						terrain26.setOpacity(1);
						break;
					case 27:
						terrain27.setOpacity(1);
						break;
					case 28:
						sp28.setOpacity(1);
						break;
					case 29:
						terrain29.setOpacity(1);
						break;
					case 31:
						terrain31.setOpacity(1);
						break;
					case 32:
						terrain32.setOpacity(1);
						break;
					case 33:
						terrain34.setOpacity(1);
						break;
					case 35:
						gare35.setOpacity(1);
						break;
					case 37:
						terrain37.setOpacity(1);
						break;
					case 39:
						terrain39.setOpacity(1);
						break;
						default: 
				}
			}
	}
	}
	

		
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
				
					terrain1.setOpacity(0.5);
				
					terrain3.setOpacity(0.5);
					
					gare5.setOpacity(0.5);
					
					terrain6.setOpacity(0.5);
					
					terrain8.setOpacity(0.5);
					
					terrain9.setOpacity(0.5);
				
					terrain11.setOpacity(0.5);
					
					sp12.setOpacity(0.5);
					
					terrain13.setOpacity(0.5);
					
					terrain14.setOpacity(0.5);
					
					gare15.setOpacity(0.5);
					
					terrain16.setOpacity(0.5);
					
					terrain18.setOpacity(0.5);
					
					terrain19.setOpacity(0.5);
					
					terrain21.setOpacity(0.5);
					
					terrain23.setOpacity(0.5);
					
					terrain24.setOpacity(0.5);
					
					gare25.setOpacity(0.5);
					
					terrain26.setOpacity(0.5);
					
					terrain27.setOpacity(0.5);		

					sp28.setOpacity(0.5);
				
					terrain29.setOpacity(0.5);
					
					terrain31.setOpacity(0.5);
				
					terrain32.setOpacity(0.5);
					
					terrain34.setOpacity(0.5);
					
					gare35.setOpacity(0.5);
					
					terrain37.setOpacity(0.5);
					
					terrain39.setOpacity(0.5);

				
	}
	
	
	public void handle(MouseEvent mouseEvent) throws IOException {
		
		if(((ImageView)mouseEvent.getTarget()).getOpacity()==1){
         mouseEvent.consume();
         System.out.println("Image! " + mouseEvent.getTarget());
         Stage stage = new Stage();
		 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/GestionVente.fxml"));
		 Parent root = (Parent) fxmlLoader1.load();
		 GestionVenteController control1 = fxmlLoader1.getController();
		 control1.imageCarte.setImage(((ImageView)mouseEvent.getTarget()).getImage());
		 control1.control=this.control;
		 control1.jeu=this.jeu;
		 control1.boutonPasserTourDuJeu=this.boutonPasserTourDuJeu;
		 control1.positionCase=Integer.parseInt(mouseEvent.getPickResult().getIntersectedNode().getId().replace("terrain", ""));
		 stage.setScene(new Scene(root));
		 stage.initModality(Modality.APPLICATION_MODAL);
		 stage.showAndWait();
		
		 
		}
	
	}
public void handleGare(MouseEvent mouseEvent) throws IOException {
		
		if(((ImageView)mouseEvent.getTarget()).getOpacity()==1){
         mouseEvent.consume();
         System.out.println("Image! " + mouseEvent.getTarget());
         Stage stage = new Stage();
		 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/GestionVente.fxml"));
		 Parent root = (Parent) fxmlLoader1.load();
		 GestionVenteController control1 = fxmlLoader1.getController();
		 control1.imageCarte.setImage(((ImageView)mouseEvent.getTarget()).getImage());
		 control1.jeu=this.jeu;
		 control1.control=this.control;
		 control1.boutonPasserTourDuJeu=this.boutonPasserTourDuJeu;
		 control1.positionCase=Integer.parseInt(mouseEvent.getPickResult().getIntersectedNode().getId().replace("gare", ""));
		 stage.setScene(new Scene(root));
		 stage.initModality(Modality.APPLICATION_MODAL);
		 stage.showAndWait();
		}
	
	}

public void handleSP(MouseEvent mouseEvent) throws IOException {
	
	if(((ImageView)mouseEvent.getTarget()).getOpacity()==1){
     mouseEvent.consume();
     System.out.println("Image! " + mouseEvent.getTarget());
     Stage stage = new Stage();
	 FXMLLoader fxmlLoader1 = new FXMLLoader(getClass().getResource("/Fxml/GestionVente.fxml"));
	 Parent root = (Parent) fxmlLoader1.load();
	 GestionVenteController control1 = fxmlLoader1.getController();
	 control1.imageCarte.setImage(((ImageView)mouseEvent.getTarget()).getImage());
	 control1.jeu=this.jeu;
	 control1.boutonPasserTourDuJeu=this.boutonPasserTourDuJeu;
	 control1.control=this.control;
	 control1.positionCase=Integer.parseInt(mouseEvent.getPickResult().getIntersectedNode().getId().replace("sp", ""));
	 stage.setScene(new Scene(root));
	 stage.initModality(Modality.APPLICATION_MODAL);
	 stage.showAndWait();
	}

}
	
}
