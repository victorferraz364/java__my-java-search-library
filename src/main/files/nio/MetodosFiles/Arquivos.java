package files.nio.MetodosFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Demonstra o uso de {@link java.nio.file.Files} para criação de diretórios
 * e arquivos por meio de objetos {@link java.nio.file.Path}.
 */
public class Arquivos {

	public static void main (String[] args) throws IOException {
		
		Path arquivo1 = Path.of("Desktop\\");
		
		//caminho e pastas.
		Path caminho = Path.of("C:\\Users\\note\\Desktop\\teste"); 
		
		//Criar as pastas informadas no caminho informado a cima.
	//	Files.createDirectory(caminho); //directory cria apena uma.
		 
		
		Path arquvioNomes = caminho.resolve(Path.of("testeNomes.txt"));
		Files.createFile(arquvioNomes);
		
	}
	
}
