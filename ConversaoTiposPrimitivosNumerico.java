package fundamentos;

public class ConversaoTiposPrimitivosNumerico {
	public static void main(String[] args) {
		
		
		double a = 1; //conversao implicita (não há perca de dados)
		System.out.println(a);
		
		float b = (float) 1.123456788; //conversao explícita (CAST) (pode ocorrer perca de dados)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explícita (CAST)
		System.out.println(d);
		
		
		double e = 1.999999;
		int f = (int) e; //explícita (CAST)
		System.out.println(f);
	}
}
