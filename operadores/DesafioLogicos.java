package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		
		//TV 50
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		boolean comprouSorvete = trabalho1 || trabalho2;
		
		//Operador Unário
		boolean maisSaudavel = !comprouSorvete;
		
		System.out.println("Comprou Tv 50\"? " + comprouTV50);
		System.out.println("Comprou Tv 32\"? " + comprouTV32);
		System.out.println("Comprou Tv 50\"? " + comprouSorvete);
		System.out.println("Mais saúdavel? " + maisSaudavel);
		
		
		
		
	}
}
