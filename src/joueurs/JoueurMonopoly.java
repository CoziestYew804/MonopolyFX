
package joueurs;
import Des.DesMonopoly;
import cartes.CartePrison;
import jeu.JeuMonopoly;
import Cases.Case;
import Cases.CasesMonopoly.Achetable;
import Cases.CasesMonopoly.CaseMonopoly;
import Cases.CasesMonopoly.Chance;
import Cases.CasesMonopoly.TerrainMonopoly;
import pion.Pion;
import pion.PionMonopoly;
/**
 * Cette classe represente un Joueur du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class JoueurMonopoly extends Joueur {
	
	private int argent;
	private String nom;
	private PionMonopoly pion;
	private int numeroJoueur;
	private CartePrison carte;
	private boolean abandonne;
	private boolean aPerdu;
	private boolean estSonTour;
	private boolean estEnPrison;
	private int toursEnPrison; 
	private boolean estEnFallite;
	
 
///////////////////////////////////Constructeurs/////////////////////////////////////////////////
	/**
	 * Cree un joueur du monopoly avec comme parametre son nom
	 * @param nom le nom du joueur qui va etre cree
	 **/
	public JoueurMonopoly(String nom, int numeroJoueur){
		super(nom);this.argent=1500;this.estSonTour=false;this.estEnPrison=false;this.toursEnPrison=0; 
		this.abandonne=false;this.aPerdu=false; this.numeroJoueur=numeroJoueur; this.estEnFallite=false;
	}
