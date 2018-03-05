package pion;

import Cases.Case;
import Cases.CasesMonopoly.CaseMonopoly;
import damiers.Damier;
import damiers.DamierMonopoly;
/**
 * Cette classe est une classe abstraite qui represente un Pion quelconque
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class Pion {
	Case position;
	Damier damier;
/**
 * Cree un joueur avec comme parametre son la case ou il sera place au depart, et le damier sur laquelle se trouve la case
 * @param position une Case qui sera la case de depart sur laquelle se trouvera le pion
 * @param damier un Damier sur lequel se trouve la case 
 **/
	public Pion(Case position,Damier damier){
		this.setDamier(damier);
		this.setPosition(position);
		
	}
	/**
	 * Change le damier sur leuquel se trouve le pion
	 * @param damier un Damier qui sera le nouveau damier sur lequel se trouvera le pion
	 **/
	public void setDamier(Damier damier){
		this.damier=damier;
	}
	/**
	 * Modifie la position( la case) sur laquelle se trouve le pion
	 * @param position une Case qui sera la case sur laquelle se trouve le pion
	 **/
	public void setPosition(Case position){
		this.position=position;
	}
	/**
	 * retourne la case sur laquelle se trouve le pion
	 * @return position une Case qui represente la case sur laquelle se trouve le pion
	 **/
	public Case getPosition(){
		return this.position;
	}
	/**
	 * retourne le damier sur lequel se trouve le pion
	 * @return damier un Damier qui est le damier sur leuquel se trouve la position du pion
	 **/
	public Damier getDamier(){
		return this.damier;
	}
	/**
	 * une methode abstraite qui permet de deplacer le pion en fonction d'un nombre de deplacements
	 **/
	public abstract void deplacer(int nbDeplacements);
	/**
	 * une methode abstraite qui permet de retourner la position de la case sur laquelle se trouve le pion
	 **/
	public abstract int getCasePosition();
	
}
