
public class Teste {

	public static void main(String[] args) {
		
		
		int[] vetor = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		SomadorAdapter somador = new SomadorAdapter();
		int soma = somador.somaVetor(vetor);
		System.out.println("Soma: " + soma);
	}
}