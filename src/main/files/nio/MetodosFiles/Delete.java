package files.nio.MetodosFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * Exemplo de exclusão de arquivos com a API NIO utilizando
 * {@link java.nio.file.Files#deleteIfExists(Path)}.
 */
public class Delete {

	public static void main (String[] args) throws IOException {

		Path arquivoExcluir = Path.of("C:\\Users\\note\\Desktop\\teste\\copy\\nomes.txt");
		Files.deleteIfExists(arquivoExcluir);
		
	}
	
}
