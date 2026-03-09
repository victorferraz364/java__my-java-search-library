package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra remoção de elementos em uma {@link java.util.List}:
 * <ul>
 *     <li>inserção em posição específica com {@code add(indice, valor)};</li>
 *     <li>remoção por índice com {@code remove(indice)}.</li>
 * </ul>
 */
public class Remove_InList {

	public static void main(String[] args) {
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");
		
		nomes.add(0, "caralho"); // posição, valor

		System.out.println(nomes);
		
		nomes.remove(0);
		System.out.println(nomes);
	}

}
