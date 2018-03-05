package Cases.CasesMonopoly;

import java.util.ArrayList;

import cartes.CarteAddition;
import cartes.CarteDeplacement;
import cartes.CarteMonopoly;
import cartes.CartePayement;
import jeu.JeuMonopoly;
/**
 * Cette classe represente CaisseCommunaute qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class CaisseCommunaute extends CaseMonopoly {

	private String nom;
	private int position;
	private ArrayList<CarteMonopoly> listeCartes;
	private int DerniereCarte;

	//////////////////////////////////////Constructeur////////////////////////////////////////
	/**
	 * Cree une Case CaisseCommunaute a partir du nom de la case et de sa position,
	 * @param nom un String qui est le nom de la case
	 * @param casePosition un int qui est la position dans le damier
	**/
	public CaisseCommunaute(String nom, int position){
		super(nom); this.position=position; this.nom=nom;
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
	}
	///////////////////////////Methodes//////////////////////////////////////////////////////
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	@Override
	public void effectuerAction(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		
		listeCartes.get(DerniereCarte).actionCarte(jeu);
	}
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	@Override
	public int getCasePosition() {
		// TODO Auto-generated method stub
		return this.position;
	}
	/**
	* Retourne le texte de la carte qui a ete pioche
	* @return texte un String qui est texte de la carte
	**/
	public String texteCarte(){
		carteAleatoire();
		return listeCartes.get(DerniereCarte).getTexte();
	}
	/**
	* Modifie le numero de la derniere carte piochee
	**/
	public void carteAleatoire(){
		DerniereCarte = ( int )( Math.random() * 6 + 1 );

	}
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
	public void  joueDernierCarte(JeuMonopoly jeu){
		listeCartes.get(DerniereCarte).actionCarte(jeu);
	}
	
}



