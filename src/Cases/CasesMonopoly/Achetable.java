package Cases.CasesMonopoly;

import joueurs.JoueurMonopoly;

public interface Achetable {
	
	public void estAcheterPar(JoueurMonopoly joueur);
	public void estVendue();
	public int getPrixAchat();
	
}
