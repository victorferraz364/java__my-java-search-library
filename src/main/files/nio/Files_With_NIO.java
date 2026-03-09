package files.nio;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

/**
 * Demonstra conceitos básicos da API NIO:
 * <ul>
 *     <li>obtenção do {@link java.nio.file.FileSystem} padrão;</li>
 *     <li>criação de {@link java.nio.file.Path} absoluto;</li>
 *     <li>conversão entre NIO ({@link Path}) e a API antiga ({@link java.io.File}).</li>
 * </ul>
 */
public class Files_With_NIO {

	public static void main (String args[]) {
		
		
		FileSystem fs = FileSystems.getDefault(); // gerenciador do sistema
		Path arquivo1 = fs.getPath("C:\\Users\\note\\Desktop\\extrato.csv"); // classe caminho
		System.out.println(arquivo1);
		
		Path arquivoResumido = Path.of("C:\\Users\\note\\Desktop\\extrato.csv");// sem instanciar o file system
		
		Path nomearquivo = arquivo1.getFileName();
		System.out.println(nomearquivo);
		
		File arquivoIO = arquivo1.toFile(); // conversão para api antiga, inverso também funciona
		System.out.println(arquivoIO.getName());
		

	
	}
	
}
