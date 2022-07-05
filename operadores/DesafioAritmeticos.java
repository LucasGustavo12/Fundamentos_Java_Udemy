package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		
		/*
		int a = 2 + 3 - 10;
		int b = (int) Math.pow(a, 3); //elevar o numero
		System.out.println(b);
		*/
		
		
		// Parte 1
		int a1 = 6*(3+2);
		int b1 = (int) Math.pow(a1, 2);
		int c1 = 3*2;
		int res1 = b1 / c1;
		
		System.out.println(res1);
		
		
		
		// Parte 2
		int a2 = (1-5) * (2-7) / 2;
		int res2 = (int)Math.pow(a2, 2);
		System.out.println(res2);
		
		
		//Parte 3 
		int resultado = res1 - res2;
		int dez = 10;
		int dezEle = (int) Math.pow(dez, 3);
		int resultadoFinal = (int) Math.pow(resultado, 3) / dezEle;
		
		
		//Parte 4
		System.out.println("O resultado final é: " + resultadoFinal);
		
		
		
		
		
	}
}
