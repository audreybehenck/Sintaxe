package sintaxe;

public class TestaCondicional {

	public static void main (String[] args) {
		
		System.out.println("Testando Condicional");
		
		int idade = 20;
		int quantidadePessoas = 1;
		
		if (idade >= 18) {
			System.out.println("Voc� � maior de idade!");
		} 
		else {
			System.out.println("Voc� � menor de idade.");
		}
		if (quantidadePessoas >= 2) {
			System.out.println("Parab�ns, voc� esta acompanhado.");
		}
		else
			System.out.println("Que pena, voc� esta sozinho.");
	}
}
