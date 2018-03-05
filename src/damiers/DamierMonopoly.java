package damiers;
import Cases.Case;
import Cases.CasesMonopoly.AllezEnPrison;
import Cases.CasesMonopoly.CaisseCommunaute;
import Cases.CasesMonopoly.CaseDepart;
import Cases.CasesMonopoly.CaseMonopoly;
import Cases.CasesMonopoly.Chance;
import Cases.CasesMonopoly.Gare;
import Cases.CasesMonopoly.Impot;
import Cases.CasesMonopoly.ParcGratuit;
import Cases.CasesMonopoly.Prison;
import Cases.CasesMonopoly.ServicesPubliques;
import Cases.CasesMonopoly.TerrainMonopoly;
import javafx.scene.paint.Color;
import jeu.Jeu;
import jeu.JeuMonopoly;

/**
 * Cette classe represente un Damier du Monopoly ( le damier est un tableau de 40 cases )
 * @author Giovanni Amin Raziq
 * @version 1.0
 **/
public class DamierMonopoly extends Damier {

	private CaseMonopoly cases[]=new CaseMonopoly[40];
	
/////////////////////////////////Constructeur///////////////////////
	/**
	 * Cree un Damier du Monopoly  
	 **/
	public DamierMonopoly(){
		
		//Initialisation des Cases du Monopoly
		cases[0]=new CaseDepart("Case Depart",0);
	
		cases[1]=new TerrainMonopoly("Boulevard de Belleville",60,2,50,1,"marron");
		cases[2]=new CaisseCommunaute("Caisse de CommunautÈ",2);
		cases[3]=new TerrainMonopoly("Rue Lecourbe",60,4,50,3,"marron");
		cases[4]=new Impot("Impot sur le Revenu",200,4);
		cases[5]=new Gare("Gare Montparnasse",200,25,5);
	
		cases[6]=new TerrainMonopoly("Rue De Vaugirard",100,6,50,6,"cyan");
		cases[7]=new Chance("Chance",7);
		cases[8]=new TerrainMonopoly("Rue De Courcelles",100,6,50,8,"cyan");
		cases[9]=new TerrainMonopoly("Avenue De La Republique",120,8,50,9,"cyan");
		cases[10]=new Prison("Prison",10);
	
		cases[11]=new TerrainMonopoly("Boulevard De La Villette",140,10,100,11,"violet");
		cases[12]=new ServicesPubliques("Compagnie Electricite",150,12);
		cases[13]=new TerrainMonopoly("Avenue De Neuilly",140,10,100,13,"violet");
		cases[14]=new TerrainMonopoly("Rue De Paradis",160,12,100,14,"violet");
		cases[15]=new Gare("Gare Lyon",200,25,15);
	
		cases[16]=new TerrainMonopoly("Avenue Mozart",180,14,100,1,"orange");
		cases[17]=new CaisseCommunaute("Caisse de Communaute",17);
		cases[18]=new TerrainMonopoly("Boulevard St-Michel",180,14,100,18,"orange");
		cases[19]=new TerrainMonopoly("Place Pigalle",200,16,100,19,"orange");
		cases[20]=new ParcGratuit("Parc Gratuit",20);	
	
		cases[21]=new TerrainMonopoly("Avenue Matignon",220,18,150,21,"rouge");
		cases[22]=new Chance("Chance",22);
		cases[23]=new TerrainMonopoly("Boulevard Malesherbes",220,18,150,23,"rouge");
		cases[24]=new TerrainMonopoly("Avenue Henri-Martin",240,20,150,24,"rouge");
		cases[25]=new Gare("Gare Nord",200,25,25);
	
		cases[26]=new TerrainMonopoly("Faubourg St-Honore",260,22,150,26,"jaune");
		cases[27]=new TerrainMonopoly("Place De La Bourse",260,22,150,27,"jaune");
		cases[28]=new ServicesPubliques("Compagnie des Eaux",150,28);
		cases[29]=new TerrainMonopoly("Rue La Fayette",280,24,150,29,"jaune");
		cases[30]=new AllezEnPrison("Allez en Prison",30);	
	
		cases[31]=new TerrainMonopoly("Avenue de Breteuil",300,26,200,31,"vert");
		cases[32]=new TerrainMonopoly("Avenue Foch",300,26,200,32,"vert");
		cases[33]=new CaisseCommunaute("Caisse de Communaute",33);
		cases[34]=new TerrainMonopoly("Boulevard Des Capucines",320,28,200,34,"vert");
		cases[35]=new Gare("Gare Saint Lazare",200,25,35);
		cases[36]=new Chance("Chance",36);
	
		cases[37]=new TerrainMonopoly("Avenue Champs-Elysees",350,35,200,37,"bleu");
		cases[38]=new Impot("Taxe De luxe",100,38);
		cases[39]=new TerrainMonopoly("La Paix",400,50,200,39,"bleu");
	}
/////////////////////////////////////Methodes/////////////////////////////////////////
	/**
	 *Retourne la case du Monopoly qui se trouve a la position Pos
	 *@param pos un int qui est la position de la case cherchee
	 **/
		public CaseMonopoly getCase(int pos)
	    {
           if (pos>39){
        	   return cases[pos-40];
        
        	   
           }
           else{
        	   return cases[pos];
           }
            
	    
	    }
///////////////////////////////////Getters////////////////////////////////////////////
		public CaseMonopoly[] getTCases(){
			return this.cases;
		}
	
	

}
