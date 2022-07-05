package fundamentos.controle;

import java.util.Scanner;

public class While2 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite algo: ");
		String a = "";
		
		
		
		while(!a.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: " + a);
			a = entrada.nextLine();
		}
		
		entrada.close();
		
	}
}
