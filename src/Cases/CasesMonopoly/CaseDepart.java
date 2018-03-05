package Cases.CasesMonopoly;

import jeu.JeuMonopoly;
/**
 * Cette classe represente CaseDepart qui est une case du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class CaseDepart extends CaseMonopoly {
		
		private String nom;
		private int casePosition;
	///////////////////////////////Constructeur//////////////////////////////////////
		/**
		 * Cree une Case CaseDepart a partir du nom de la case et de sa position,
		 * @param nom un String qui est le nom de la case
		 * @param casePosition un int qui est la position dans le damier
		**/
		public CaseDepart(String nom,int casePosition){
			super(nom);this.nom=nom;this.setCasePosition(casePosition);this.nom=nom;
		}
	////////////////////////////////Getters & Setters////////////////////////////////
		/**
		* Modifie la position de la case dans le damier
		* @param casePosition un int qui est la position dans le damier
		**/
		void setCasePosition(int casePosition){
			this.casePosition=casePosition;
		}
	////////////////////////////////Methodes/////////////////////////////////////////
		/**
		* Effectue l'action de la case
		* @param jeu un JeuMonopoly qui est le jeu actuel
		**/
		public void effectuerAction(JeuMonopoly jeu){
		 jeu.getJoueurTourActuel().recevoirArgent(200);
		}
		/**
		* Retourne la position de la case dans le damier
		* @return casePosition un int qui est la position de la case dans le damier
		**/
		@Override
		public int getCasePosition() {
			return this.casePosition;
		}
		/**
		 * Retourne le nom du terrain
		 * @return nom un String qui est le nom du terrain
		 **/
		public String getNom()
		{
			return this.nom;
		}
}

