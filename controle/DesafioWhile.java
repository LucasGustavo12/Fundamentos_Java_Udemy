package fundamentos.controle;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		//Digite nota de 10 a 0
		//Notas validas
		//-1 Sai
		
//		Scanner entrada = new Scanner(System.in);
//		System.out.println("Digite uma nota: ");
//		int nota = entrada.nextInt();
//		int contador = 0;
//		if(nota > 10 || nota < 1) {
//			System.out.println("Digite uma nota válida");
//		}else {
//		}
//		
//		while(nota != -1) {
//			
//			nota += nota;
//			System.out.println(nota);
//			
//			contador += contador;
//		}
//		
//		
//		
//		
//		
//		entrada.close();
		
		Scanner entrada = new Scanner(System.in);
		int quantidadeDeNotas = 0;
		double nota = 0;
		double total = 0;
		
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >=0 ) {
				total += nota;
				quantidadeDeNotas++;
				
			}
			
			
			
		}
		
		//calcula media
		
		double media = total / quantidadeDeNotas;
		System.out.println("Média = " + media);
		

		entrada.close();
	}
}
