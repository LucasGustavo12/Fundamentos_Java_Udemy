package fundamentos.controle;

public class SwichSemBreak {
	public static void main(String[] args) {
		
		String faixa = "Amarela";
		
		switch(faixa.toLowerCase()) {
		
		
		case "preta": 
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("sei o tekki shodan");
		case "roxa":
			System.out.println("Sei o heian Godan");
		case "verde":
			System.out.println("Sei o heian yodan");
		case "laranja":
			System.out.println("sei o heian sandan");
		case "vermelha":
			System.out.println("Sei o heian Nidan");
		case "amarela":
			System.out.println("sei o Heian shodan");
			break;
		default:
			System.out.println("Não sei");
		}
		
		System.out.println("Fim!");
		
	}
}
