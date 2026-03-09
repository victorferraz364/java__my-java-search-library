package files.nio.MetodosFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/**
 * Exemplo de cópia de arquivos com a API NIO usando
 * {@link java.nio.file.Files#copy(Path, Path, java.nio.file.CopyOption...)}.
 */
public class CopyAndMove {

	public static void main(String[] args) throws IOException {

        Path pasta = Path.of("C:\\Users\\note\\Desktop\\teste");
        Path pastaCopia = Path.of("C:\\Users\\note\\Desktop\\teste\\copy");
        Path arquivo = Path.of("nomes.txt");
        Path arquivoDestino = pastaCopia.resolve(arquivo);
        Path arquivoOrigem = pasta.resolve(arquivo);

   

        // Copiar arquivo com opção para substituir se já existir
        Files.copy(arquivoOrigem, arquivoDestino, StandardCopyOption.REPLACE_EXISTING);

    }
	
}
