package fundamentos.controle;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		//Domingo -> 1
		//sabado -> 7
		//Sexta -> 6
		//Quinta -> 5
		//Quarta -> 4
		//Terça -> 3
		//Segunda -> 2
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um dia da semana de Segunda a Domingo: ");
		String dia = entrada.next();
		
		if(dia.equalsIgnoreCase("domingo")){
			System.out.println(1);
		}else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}else if(dia.equalsIgnoreCase("terça")) {
			System.out.println("3");
		}
		else if(dia.equalsIgnoreCase("quarta")){
			System.out.println("4");
		}else if(dia.equalsIgnoreCase("Quinta")) {
			System.out.println("5");
		}else if(dia.equalsIgnoreCase("sexta")){
			System.out.println("6");
		}
		else if(dia.equalsIgnoreCase("sabado")) {
			System.out.println("7");
			
		}else System.out.println("Digite um valor válido");
		
		entrada.close();
	}
	
	
}
