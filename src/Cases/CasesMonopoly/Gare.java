package Cases.CasesMonopoly;

import Cases.Case;
import damiers.Damier;
import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.Joueur;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente Gare qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class Gare extends CaseMonopoly implements Achetable {
	
	private JoueurMonopoly proprietaire;
	private String nom;
	private int prixAchat;
	private int prixLoyer;
	private int casePosition;


//////////////////////////////////Constructeur/////////////////////////////////////
	/**
	 * Cree une Case Gare a partir du nom de la case, de sa position, du prix Achat , du prix du loyer
	 * @param nom un String qui est le nom de la case
	 * @param casePosition un int qui est la position dans le damier
	 * @param prixAchat un int qui est le prix d'achat de la case
	 * @param prixLoyer un int qui est le prix a payer au proprietaire de la case
	**/
	public Gare (String nom,int prixAchat,int prixLoyer,int casePosition){
		super(nom);setPrixAchat(prixAchat);setPrixLoyer(prixLoyer);this.setCasePosition(casePosition);this.nom=nom;
	}
	
/////////////////////////////////Getters & Setters/////////////////////////////////
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
	/**
	 * Retourne le proprietaire du terrain
	 * @return proprietaire un JoueurMonopoly qui est le proprietaire de la gare
	 **/
	public JoueurMonopoly getProprietaire(){
		return this.proprietaire;
	}
	/**
	 * Modifie le proprietaire du terrain
	 * @param joueur un JoueurMonopoly qui sera le proprietaire de la gare
	 **/
	public void setProprietaire(JoueurMonopoly proprietaire){
		this.proprietaire=proprietaire;
	}
	/**
	 * Modifie le prix d'achat de la gare
	 * @param prix un int qui est le nouveau prix d'achat de la gare
	 **/
	public void setPrixAchat(int prixAchat){
		this.prixAchat=prixAchat;
	}
	/**
	 * Modifie le prix du loyer du terrain
	 * @param prix un int qui est le nouveau prix du loyer
	 **/
	public void setPrixLoyer(int prixLoyer){
		this.prixLoyer=prixLoyer;
	}
	/**
	* Modifie la position de la case dans le damier
	* @param casePosition un int qui est la position dans le damier
	**/
	private void setCasePosition(int casePosition){
		this.casePosition=casePosition;
	}
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	@Override
	public int getCasePosition() {
		return this.casePosition;
	}
	public int getPrixAchat(){
		return this.prixAchat;
	}

////////////////////////////////Methodes////////////////////////////////////////
	/**
	 * Methode qui permet le changement de propriete au joueur si le terrain n'appartient a personne
	 * Sinon si le propriete achete a nouveau le terrain, la fonction ajoute une maison
	 **/
	public void estAcheterPar(JoueurMonopoly joueur){ 
		if (getProprietaire()==null)
		{
		setProprietaire(joueur);joueur.soustraireArgent(this.prixAchat);
		}
}
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	public void effectuerAction(JeuMonopoly jeu) {
		
		if(this.getProprietaire()!=null)
		{
			if(this.getProprietaire()!=jeu.getJoueurTourActuel())
			{
				int nbGareQuePossedeLeProprietaire=0;
				//Si le proprietaire possede 4 Gares
				for (int i=5;i<40;i=+10){
					
					if (jeu.getDamier().getCase(5).getProprietaire()==this.proprietaire)
					{
						nbGareQuePossedeLeProprietaire=+1;
					}
				}
				if(jeu.getJoueurTourActuel().getArgent()<this.prixLoyer*nbGareQuePossedeLeProprietaire)
				{
					jeu.getJoueurTourActuel().setEstEnFallite(true);
				}
				else
				{
					jeu.getJoueurTourActuel().payerA(this.getProprietaire(),this.prixLoyer*nbGareQuePossedeLeProprietaire);
				}
				
			}	
		}
		
	}
////////////////////////////////FINI////////////////////////////////////////////
	/**
	 * Methode qui au terrain d'etre vendu et de donner donc la veleur hypothécaire du terrain au proprietaire 
	 **/
	@Override
	public void estVendue() {
		// TODO Auto-generated method stub
		this.getProprietaire().recevoirArgent(this.getPrixAchat()/2);
		this.proprietaire=null;
	}
	

}
