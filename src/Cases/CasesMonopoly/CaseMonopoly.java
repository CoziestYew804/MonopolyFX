
package Cases.CasesMonopoly;

import Cases.Case;
import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
/**
 * Cette classe est une classe abstraite qui represente une case du Monpoly 
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class CaseMonopoly extends Case {

	
	private JoueurMonopoly proprietaire;
	private String nom;
	private int position;
	

////////////////////////////Constructeur////////////////////////////
	/**
	 * Cree une Case du Monopoly a partir du nom de la case,
	 * @param nom un String qui est le nom de la case
	**/
public CaseMonopoly(String nom){
	super(nom);this.nom=nom;
};
////////////////////////////Getters & Setters///////////////////////
/**
 * Modifie le nom de la case
 * @param nom un String qui est le nom de la case
 **/
public void setNom(String nom){
	this.nom=nom;
}
/**
 * Retourne le nom de la case
 * @return nom un String qui est le nom de la case
 **/
public String getNom(){
	return this.nom;
}
/**
 * Retourne le la position de la case dans le damier
 * @return position un int qui est la position de la case
 **/
public int getPosition(){
	return this.position;
}
public String toString(){
	return " nom " + this.nom ; 
}
/**
* retourne le proprietaire de la case
* @return joueurMonopoly le Joueur qui est le proprietaire de la case
**/
public JoueurMonopoly getProprietaire(){
	return this.proprietaire;
}
/**
* Modifie le proprietaire de la case
* @param joueurMonopoly un Joueur qui est le proprietaire de la case
**/
public void setProprietaire(JoueurMonopoly joueur){
	this.proprietaire=joueur;
}


////////////////////////////Methodes////////////////////////////////
public abstract void effectuerAction(JeuMonopoly jeu);
public abstract int getCasePosition();


}
	

