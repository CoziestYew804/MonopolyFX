package Cases.CasesMonopoly;
import Cases.CasesMonopoly.*;
import Cases.Case;
import damiers.DamierMonopoly;
import jeu.JeuMonopoly;
import joueurs.JoueurMonopoly;
/**
 * Cette classe represente Impot qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class Impot extends CaseMonopoly {
		private String nom;
		private int prixImpot;
		private int casePosition;
		
	////////////////////////////////////Constructeur////////////////////////////////////////
		/**
		 * Cree une Case AllezEnPrison a partir du nom de la case et de sa position,
		 * @param nom un String qui est le nom de la case
		 * @param casePosition un int qui est la position dans le damier
		 * @param prix Impot le prix d'impot a payer par le joueur
		**/
		public Impot (String nom, int prixImpot,int position){
			super(nom);this.setPrixImpot(prixImpot);this.setPosition(position);this.nom=nom;
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
		 * Modifie le nom de la case Impot
		 * @param nom un String qui sera le nom du case Impot
		 **/
		public void setNom(String nom){
			this.nom=nom;
		}
		/**
		 * Modifie le prix a payer de la case Impot
		 * @param prix un int qui sera le nouveau prix a payer au impots
		 **/
		public void setPrixImpot(int prix){
			this.prixImpot=prix ;
		}
		/**
		* Modifie la position de la case dans le damier
		* @param casePosition un int qui est la position dans le damier
		**/
		public void setPosition(int  position){
			this.casePosition=position;
		}
		/**
		* Retourne la position de la case dans le damier
		* @return casePosition un int qui est la position de la case dans le damier
		**/
		@Override
		public int getCasePosition() {
			return this.casePosition;
		}
	/////////////////////////////////////Methodes////////////////////////////////////////////////
		/**
		* Effectue l'action de la case
		* @param jeu un JeuMonopoly qui est le jeu actuel
		**/
		public void effectuerAction(JeuMonopoly jeu){
			if (jeu.getJoueurTourActuel().getArgent() < this.prixImpot){
				
				
				jeu.getJoueurTourActuel().setEstEnFallite(true);
			}
			else
			{
				jeu.getJoueurTourActuel().soustraireArgent(this.prixImpot);
				((ParcGratuit) jeu.getCaseDamier(20)).setArgentDesImpots(this.prixImpot);
				jeu.getJoueurTourActuel().setEstEnFallite(false);
			}
	}

}
