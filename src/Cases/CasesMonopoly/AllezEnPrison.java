package Cases.CasesMonopoly;

import Cases.Case;
import damiers.Damier;
import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente AllezEnPrison qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class AllezEnPrison extends CaseMonopoly {
	
	private String nom;
	private int casePosition;
///////////////////////////////Constructeur//////////////////////////////////////
	/**
	 * Cree une Case AllezEnPrison a partir du nom de la case et de sa position,
	 * @param nom un String qui est le nom de la case
	 * @param casePosition un int qui est la position dans le damier
	**/
	public AllezEnPrison(String nom,int casePosition){
		super(nom);this.setCasePosition(casePosition);this.nom=nom;
	}
////////////////////////////////Getters & Setters////////////////////////////////
	/**
	* Modifie la position de la case dans le damier
	* @param casePosition un int qui est la position dans le damier
	**/
	private void setCasePosition(int casePosition){
		this.casePosition=casePosition;
	}
////////////////////////////////Methodes/////////////////////////////////////////
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	public void effectuerAction(JeuMonopoly jeu){
	 jeu.getJoueurTourActuel().allerEnPrison(jeu.getDamier().getCase(10));
	 jeu.getJoueurTourActuel().setEstEnPrison(true);
	 jeu.getJoueurTourActuel().setToursEnPrison(0);
        }
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	@Override
	public int getCasePosition() {
		return this.casePosition;
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
