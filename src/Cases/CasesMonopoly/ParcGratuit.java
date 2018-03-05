package Cases.CasesMonopoly;



import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente ParcGratuit qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class ParcGratuit extends CaseMonopoly {
	
	private String nom;
	private int argentDesImpots=0;
	private int casePosition;
///////////////////////////////////////Constructeur///////////////////////////////////////////
	/**
	 * Cree une Case ParcGratuit a partir du nom de la case et de sa position,
	 * @param nom un String qui est le nom de la case
	 * @param casePosition un int qui est la position dans le damier
	**/
	public ParcGratuit(String nom,int position) {
		super(nom);this.setCasePosition(position);this.nom=nom;
		
	}
//////////////////////////////////////Getters & Setters///////////////////////////////////////
	/**
	 * Retourne le nom du terrain
	 * @return nom un String qui est le nom du terrain
	 **/
	public String getNom()
	{
		return this.nom;
	}
	public void setNom(String nom){
		this.nom=nom;
	}	/**
	* Modifie la position de la case dans le damier
	* @param casePosition un int qui est la position dans le damier
	**/
	public void setCasePosition(int position){
		this.casePosition=position;
	}
	/**
	* Retourne l'argent cumulee par les impots
	* @return argentDesImpots un int 
	**/
	public int getArgentDesImpots(){
		return this.argentDesImpots;
	}
	/**
	* Modifie l'argent cumulee par les impots
	* @param argent un int
	**/
	public void setArgentDesImpots(int argent){
		this.argentDesImpots=argent+this.argentDesImpots;
	}
	/**
	* Retourne la position de la case dans le damier
	* @return casePosition un int qui est la position de la case dans le damier
	**/
	@Override
	public int getCasePosition() {
		return this.casePosition;
	}
///////////////////////////////////////Methodes/////////////////////////////////////////////
	/**
	* Effectue l'action de la case
	* @param jeu un JeuMonopoly qui est le jeu actuel
	**/
	@Override
	public void effectuerAction(JeuMonopoly jeu) {
		// TODO Auto-generated method stub
		jeu.getJoueurTourActuel().recevoirArgent(this.getArgentDesImpots());
		this.argentDesImpots=0;	
	}

}

