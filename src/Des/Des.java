package Des;
/**
 * Cette classe est un classe qui represente des des quelquonques
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class Des {
	private int de1;
	private int de2;
/////////////////////////////////////////Constructeur////////////////////////////////////
	/**
	 * Cree des des  
	 **/
	public Des(){
		this.setDe1(0);
		this.setDe2(0);	}
////////////////////////////////////////Methodes////////////////////////////////////////
	public abstract int lanceLesDes();
////////////////////////////////////////Getters & Setters////////////////////////////////
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
}
