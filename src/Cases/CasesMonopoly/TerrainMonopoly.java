package Cases.CasesMonopoly;

import damiers.DamierMonopoly;
import javafx.scene.effect.ColorInput;

import java.awt.Color;

import Cases.Case;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente un Terrain qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class TerrainMonopoly extends CaseMonopoly implements Achetable {
	
	private JoueurMonopoly proprietaire;
	private int terrainCasePosition;
	private String nom;
	private int prixTerrain;
	private int prixLoyer;
	private int prixMaison;
	private int nbMaison;
	private int prixHotel;
	private String couleur;
	private boolean aUnHotel;

//////////////////////////Constructeur////////////////////////////////////////////
/**
 * Cree un Terrain du Monopoly a partir du nom du terrain,le prix d'achat du terrain , le loyer initial du terrain nu, le prix d'une maison, et la position dans le damier
 * @param nom un String qui est le nom du terrain
 * @param prixTerrain un int qui est le prix d'achat du terrain
 * @param loyer un int qui est le prix du loyer initial du terrain (nu)
 * @param prixMaison un int qui est le prix d'achat d'une maison
 * @param terrainCasePosition un int qui est la position du terrain dans le damier
**/
public TerrainMonopoly (String nom,int prixTerrain,int loyer,int prixMaison,int terrainCasePosition,String couleur){
	super(nom); this.setPrixAchat(prixTerrain); this.setPrixLoyer(loyer); this.setPrixMaison(prixMaison);this.setTerrainCasePosition(terrainCasePosition);this.couleur=couleur;
	this.nbMaison=0; this.aUnHotel=false; this.couleur=couleur;this.nom=nom;
}

/////////////////////////Getters & Setters////////////////////////////////////////
@Override
/**
 * Retourne la position du terrain dans le damier en int
 * @return terrainCasePosition un int qui represente la position dans le damier du Monopoly
 **/
public int getCasePosition() {
	return this.terrainCasePosition;
}
/**
 * Retourne le nom du terrain
 * @return nom un String qui est le nom du terrain
 **/
public String getNom()
{
	return this.nom;
}
/**
 * Retourne le prix actuel du loyer du terrain
 * @return prixLoyer un int qui represente le prix du loyer du terrain
 **/
public int getPrixLoyer()
{
	return this.prixLoyer;
}
/**
 * Retourne le prix de construction d'une maison
 * @return prixMaison un int qui represente le prix d'achat d'une maison
 **/
public int getPrixMaison()
{
	return this.prixMaison;
}

/**
 * Modifie le nom du terrain
 * @param nom un String qui sera le nom du Terrain
 **/
public void setNom(String nom)
{
	this.nom =nom;
}
/**
 * Modifie le prix du loyer du terrain
 * @param prix un int qui est le nouveau prix du loyer
 **/
public void setPrixLoyer(int prix)
{
 this.prixLoyer=prix;
}
/**
 * Modifie le prix d'achat d'une maison
 * @param prix un int qui est le prix d'achat d'une maison
 **/
public void setPrixMaison(int prix)
{
	 this.prixMaison=prix;
}
/**
 * Modifie le prix d'achat du terrain
 * @param prix un int qui est le nouveau prix d'achat du terrain
 **/
public void setPrixAchat(int prix)
{
	this.prixTerrain=prix;
}
/**
 * Retourne le proprietaire du terrain
 * @return proprietaire un JoueurMonopoly qui est le proprietaire du terrain
 **/
public JoueurMonopoly getProprietaire()
{
	return this.proprietaire;
}
/**
 * Modifie le proprietaire du terrain
 * @param joueur un JoueurMonopoly qui sera le proprietaire du terrain
 **/
public void setProprietaire(JoueurMonopoly Joueur)
{
	this.proprietaire=Joueur;
}
/**
 * Modifie la position du terrain
 * @param casePosition un int qui sera le position du terrain dans le damier du Monopoly
 **/
public void setTerrainCasePosition(int casePosition)
{
	this.terrainCasePosition=casePosition;
}
/**
 * Retourne le nombre de maison presente sur le terrain
 * @return nbMaison un int qui est le nombre de maison
 **/
public int getNbMaison()
{
	return this.nbMaison;
}
/**
 * Modifie le nombre de maisons presentes sur le terrain
 * @param joueur un int qui sera le nombre de maisons du terrain
 **/
public void setNbMaison(int nbMaison)
{
	this.nbMaison=nbMaison;
}
/**
 * Retourne le prix d'achat du terrain
 * @return prixTerrain un int qui represente le prix d'achat du terrain
 **/
public int getPrixAchat(){
	return this.prixTerrain;
}
public String toString(){
	return " nom: " + this.nom + " prix du Loyer: "+ this.prixLoyer  + " nombre de maisons " + this.nbMaison + " prix d'une maison " + this.prixMaison + " prix du prochain Loyer " + this.prixLoyer*2 +" valeur Hypotecaire du terrain : " + this.prixTerrain/2; 
}
public String getCouluer(){
	return this.couleur;
}
////////////////////////////////////////////////////////////////////////Methodes//////////////////////////////////////////////////
/**
 * Methode qui permet au joueur d'ajouter une maison au terrain en payant le prix de la maison
 **/
public void ajouterMaison(){
	getProprietaire().soustraireArgent(this.prixMaison);
	setNbMaison(getNbMaison()+1);
	augmentationPrixLoyer();
}
/**
 * Methode qui permet le changement de propriete au joueur si le terrain n'appartient a personne
 * Sinon si le propriete achete a nouveau le terrain, la fonction ajoute une maison
 **/
public void estAcheterPar(JoueurMonopoly joueur){
	if (getProprietaire()==(joueur)){
		ajouterMaison();
	}
	else 
	{
		if(getProprietaire()==null)
		{
			setProprietaire(joueur);
			getProprietaire().soustraireArgent(this.prixTerrain);
		}
	}
}
/**
* Effectue l'action de la case
* @param jeu un JeuMonopoly qui est le jeu actuel
**/
@Override
public void effectuerAction(JeuMonopoly jeu) {
	if(this.getProprietaire() != null){
		if (this.getProprietaire()!= jeu.getJoueurTourActuel()){
			if(this.getProprietaire().getArgent()<this.prixLoyer){
				this.getProprietaire().setEstEnFallite(true);
			}
			else
			{
				this.getProprietaire().setEstEnFallite(false);
				jeu.getJoueurTourActuel().payerA(this.getProprietaire(), this.getPrixLoyer());
			}
			
		}
	}
}
/**
 * Methode qui permet d'augementer le prix du Loyer
 **/
public void augmentationPrixLoyer(){
	if (prixLoyer<200){
		setPrixLoyer(this.prixLoyer*3);
	}
	else
	{
		setPrixLoyer(this.prixLoyer+80);
	}
	
}
/**
 * Methode qui au terrain d'etre vendu et de donner donc la veleur hypothécaire du terrain au proprietaire 
 **/
@Override
public void estVendue() {
	if(this.nbMaison>0){
		
		this.getProprietaire().recevoirArgent(this.prixMaison/2);
		this.nbMaison--;
	}
	else
	{
		this.getProprietaire().recevoirArgent(this.prixTerrain/2);
		this.proprietaire=null;
	}
	
	
}


}

