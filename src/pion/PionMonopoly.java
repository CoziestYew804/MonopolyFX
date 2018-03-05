package pion;
import Cases.Case;
import Cases.CasesMonopoly.CaseMonopoly;
import damiers.Damier;
import damiers.DamierMonopoly;

/**
 * Cette classe est une classe qui represente un Pion du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class PionMonopoly extends Pion {
	private DamierMonopoly damier;
	private CaseMonopoly position;
	
	
////////////////////////////Constructeur//////////////////////////////
/**
 * Cree un pion du Monopoly avec comme parametre son la case ou il sera place au depart, et le damier sur laquelle se trouve la case
 * @param position une Case qui sera la case de depart sur laquelle se trouvera le pion
 * @param damier un Damier sur lequel se trouve la case 
 **/
public PionMonopoly(CaseMonopoly position,DamierMonopoly damier){
	super(position,damier);
	this.setDamier(damier);
	this.setPosition(position);
	
}

///////////////////////////Getters & Setters//////////////////////////
/**
 * Change le damier sur leuquel se trouve le pion
 * @param damier un DamierMonopoly qui sera le nouveau damier sur lequel se trouvera le pion
 **/
public void setDamier(DamierMonopoly damier){
	this.damier=damier;
}
/**
 * Modifie la position( la case) sur laquelle se trouve le pion
 * @param position une CaseMonopoly qui sera la case sur laquelle se trouve le pion
 **/
public void setPosition(CaseMonopoly position){
	this.position=position;
}
/**
 * retourne la case sur laquelle se trouve le pion
 * @return position une CaseMonopoly qui represente la case sur laquelle se trouve le pion
 **/
public CaseMonopoly getPosition(){
	return this.position;
}
/**
 * retourne le damier sur lequel se trouve le pion
 * @return damier un DamierMonopoly qui est le damier sur leuquel se trouve la position du pion
 **/
public DamierMonopoly getDamier(){
	return this.damier;
}
/**
 * retourne la position de la case sur le damier
 * @return int la position de la case sur le damier 
 **/
public int getCasePosition(){
	return this.getPosition().getCasePosition();
}
//////////////////////////Methodes//////////////////////////////////////
/**
 * Deplace le pion en fonction d'un nombre de deplacements 
 **/
public void deplacer(int nbDeplacements){
	System.out.println("deplacer " + nbDeplacements + " " + this.getCasePosition());
	
	this.setPosition(this.getDamier().getCase(nbDeplacements+(this.getCasePosition())));
}

}
