package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de ordenação de uma lista de {@link String} utilizando
 * {@link java.util.Collections#sort(List)}.
 */
public class Sort_List {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("a");
		nomes.add("v");
		nomes.add("d");
		nomes.add("r");
		nomes.add("e");
		
		Collections.sort(nomes); // usar o static padrão para adicionar funções
		System.out.println(nomes);
	}

}
