package cartes;

import jeu.JeuMonopoly;
/**
 * Cette classe represente une Carte de type addition
 * (celui qui la pioche recoit de l'argent) 
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class CarteAddition extends CarteMonopoly {

	private String texte;
	private int montant;
////////////////////////////////////Constructeur/////////////////////////
	/**
	* Cree une carte de type addition avec comme parametre son texte e le montant que le joueur recoit
	* @param texte un String qui est le texte de la carte
	* @param montant un int qui est le montant recu par le joueur
	**/
	public CarteAddition(String texte, int montant){
		super(texte);this.texte=texte; this.montant=montant;
	}
	/**
	* Retourne le texte de la carte
	* @return texte un String qui est le texte de la carte
	**/
	public String getTexte(){
		return this.texte;
	}
	/**
	* Effectue l'effet de la carte 
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	@Override
	public void actionCarte(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		jeu.getJoueurTourActuel().recevoirArgent(this.montant);
	}

}
