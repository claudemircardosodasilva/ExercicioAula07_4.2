import java.util.ArrayList;
import java.util.List;

public class SomadorAdapter extends SomadorExistente implements SomadorEsperado{
	List<Integer> lista;
	
	public SomadorAdapter() {
		this.lista = new ArrayList<Integer>();
	}
	
	@Override
	public int somaVetor(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			lista.add(vetor[i]);
		}
		
		return somaLista(lista);
	}
	
}
