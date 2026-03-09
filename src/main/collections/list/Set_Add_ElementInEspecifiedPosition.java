package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra:
 * <ul>
 *     <li>inserção de elemento em uma posição específica com {@code add(indice, valor)};</li>
 *     <li>substituição de um elemento existente com {@link java.util.List#set(int, Object)}.</li>
 * </ul>
 */
public class Set_Add_ElementInEspecifiedPosition {

	public static void main(String[] args) {
	
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");
		
		nomes.add(0, "caralho"); // posição, valor

		System.out.println(nomes);
		
		nomes.set(5, "caralho de novo");
		System.out.println(nomes);
	}

}