///////////////////////////////////Methodes//////////////////////////////////////////////////////
	 /**
		 * Retourne la case du damier du Monopoly sur laquelle se trouve le pion du joueur
		 * @return ? une CaseMonopoly qui correspond a la case sur laquelle se trouve le pion
		 **/
	public boolean possedeTousLesTerrainDuMmGroupe(JeuMonopoly jeu){
		if(this.getCasePion() instanceof TerrainMonopoly){
		switch(((TerrainMonopoly) this.getCasePion()).getCouluer()){
		case "marron" :
			if((jeu.getCaseDamier(1).getProprietaire()==jeu.getCaseDamier(3).getProprietaire()) &&(jeu.getCaseDamier(1).getProprietaire()==this)){
				return true;
				
			}
		case "cyan" :
			if((jeu.getCaseDamier(6).getProprietaire()==jeu.getCaseDamier(8).getProprietaire()) && (jeu.getCaseDamier(8).getProprietaire()==jeu.getCaseDamier(9).getProprietaire())&& (jeu.getCaseDamier(9).getProprietaire()==this)){
				return true;
				
			}
		case "violet" :
			if((jeu.getCaseDamier(11).getProprietaire()==jeu.getCaseDamier(13).getProprietaire()) && (jeu.getCaseDamier(13).getProprietaire()==jeu.getCaseDamier(14).getProprietaire())&& (jeu.getCaseDamier(14).getProprietaire()==this)){
				return true;
				
			}
		case "orange" :
			if((jeu.getCaseDamier(16).getProprietaire()==jeu.getCaseDamier(18).getProprietaire()) && (jeu.getCaseDamier(18).getProprietaire()==jeu.getCaseDamier(19).getProprietaire())&& (jeu.getCaseDamier(19).getProprietaire()==this)){
				return true;
				
			}
		case "rouge" :
			if((jeu.getCaseDamier(21).getProprietaire()==jeu.getCaseDamier(23).getProprietaire()) && (jeu.getCaseDamier(23).getProprietaire()==jeu.getCaseDamier(24).getProprietaire())&& (jeu.getCaseDamier(24).getProprietaire()==this)){
				return true;
				
			}
		case "jaune" :
			if((jeu.getCaseDamier(26).getProprietaire()==jeu.getCaseDamier(27).getProprietaire()) && (jeu.getCaseDamier(27).getProprietaire()==jeu.getCaseDamier(29).getProprietaire())&& (jeu.getCaseDamier(29).getProprietaire()==this)){
				return true;
				
			}
		case "vert" :
			if((jeu.getCaseDamier(31).getProprietaire()==jeu.getCaseDamier(32).getProprietaire()) && (jeu.getCaseDamier(32).getProprietaire()==jeu.getCaseDamier(34).getProprietaire())&& (jeu.getCaseDamier(34).getProprietaire()==this)){
				return true;
				
			}
		case "bleu" :
			if((jeu.getCaseDamier(37).getProprietaire()==jeu.getCaseDamier(38).getProprietaire()) && (jeu.getCaseDamier(39).getProprietaire()==this)){
				return true;
				
			}
		default:
			return false;
				
		}
		}
		else{return false;}
	}
	/**
	 * Incremente le nombre des tours passees en prison par le joueur
	 **/
	public void incrTourEnPrison(){
		this.toursEnPrison++;
	}
	/**
	 * Le joueur paye a un autre joueur une somme d'argent
	 * @param joueur un JoueurMonopoly qui represente un joueur du Monopoly 
	 * @param argent un int qui represente une somme d'argent qui devra etre paye
	 **/
	public void payerA(JoueurMonopoly joueur,int argent){
		this.soustraireArgent(argent);
		joueur.recevoirArgent(argent);
		System.out.println("Vous avez paye " + argent  + " a " + joueur.getNom());
	}
	 /**
		 * Retourne la case du damier du Monopoly sur laquelle se trouve le pion du joueur
		 * @return ? une CaseMonopoly qui correspond a la case sur laquelle se trouve le pion
		 **/
	public CaseMonopoly getCasePion(){
		return this.getPion().getPosition();
	}
	
	/**
	 * Le joueur recoit un somme d'argent
	 * @param sommeArgent un int qui represente la somme d'argent
	 **/
    public void recevoirArgent(int sommeArgent){
    	this.setArgent((this.getArgent())+sommeArgent);
    }
    /**
	 * soustrait au joueur une somme d'argent
	 * @param sommeArgent un int qui represente la somme d'argent
	 **/
    public void soustraireArgent(int sommeArgent){
    	this.setArgent(this.getArgent()-sommeArgent);
    }
    /**
   	 * Permet au joueur d'acheter une case Monopoly de type achetable
   	 **/
    public void acheter() {
    	if (getCasePion() instanceof Achetable){
    		((Achetable) getCasePion()).estAcheterPar(this);
    	}
    }
    /**
   	 * Le joueur deplace son pion selon un nombre de deplacement
   	 * @param nbDeplacement un int qui represente le nombre de deplacement que le joueur devra faire effectuer au pion
   	 **/
    public void deplacerPion(int nbDeplacements){
    	this.getPion().deplacer(nbDeplacements);
    }
    /**
   	 * Le joueur deplace son pion selon le nombre qu'ont donnes les des
   	 * @param des un DesMonopoly qui represente le(s) des a lancer
   	 **/
    public void joue(DesMonopoly des){
    	if((this.getCasePion().getCasePosition() + des.lanceLesDes())>39){
    		deplacerPion(des.sommeDesDes());
    		this.recevoirArgent(200);
    	}
    	else
    	{
    		deplacerPion(des.sommeDesDes());
    	}
    	System.out.println(" le joueur "+ this.getNom() + " se trouve a " + this.getCasePion().getNom() + " et a " + this.getArgent());
    }
    /**
   	 * Le joueur deplace son pion a la case prison
   	 * @param position une CaseMonopoly qui represente la Case prison
   	 **/
    public void allerEnPrison(CaseMonopoly position){
    	this.getPion().setPosition(position);
    }
    /**
   	 * Le joueur abandonne le jeu
   	 **/
    public void abandonne(){
    	this.setAbandonner(true);
    }
    /**
   	 * Le joueur vends une propriete a lui qui est donc de type achetable
   	 * @param propriete une CaseMonopoly de type achetable qui peut donc etre vendue
   	 **/
    public void vendre(Achetable propriete){
    	propriete.estVendue();
    }
