package fundamentos.controle;

public class DesafioFor {
	public static void main(String[] args) {
		
		
		String valor = "#";
		
		for(int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versao do desafio
		// Não Pode usar valor númerico para controlar o laço
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);
		}
	}
}
