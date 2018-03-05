package Des;
/**
 * Cette classe est un classe qui represente les Des du Monopoly
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class DesMonopoly extends Des {
	
	private int de1;
	private int de2;
	
//////////////////////////////////////////////Constructeur//////////////////////////////////////
	/**
	 * Cree un les Des du monopoly 
	 **/
	public DesMonopoly(){
		super();
	}
	
/////////////////////////////////////////////Getters & Setters//////////////////////////////////
	/**
	 * retourne le nombre sorti par le premier de qui a ete lance
	 * @return de1 un int qui represente le chiffre sorti
	 **/
	public int getDe1(){
		return this.de1;
	}
	/**
	 * retourne le nombre sorti par le deuxieme de qui a ete lance
	 * @return de2 un int qui represente le chiffre sorti
	 **/
	public int getDe2(){
		return this.de2;
	}
	/**
	 * modifie le nombre sorti par le premier de qui a ete lance
	 * @param i un int qui represente le nouveau chiffre du de
	 **/
    public void setDe1(int i){
                this.de1=i;
    }
    /**
	 * modifie le nombre sorti par le deuxieme de qui a ete lance
	 * @param i un int qui represente le nouveau chiffre du de
	 **/
    public void setDe2(int i){
                this.de2=i;
    }
/////////////////////////////////////////////Methodes////////////////////////////////////////////
    /**
	 * modifie le nombre sorti par le premier et le deuxieme avec un chiffre aleatoir entre 1 et 6 et retourne la somme des 2
	 * @return SommeDesDes() un int qui est la somme des des
	 **/
public int lanceLesDes() {
		
	  	setDe1(( int )( Math.random() * 6 + 1 ));
		setDe2(( int )( Math.random() * 6 + 1 ));
                return sommeDesDes();
	 }
/**
 * Calcule la somme des 2 des et la retourne 
 * @return getDe1() + getDe2() un int qui represente la somme des 2 des
 **/
public int sommeDesDes(){
	return getDe1()+getDe2();
}

}
