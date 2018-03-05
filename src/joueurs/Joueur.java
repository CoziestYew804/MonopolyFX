package joueurs;
import Cases.Case;
import javafx.scene.paint.Color;
import pion.Pion;
/**
 * Cette classe est une classe abstraite qui represente un Joueur quelconque
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class Joueur {
	
	protected int score;
	protected String nom;
	protected Pion pion;
	/**
	 * Cree un joueur  comme parametre son nom
	 * @param nom un String qui est le nom du joueur qui va etre cree
	 **/
public Joueur (String nom){ this.setNom(nom);};
/**
 * Une methode abstraite qui deplace le pion du joueur selon un nombre de deplacement 
 * @param nbDeplacement un int qui represente le nombre de deplacements que devra effectuer le pion
 **/
public abstract void deplacerPion(int nbDeplacements);
///////////////////////////////////Getters & Setters//////////////////////////////////
/**
	 * modifie le nom du joueur du Monopoly
	 * @param nom un String qui represente le nom du joueur
	 **/
public void setNom(String nom){
	this.nom=nom;
}
/**
	 * retourne le pion du joueur 
	 * @return pion le pion du joueur
	 **/
public Pion getPion(){
	return this.pion;
}
/**
	 * modifie le pion du joueur
	 * @param pion un Pion qui est le nouveau pion du joueur
	 **/
public void setPion(Pion pion){
	this.pion=pion;
}


}
