package exceptions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Exemplo simples de uso da API {@code java.nio.file.Files} para criação de
 * arquivos, com tratamento de {@link java.io.IOException}.
 */
public class App {

	public static void main (String[] args) {
		
		Path arquivo1 = Path.of("C:\\Users\\note\\Desktop\\teste.txt");
	
		try {
			Files.createFile(arquivo1);
		} catch (IOException e) {
			System.out.println("Erro ao criar arquivo: " + e.getMessage());
		}
	}
	
}
