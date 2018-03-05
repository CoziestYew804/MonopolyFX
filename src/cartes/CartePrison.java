package cartes;

import Cases.CasesMonopoly.CaseMonopoly;
import Cases.CasesMonopoly.Chance;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente une Carte de type Prison
 * (celui qui la pioche pourra sortir de prison gratuitement en l'utilisant) 
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class CartePrison extends CarteMonopoly {
	private JoueurMonopoly proprietaire;
	private Chance caseCarte;
	/**
	* Cree une carte de type Prison avec comme parametre son texte et la case chance a laquelle il appartient
	* @param texte un String qui est le texte de la carte
	* @param caseCarte un Chance qui est la case chance a laquelle il appartient
	**/
	
	public CartePrison(String texte,CaseMonopoly caseCarte){
		super(texte); this.caseCarte=(Chance)caseCarte;
	}
	/**
	* Effectue l'effet de la carte 
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	@Override
	public void actionCarte(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		this.proprietaire.setEstEnPrison(false);
		this.proprietaire.setToursEnPrison(0);
		caseCarte.getListeCartes().add(this);
	}
	
	public void setProprietaire(JoueurMonopoly joueur){
		this.proprietaire=joueur;
	}

}
