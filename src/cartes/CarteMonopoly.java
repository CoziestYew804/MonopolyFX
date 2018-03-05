package cartes;

import jeu.JeuMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente une Carte Monopoly quelquonque
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class CarteMonopoly {

	private String texte;
	/**
	* Cree une carte Monopoly avec comme parametre son texte 
	* @param texte un String qui est le texte de la carte
	**/
	public CarteMonopoly(String texte){
		this.texte=texte;
	}
	
	public abstract void actionCarte(JeuMonopoly jeu);

	public String getTexte() {
		return "0";
	}
	
	
}

