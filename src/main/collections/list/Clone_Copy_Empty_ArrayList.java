package collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Demonstra operações comuns em {@link java.util.ArrayList}:
 * <ul>
 *     <li>criação de uma lista a partir de outra (cópia superficial);</li>
 *     <li>remoção de todos os elementos com {@link java.util.List#removeAll(java.util.Collection)};</li>
 *     <li>verificação se a lista está vazia com {@link java.util.List#isEmpty()}.</li>
 * </ul>
 */
public class Clone_Copy_Empty_ArrayList {

	public static void main(String[] args) {
		List<String> cores = new ArrayList<String>(Arrays.asList("azul", "vermelho"));
		List<String> nomes = new ArrayList<String> (cores);

		
		
		System.out.println(nomes + "" + nomes.isEmpty());
		
		nomes.removeAll(cores); // remover tudo
		nomes.isEmpty();
		
		System.out.println(nomes + "" + nomes.isEmpty());
		
	}

}
