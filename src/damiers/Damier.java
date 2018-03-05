package damiers;
import Cases.Case;
/**
 * Cette classe est une classe abstraite et represente un Damier quelconque
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public abstract class Damier {

	Case cases[];
	
public Damier(){};


public abstract Case getCase(int Pos);

}
