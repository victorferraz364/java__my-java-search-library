package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra como copiar o conteúdo de uma lista para outra utilizando
 * {@link java.util.Collections#copy(List, List)}.
 * <p>
 * A lista de destino deve ter tamanho maior ou igual ao tamanho da lista de origem.
 */
public class Copy_ArrayList {

	public static void main(String[] args) {
		List<String> letras = new ArrayList<String>();
		letras.add("v");
		letras.add("d");
		letras.add("r");
		letras.add("e");
		
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
	
		
		System.out.println(letras);
		System.out.println(nomes);
		
		Collections.copy(letras, nomes);
		System.out.println(letras);
		
		
	}

}
