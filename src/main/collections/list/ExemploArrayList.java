package collections.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Demonstra usos básicos de {@link java.util.ArrayList}.
 * <p>
 * Mostra:
 * <ul>
 *     <li>Criação de uma lista simples de nomes;</li>
 *     <li>Ordenação em ordem ascendente com {@link java.util.Collections#sort(List)};</li>
 *     <li>Uma lista de números inteiros.</li>
 * </ul>
 */
public class ExemploArrayList {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
        exemploNumeros();
    }

    private static void exemploNumeros() {
        System.out.println("****** exemploNumeros ******");
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(3);
        System.out.println(numeros);
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = new ArrayList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}