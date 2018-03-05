package cartes;

import jeu.JeuMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;

public class CartePayement extends CarteMonopoly {

	private String texte;
	private int montant;
	/**
	* Cree une carte de type Payement avec comme parametre son texte e le montant a payer par le joueur
	* @param texte un String qui est le texte de la carte
	* @param montant un int qui est le montant a payer par le joueur
	**/
	public CartePayement(String texte, int montant){
		super(texte); this.montant=montant; this.texte=texte;
	}
	/**
	* Effectue l'effet de la carte 
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	public void actionCarte(JeuMonopoly jeu) {
		if(jeu.getJoueurTourActuel().getArgent()>this.montant){
			jeu.getJoueurTourActuel().soustraireArgent(this.montant);
		}
		
		else
		{
			jeu.getJoueurTourActuel().setEstEnFallite(true);
		}
	}
	/**
	* Retourne le texte de la carte
	* @return texte un String qui est le texte de la carte
	**/
	public String getTexte(){
		return this.texte;
	}
}
