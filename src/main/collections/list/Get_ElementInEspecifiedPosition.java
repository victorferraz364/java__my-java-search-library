package collections.list;

import java.util.ArrayList;
import java.util.List;

/**
 * Demonstra como recuperar um elemento em uma posição específica da lista
 * utilizando o método {@link java.util.List#get(int)}.
 */
public class Get_ElementInEspecifiedPosition {

	public static void main(String[] args) {
		
		
		List<String> nomes = new ArrayList<String>();
		nomes.add("victor");
		nomes.add("angelo");
		nomes.add("ferraz");
		nomes.add("de");
		nomes.add("oliveira");

		System.out.println("my first name is " + nomes.get(0) );
	}

}
