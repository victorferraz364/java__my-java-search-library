package files.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Demonstra leitura de bytes de um arquivo utilizando
 * {@link java.io.FileInputStream} e conversão para caracteres.
 */
public class InputStream {

	public static void main(String[] args) throws IOException {
		
		File arquivo = new File("C:\\Users\\note\\Desktop\\links.txt");
		FileInputStream input = null;
		
		try {
			input = new FileInputStream(arquivo);
			System.out.println(input.read());
			int cont;
			while ((cont = input.read()) != -1) {
				System.out.print((char)cont);
			}
			} 
		catch (FileNotFoundException e) {
			System.out.println("arquivo não encontrado " +  e.getMessage());
		}
		

	}

}
