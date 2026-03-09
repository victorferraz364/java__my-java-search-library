package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de como inverter a ordem dos elementos de uma {@link java.util.List}
 * utilizando {@link java.util.Collections#reverse(List)}.
 */
public class Reverse_ArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		
		Collections.reverse(nomes);
		System.out.println(nomes);
	}

}
