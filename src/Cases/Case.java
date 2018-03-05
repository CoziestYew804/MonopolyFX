package Cases;

import damiers.Damier;
import damiers.DamierMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente une case quelconque 
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class Case {
	
	
	private String nom;
	private int posisition;

////////////////////////////Constructeur////////////////////////////
/**
* Cree une case avec comme parametre son nom
* @param nom un String qui est le nom de la case
**/
public Case(String nom){
	this.nom=nom;
};
////////////////////////////Getters & Setters///////////////////////
/**
* Modifie le nom de la case 
* @param nom un String qui sera le nom de la case
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

public String toString(){
	return " nom " + this.nom ; 
}

}
