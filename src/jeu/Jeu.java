package jeu;

import damiers.Damier;
import damiers.DamierMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
import pion.Pion;

/**
 * Cette classe est une classe abstraite qui represente un jeu quelconque qui utilise un damier
 * @author Giovanni Amin Raziq
 **/
public abstract class Jeu {
	
	
	private Damier damier;
	private Joueur joueur[];
////////////////////////////////Constructeur////////////////////////////
	/**
	 * Cree un nouveau jeu a partir du nombre de joueurs
	 * @param nbJoueur un int qui represente le nombre de joueurs
	 **/
	public Jeu(int nbJoueur){
		this.joueur=new Joueur[nbJoueur];
	}
////////////////////////////////Methodes////////////////////////////////

}