//////////////////////////////////Getters & Setters//////////////////////////////////
    /**
   	 * modifie le statut fallite du joueur du Monopoly
   	 * @param statut un boolean qui represente si le joueur est en fallite ou pas 
   	 **/
	public void setEstEnFallite(boolean statut){
		this.estEnFallite=statut;
	}
	/**
   	 * retourne si le joueur est en fallite ou pas 
   	 * @return estEnFallite un boolean qui est le statut du joueur
   	 **/
	public boolean getEstEnFallite(){
		return this.estEnFallite;
	}
    /**
   	 * modifie le nom du joueur du Monopoly
   	 * @param nom un String qui represente le nom du joueur
   	 **/
	public void setNom(String nom){
		this.nom=nom;
	}
	/**
   	 * modifie l'argent du joueur du Monopoly
   	 * @param argent un int qui represente l'argent du joueur
   	 **/
	public void setArgent(int argent){
		this.argent=argent;
    }
	/**
   	 * retourne l'argent que le joueur du Monopoly possede
   	 * @return argent un int qui est l'argent du joueur
   	 **/
	public int getArgent(){
		return this.argent;
	}
	/**
   	 * retourne le nom du joueur du Monopoly
   	 * @return nom un String qui est le nom du joueur
   	 **/
	public String getNom(){
		return this.nom;
	}
	/**
   	 * retourne le nombre de tours passes en prison par le joueur du Monopoly
   	 * @return toursEnPrison un int qui est le nombre de tours passes en prison
   	 **/
	public int getToursEnPrison(){
		return this.toursEnPrison;
	}
	/**
   	 * modifie le nombre de tours passes en prison par le joueur du Monopoly
   	 * @param tour un int qui est le nouveau nombre de tours passes en prison par le joueur
   	 **/
	public void setToursEnPrison(int tour){
		this.toursEnPrison=tour;
	}
	/**
   	 * modifie la situation du joueur
   	 * @param situation un boolean qui montre si le joueur est ou non en prison
   	 **/
	public void setEstEnPrison(boolean situation){
		this.estEnPrison=situation;
	}
	/**
   	 * retourne si le joueur est en prison ou pas
   	 * @return estEnPrison un boolean qui represente la situation du joueur
   	 **/
	public boolean getEstEnPrison(){
		return this.estEnPrison;
	}
	/**
   	 * modifie le pion du joueur
   	 * @param pion un PionMonopoly qui est le nouveau pion du joueur
   	 **/
	public void setPion( PionMonopoly pion){
		this.pion=pion;
	}
	/**
   	 * retourne le pion du joueur 
   	 * @return pion le pionMonopoly du joueur
   	 **/
	public PionMonopoly getPion(){
		return this.pion;
	}
	/**
   	 * modifie la situation du joueur 
   	 * @param situation un boolean qui represente si c'est le tour du joueur ou pas  
   	 **/
	public void setEstSonTour(boolean situation){
		this.estSonTour=situation;
	}
	/**
   	 * retourne sous forme de String le nom et l'argent possede par le joueur
   	 * @return un String
   	 **/
	public String toString(){
		return "le joueur s'appelle : "+ this.getNom() + "possede" + this.getArgent();
	}
	/**
   	 * retourne si le joueur peut joueur ou pas
   	 * @return estSonTour un boolean qui represente si c'est le tour du joueur ou pas
   	 **/
    public boolean getEstSonTour(){
        return this.estSonTour;
    }
    /**
   	 * modifie la situation du joueur si il a abandonne ou pas
   	 * @param situation un boolean qui represente si le joueur a abandonne ou non
   	 **/
    public void setAbandonner(boolean situation){
    	this.abandonne=situation;
    }
    /**
   	 * retourne si le joueur est en jeu ou il a abandonne
   	 * @return abandonne un boolean qui represente si le joueur a abandonne ou pas  
   	 **/
    public boolean getAbandonner(){
    	return this.abandonne;
    }
    /**
   	 * retourne si le joueur a perdu ou pas
   	 * @return aPerdu un boolean qui montre si le joueur a perdu ou non  
   	 **/
    public boolean getAPerdu(){
    	return this.aPerdu;
    }
    /**
   	 * modifie la situation du joueur dans le cas ou il ai perdu
   	 * @param situaion un boolean qui montre si le joueur a perdu ou non  
   	 **/
    public void setAPerdu(boolean situation){
    	this.aPerdu=situation;
    }
    public int getNumero(){
    	return this.numeroJoueur;
    }
    private void setNumero(int numeroJoueur){
    	this.numeroJoueur=numeroJoueur;
    }
    public void setCartePrison(CartePrison carte){
    	this.carte=carte;
    }
    public CartePrison getCartePrison(){
    	return this.carte;
    }

}
	


