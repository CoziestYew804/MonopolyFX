package jeu;

import java.util.ArrayList;

import Des.DesMonopoly;
import Cases.Case;
import Cases.CasesMonopoly.Achetable;
import Cases.CasesMonopoly.CaseMonopoly;
import damiers.DamierMonopoly;
import joueurs.JoueurMonopoly;
import pion.Pion;
import pion.PionMonopoly;
/**
 * Cette classe est une classe abstraite qui represente le jeu du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class JeuMonopoly extends Jeu {
	
	private DesMonopoly de;
	private DamierMonopoly damier;
	private ArrayList<JoueurMonopoly> lJoueur;
	
/////////////////////////////////////////////Constructeur////////////////////////////////////////////
	/**
	 * Cree un nouveau jeu du monopoly a partir du nombre de joueurs
	 * @param nbJoueurs un int qui represente le nombre de joueurs
	 **/
	public JeuMonopoly(int nbJoueurs){
		super(nbJoueurs);

		this.lJoueur=new ArrayList<JoueurMonopoly>();
//On cree des des
		de=new DesMonopoly();
//on cree un damier
		this.damier=new DamierMonopoly();
		if (nbJoueurs==2){
			lJoueur.add(new JoueurMonopoly("Martin",1));
			lJoueur.get(0).setPion(new PionMonopoly(this.getDamier().getCase(0),this.getDamier()));
			lJoueur.add(new JoueurMonopoly("Giovanni",2));
			lJoueur.get(1).setPion(new PionMonopoly(this.getDamier().getCase(0),this.getDamier()));
			Achetable a=(Achetable)damier.getCase(1);
			a.estAcheterPar(lJoueur.get(0));
			a=(Achetable)damier.getCase(3);
			a.estAcheterPar(lJoueur.get(0));
			a=(Achetable)damier.getCase(8);
			a.estAcheterPar(lJoueur.get(0));
			a=(Achetable)damier.getCase(6);
			a.estAcheterPar(lJoueur.get(0));
			a=(Achetable)damier.getCase(9);
			a.estAcheterPar(lJoueur.get(0));
		}
		else{
			for (int i = 0;i<nbJoueurs;i++)
			{
			lJoueur.add(new JoueurMonopoly((" Joueur "+ (i+1)),i+1));
			lJoueur.get(i).setPion(new PionMonopoly(this.getDamier().getCase(0),this.getDamier()));
			}
			}
			lJoueur.get(0).setEstSonTour(true);
	}
	/////////////////////////////////////////Methodes//////////////////////////////////////////////// 
	/**
	 * retourne une case du damier a la position pos
	 * @param pos un int qui represente la position de la case sur le damier
	 * @return la case qui se trouve a la position pos
	 **/
        public CaseMonopoly getCaseDamier(int pos){
            return this.getDamier().getCase(pos);
        }
    	/**
    	 * retourne le joueur participant au jeu dont est le tour de jouer
    	 * @return joueur un JoueurMonopoly qui doit jouer
    	 **/
         public JoueurMonopoly getJoueurTourActuel(){
            for (int i=0 ; i < lJoueur.size(); i++){
                if (lJoueur.get(i).getEstSonTour()==true){
                    return lJoueur.get(i);
                    //break;
                }
            }
            return null;
           
         }
     	/**
     	 * modifie le statut du joueur dont actuellement est le tout pour permettre au joueur suivant de joueur
     	 **/
        public void setNextJoueurTour(){
        	for (int i=0 ; i < lJoueur.size(); i++){
                if (lJoueur.get(i).getEstSonTour()==true){
                	if( i==lJoueur.size()-1)
                	{
                	//si le joueur qui avait passe le tour etait le dernier alors le tour est maintenant au premier
                		lJoueur.get(i).setEstSonTour(false);
                		lJoueur.get(0).setEstSonTour(true);
                    	break;
                	}
                	else
                	{
                		
                		lJoueur.get(i).setEstSonTour(false);
                		lJoueur.get(i+1).setEstSonTour(true);
                    break;
                	}
                }
        		
        	}
        }
    	/**
    	 * supprime le joueur qui a abandonnee au jeu 
    	 **/
       
        public void unJoueurAbandonne(JoueurMonopoly joueur){
        	joueur.abandonne();
        	setNextJoueurTour();
        	lJoueur.remove(joueur);	
        }
    	/**
    	 * retourne le numero du joueur ( si c'est le premier , deuxieme , etc...)
    	 * @return i+1 un int qui represente le numero du joueur
    	 **/
        public int getNumeroJoueurActuel(){
        	 for (int i=0 ; i < lJoueur.size(); i++){
                 if (lJoueur.get(i).getEstSonTour()==true){
                     return i+1;
                 }
             }
             return 0;
        }
	/////////////////////////////////////////Getters & Setters///////////////////////////////////////
	
        public JoueurMonopoly getJoueur(int i){
                return lJoueur.get(i);
        }
    	/**
    	 * retourne le damier du Monopoly qui est le damier utilise dans le jeu
    	 * @return damier un DamierMonpoly
    	 **/
        public DamierMonopoly getDamier(){
            return this.damier;
        }
        /**
    	 * retourne le(s) des du Monopoly utilise dans le jeu
    	 * @return de un DesMonopoly
    	 **/
        public DesMonopoly getDes(){
        	return this.de;
        }
        public ArrayList<JoueurMonopoly> getLJoueur(){
        	return this.lJoueur;
        }
      
}
