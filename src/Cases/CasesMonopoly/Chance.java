package Cases.CasesMonopoly;

import cartes.CartePrison;
import java.util.ArrayList;

import cartes.CarteAddition;
import cartes.CarteDeplacement;
import cartes.CarteMonopoly;
import cartes.CartePayement;
import cartes.CartePrison;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;

public class Chance extends CaseMonopoly {
	
	private String nom;
	private int position;
	private ArrayList<CarteMonopoly> listeCartes;
	private int DerniereCarte;
	
	public Chance(String nom, int position){
		super(nom);this.position=position; this.nom=nom;
		this.listeCartes=new ArrayList<CarteMonopoly>();
		listeCartes.add(new CartePayement("Vous Payez 200",200));
		listeCartes.add(new CartePayement("Vous Payez 100",100));
		listeCartes.add(new CartePayement("Vous Payez 50",50));
		listeCartes.add(new CarteAddition("Vous Recevez 50",50));
		listeCartes.add(new CarteAddition("Vous Recevez 100",100));
		listeCartes.add(new CarteAddition("Vous Recevez 200",200));
		listeCartes.add(new CarteDeplacement("Allez a la gare de Lyon et esperez de ne pas rater le train \n "
				+ "si vous passez par la case Depart recevez 200 pour payer le billet",15));
		listeCartes.add(new CarteDeplacement("Faite une promenade a Avenue Mozart avec votre amour \n"
				+ "si vous passez par la case Depart recevez 200 pour payer un diner",16));
		listeCartes.add(new CarteDeplacement("Allez sur l'Avenue des Champs-Elysee et recontrez le nouveau president \n"
				+ "si vous passez par la case Depart recevez 200 pour ne pas avoir vote LePen",37));
		listeCartes.add(new CartePrison("En utilisant cette carte vous pouvez soritir de prison\n",this));
	}
	@Override
	public void effectuerAction(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		if(listeCartes.get(DerniereCarte) instanceof CartePrison){
			jeu.getJoueurTourActuel().setCartePrison(((CartePrison)(listeCartes.get(DerniereCarte))));
			((CartePrison)(listeCartes.get(DerniereCarte))).setProprietaire(jeu.getJoueurTourActuel());
			listeCartes.remove(DerniereCarte);
		}
		listeCartes.get(DerniereCarte).actionCarte(jeu);
	}
	@Override
	public int getCasePosition() {
		// TODO Auto-generated method stub
		return this.position;
	}
	public String texteCarte(){
		carteAleatoire();
		return listeCartes.get(DerniereCarte).getTexte();
	}
	public void carteAleatoire(){
		DerniereCarte = ( int )( Math.random() * 6 + 1 );

	}
	public ArrayList<CarteMonopoly> getListeCartes(){
		return this.listeCartes;
	}
	public void  joueDernierCarte(JeuMonopoly jeu){
		listeCartes.get(DerniereCarte).actionCarte(jeu);
	}
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
}
