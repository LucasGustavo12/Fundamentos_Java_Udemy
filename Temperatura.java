package fundamentos;

public class Temperatura {
	
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		double a = 32;
		double b = 5/9.0; //não esquecer dos Inteiros;
		
		double f = 86;
		
		double celsius = (f-a) *(b);
		
		System.out.println("O resultado em Celsius é: "+ celsius + " Graus");
		
	}
}
