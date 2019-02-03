package MainConversion;

import java.util.Scanner;

public class Conversion {
	
	private int option;
	private int[] toConvert ;
	private static void out(String chaine)
	{
		System.out.print(chaine + "\n");
		System.out.println("Un changement mon négro");
	}

	private static String transform(int decimal,int base)
	{
		
		int reste = 0;
		String rep = " ";
	

		while(decimal > base - 1)
		{
			reste = decimal % base;
			decimal = decimal / base;
			
			if(reste >= 10)
				rep = rep + toHex(reste);
			
			else				
				rep = rep + reste;
		}

		if(decimal != 0)
		{
			if(decimal >= 10)
				rep = rep + toHex(decimal);
			else
				rep = rep + decimal;
		}

			

		/**************** inversion de la valeur ****************/

		int longueur = rep.length();
		int i;
		String inv = "";
		
		for(i = 0; i< longueur; i++)
		{
			inv = inv + rep.charAt(longueur - 1 - i);
		}
		
		return inv;
	}

	private static char toHex(int decimal)
	{
		switch(decimal)
		{
		case 10: return 'A';
		case 11: return 'B';
		case 12: return 'C';
		case 13: return 'D';
		case 14: return 'E';
		case 15: return 'F';
		default: return 'X';
		}
	}

	public String[] Result()
	{
		int size = toConvert.length,i;
		String [] toReturn = new String [size];
		for(i = 0; i < size; i++)
		{
			if(option == 1)
				toReturn[i] = transform(toConvert[i],2); 
			else
				toReturn[i] = transform(toConvert[i],16);
		}
		
		return toReturn;
	}
	
	public Conversion(int[] tab)
	{
		toConvert = tab;
	}
	
	public void displayWelcome()
	{
		Scanner sc = new Scanner(System.in);
		out("Programme de conversion de base");
		out("\n1: Décimal -> binaire");
		out("\n2: Décimal -> hexadécimal");
		option = sc.nextInt();
		
		while(option != 1 && option != 2)
		{
			out("Option inexistante! Veuillez en choisir une correcte : ");
			option = sc.nextInt();
		}
		
		sc.close();
	}
	
}
