package cartes;

import Cases.CasesMonopoly.CaseMonopoly;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente une Carte de type Deplacement
 * (celui qui la pioche recoit de l'argent) 
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class CarteDeplacement extends CarteMonopoly {
	String texte;
	int positionCase;
	/**
	* Cree une carte de type deplacement avec comme parametre son texte e la position de la case 
	* @param texte un String qui est le texte de la carte
	* @param positionCase un int qui la position de la case
	**/
	public CarteDeplacement(String texte, int positionCase){
		super(texte);this.texte=texte; this.positionCase=positionCase; 
		
	}
	/**
	* Effectue l'effet de la carte 
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	@Override
	public void actionCarte(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		if(jeu.getJoueurTourActuel().getCasePion().getPosition() > this.positionCase){
			jeu.getJoueurTourActuel().recevoirArgent(200);
		}
		jeu.getJoueurTourActuel().getPion().setPosition(jeu.getCaseDamier(this.positionCase));
	}
	/**
	* Retourne le texte de la carte
	* @return texte un String qui est le texte de la carte
	**/
	public String getTexte(){
		return this.texte;
	}

}
