package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Exemplo de embaralhamento da ordem dos elementos de uma lista
 * usando {@link java.util.Collections#shuffle(List)}.
 */
public class Shuffle_ArrayList {

	public static void main(String[] args) {
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		
		Collections.shuffle(nomes);
		System.out.println(nomes);
	
	}

}
