package Cases.CasesMonopoly;

import Cases.Case;
import damiers.*;
import jeu.JeuMonopoly;
import joueurs.*;
/**
 * Cette classe represente ServicePubliques qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class ServicesPubliques extends CaseMonopoly implements Achetable {
	
	private JoueurMonopoly proprietaire;
	private String nom;
	private int prixAchat;
	private int casePosition;
////////////////////////////////////Constructeur////////////////////////////////////////
	/**
	 * Cree une Case ServicePublique a partir du nom de la case, de sa position, du prix Achat , du prix du loyer
	 * @param nom un String qui est le nom de la case
	 * @param position un int qui est la position dans le damier
	 * @param prixAchat un int qui est le prix d'achat de la case
	**/
	public ServicesPubliques (String nom, int prix,int position){
		super(nom);this.nom=nom; this.setPrixAchat(prix);this.setCasePosition(position);
	}
	
////////////////////////////////////Getters & Setters//////////////////////////////////
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	@Override
	public int getCasePosition() {
		return this.casePosition;
	}
	public void setNom(String nom){
		this.nom=nom;
	}
	/**
	 * Modifie le prix d'achat du servicePublique
	 * @param prix un int qui est le nouveau prix d'achat de la gare
	 **/
	public void setPrixAchat(int prix){
		this.prixAchat=prix;
	}
	public int getPrixAchat(){
		return this.prixAchat;
	}
	public JoueurMonopoly getProprietaire(){
		return this.proprietaire;
	}
	/**
	 * Modifie le proprietaire du terrain
	 * @param joueur un JoueurMonopoly qui sera le proprietaire du ServicePublique
	 **/
	public void setProprietaire(JoueurMonopoly proprietaire){
		this.proprietaire=proprietaire;
	}
	/**
	* Modifie la position de la case dans le damier
	* @param casePosition un int qui est la position dans le damier
	**/
	private void setCasePosition(int position){
		 this.casePosition=position;
	}
/////////////////////////////////////Methodes////////////////////////////////////////////////
	/**
	 * Methode qui permet le changement de propriete au joueur si le terrain n'appartient a personne
	 * Sinon si le propriete achete a nouveau le terrain, la fonction ajoute une maison
	 **/
	public void estAcheterPar(JoueurMonopoly joueur){
		if (getProprietaire()==null){
		setProprietaire(joueur);joueur.soustraireArgent(this.prixAchat);
		}
}
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	public void effectuerAction(JeuMonopoly jeu){
		if (this.getProprietaire()!=null){
			
			if(this.getProprietaire()!=jeu.getJoueurTourActuel())
			{
				//Si le proprietaire possede 2 services publiques il doit alors payer 10 x la somme des des
				if (jeu.getDamier().getCase(12).getProprietaire()==jeu.getDamier().getCase(28).getProprietaire()){
						if (jeu.getJoueurTourActuel().getArgent() < 10*(jeu.getDes().sommeDesDes())){
						
							jeu.getJoueurTourActuel().setEstEnFallite(true);
						}
						else
						{
							jeu.getJoueurTourActuel().payerA(this.getProprietaire(),10*(jeu.getDes().sommeDesDes()));
							jeu.getJoueurTourActuel().setEstEnFallite(false);
						}
						
				}
				//Si le proprietaire possede 1 service publique il doit alors payer 4 x la somme des des
				else 
				{
					if (jeu.getJoueurTourActuel().getArgent() < 4*jeu.getDes().sommeDesDes()){
						
						jeu.getJoueurTourActuel().setEstEnFallite(true);
					}
					else
					{
						jeu.getJoueurTourActuel().payerA(this.getProprietaire(), 4);
						jeu.getJoueurTourActuel().setEstEnFallite(false);
					}
					
				}
			}
		}
	}
	/**
	 * Methode qui au terrain d'etre vendu et de donner donc la veleur hypothécaire du terrain au proprietaire 
	 **/
	@Override
	public void estVendue() {
		this.getProprietaire().recevoirArgent(this.getPrixAchat()/2);
		this.proprietaire=null;
	}


}
