package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo de busca de um elemento em uma {@link java.util.List}
 * utilizando o método {@link java.util.List#contains(Object)}.
 */
public class Search_InListr {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");
		
		
		if (nomes.contains("victor")) {
			System.out.println("Contem o nome indicado");
		}
		else {
			System.out.println("Não existe retorno do nome indicado");
		}
		
		
		
	}

}
