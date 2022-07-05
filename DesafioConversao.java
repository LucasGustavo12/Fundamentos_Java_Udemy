package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		//Só isso é o suficiente
		//Entrada de dados
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o primeiro salário R$:  ");
		String sal1 = scanner.next().replace(",",".");
		
		
		System.out.println("Digite o segundo salário R$: ");
		String sal2 = scanner.next().replace(",",".");
		
		
		System.out.println("Digite o terceiro salário R$: ");
		String sal3 = scanner.next().replace(",",".");
		//armazenamento dos dados
		double salario1 = Double.parseDouble(sal1);
		double salario2 = Double.parseDouble(sal2);
		double salario3 = Double.parseDouble(sal3);
		
		double med = (salario1 + salario2 + salario3) / 3;
		
		
		//saida dos dados
		System.out.println("A média de salário é: " + med);
		
		
		scanner.close();
	}
}
