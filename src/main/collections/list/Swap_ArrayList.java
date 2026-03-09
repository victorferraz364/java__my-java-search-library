package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra a troca de posições de elementos em uma lista
 * utilizando {@link java.util.Collections#swap(List, int, int)}.
 */
public class Swap_ArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<>();
		cores.add("azul");
		cores.add("verde");
		cores.add("amarelo");
		cores.add("cinza");
		
		Collections.swap(cores, 0, 1);
		System.out.println(cores);

	}

}
