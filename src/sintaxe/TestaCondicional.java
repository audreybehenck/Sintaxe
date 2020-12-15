package sintaxe;

public class TestaCondicional {

	public static void main (String[] args) {
		
		System.out.println("Testando Condicional");
		
		int idade = 20;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Você é maior de idade!");
		} 
		else {
			System.out.println("Você é menor de idade.");
		}
		if (quantidadePessoas >= 2) {
			System.out.println("Parabéns, você esta acompanhado.");
		}
		else
			System.out.println("Que pena, você esta sozinho.");
	}
}
