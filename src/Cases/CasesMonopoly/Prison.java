package Cases.CasesMonopoly;

import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;

import java.util.Scanner;

import Cases.Case; 
/**
 * Cette classe represente Prison qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class Prison extends CaseMonopoly {
	private String nom;
	private int casePosition;

/////////////////////////////////Constructeur//////////////////////////////////
	/**
	 * Cree une Case Prison a partir du nom de la case et de sa position,
	 * @param nom un String qui est le nom de la case
	 * @param casePosition un int qui est la position dans le damier
	**/
	public Prison (String nom, int casePosition) {
		
		super(nom); this.setCasePosition(casePosition);this.nom=nom;
	}
////////////////////////////////Getters & Setters//////////////////////////////
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
	/**
	* Modifie la position de la case dans le damier
	* @param casePosition un int qui est la position dans le damier
	**/
	public void setCasePosition(int casePosition){
		
		this.casePosition=casePosition;
	}
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	public int getCasePosition(){
		
		return this.casePosition;
	}
	///////////////////////////////////////////////////////////////////////////
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	public void effectuerAction(JeuMonopoly jeu){
		if(jeu.getJoueurTourActuel().getEstEnPrison()==true)
		{
			if(jeu.getJoueurTourActuel().getToursEnPrison() <3 )
			{
                 jeu.getJoueurTourActuel().incrTourEnPrison();        
			}
            else
            {
            	if(jeu.getJoueurTourActuel().getArgent()<150)
            	{
            		jeu.getJoueurTourActuel().setEstEnFallite(true);
            	}
            	else
            	{
            		System.out.println("Vous Etes Obbligee de Sortir de Prison");
                	jeu.getJoueurTourActuel().soustraireArgent(150);
                	jeu.getJoueurTourActuel().setEstEnPrison(false);
                	jeu.getJoueurTourActuel().setEstEnFallite(false);
            	}
        
            }
        }
	}
}
