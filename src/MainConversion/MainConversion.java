package MainConversion;

import java.util.Scanner;

public class MainConversion {

	private static void out(String chaine)
	{
		System.out.print(chaine + "\n");
	}
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		out("Combien de nombre à traduire monsieur?");
		int size = sc.nextInt(),i;
		int [] number = new int[size];
		
		for(i = 0; i< size; i++)
		{
			int pos = i+1;
			out("Nombre " + pos +":");
			number[i] = sc.nextInt();
		}
		
		out("...Encodage terminé!");
		
		Conversion C = new Conversion(number);
		
		C.displayWelcome();
		String []resultString = C.Result();
		
		for(i = 0; i< size; i++)
		{
			int pos = i+1;
			out("resultat "+ pos + ": " + number[i] + " =>  "+resultString[i]);
		}
		
		sc.close();
		
	}
}
