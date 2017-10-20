import java.util.Scanner;

public class Politness {

	public static void main(String[] args) {
		String dateBuilder[][]= {
				{"janvier","février","mars","Avril","Mai","Juin","Juillet","Aout","septembre","Octobre","Novembre","Décembre"},
				{"lundi","Mardi","Mercredi","Jeudi","Vendredi","Samedi","Dimanche"},
		};
		
		Scanner entry = new Scanner(System.in);
		int nbjour = Integer.parseInt(entry.nextLine());
		System.out.println("vous avez entré : " + nbjour);
		
		
		// calcule poid d'un mois
		
		
		// associer nbJour à mois
		// associer nbJour à jour
		
		final int M30 = 30;
		final int M31 = 31;
		
		int c30 = 1;
		int c31 = 1;
		
		
		
		if		(nbjour <= M31 * c31) 						System.out.println("le mois est " + dateBuilder[0][0]);
		else if (nbjour <= M31 * c31 + M30 * c30 - 1 ) 		System.out.println("le mois est " + dateBuilder[0][1]);
		else if (nbjour <= M31 * ++c31 + M30 * c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][2]);
		else if (nbjour <= M31 * c31 + M30 * ++c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][3]);
		else if (nbjour <= M31 * ++c31 + M30 * c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][4]);
		else if (nbjour <= M31 * c31 + M30 * ++c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][5]);
		else if (nbjour <= M31 * ++c31 + M30 * c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][6]);
		else if (nbjour <= M31 * c31 + M30 * ++c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][7]);
		else if (nbjour <= M31 * ++c31 + M30 * c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][8]);
		else if (nbjour <= M31 * c31 + M30 * ++c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][9]);
		else if (nbjour <= M31 * ++c31 + M30 * c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][10]);
		else if (nbjour <= M31 * c31 + M30 * ++c30 - 1 ) 	System.out.println("le mois est " + dateBuilder[0][11]);
		}
	}