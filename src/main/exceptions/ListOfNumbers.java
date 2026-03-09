package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Exemplo clássico da documentação da Sun/Oracle para tratamento de exceções
 * em operações de I/O.
 * <p>
 * Cria uma lista de inteiros e escreve o conteúdo em um arquivo de texto,
 * tratando adequadamente exceções de índice e de entrada/saída.
 */
public class ListOfNumbers {

	private List<Integer> list;
	/**
	 * Tamanho da lista que será criada.
	 * <p>
	 * No exemplo original este valor é inicializado fora da classe, mas aqui
	 * você pode atribuir um valor padrão para fins de demonstração.
	 */
	private Integer SIZE = 10;

	public ListOfNumbers () {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(i);
		}
	}


	/**
	 * Escreve os valores da lista em um arquivo texto, tratando possíveis
	 * exceções de índice inválido e de I/O.
	 */
	public void writeList() throws IOException {
		// O construtor FileWriter pode lançar IOException, que precisa ser tratado.
		PrintWriter out = null;
		FileWriter fw = null;

		try {
			fw = new FileWriter("OutFile.txt");
			out = new PrintWriter(fw);
			for (int i = 0; i < SIZE; i++) {
				// O método get(int) pode lançar IndexOutOfBoundsException.
				out.println("Value at: " + i + " = " + list.get(i));
			}
		}

		catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: "+ e.getMessage());
		} 

		catch (IOException e) {
			System.err.println("Caught IOException: "+ e.getMessage());
		}

		finally {

			if (out != null) { 
				System.out.println("Fechando PrintWriter");
				out.close(); 
			}
			if (fw != null) {
				System.out.println("Fechando FileWriter");
				fw.close();
			}
			else { 
				System.out.println("PrintWriter não foi aberto");
			} 
		}

	}
}
