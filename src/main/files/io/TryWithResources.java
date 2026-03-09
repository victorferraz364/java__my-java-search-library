package files.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Demonstra o uso de try-with-resources com {@link java.io.FileInputStream},
 * garantindo o fechamento automático do recurso mesmo em caso de exceção.
 */
public class TryWithResources {

	public static void main(String[] args) throws IOException {

		File arquivo = new File("C:\\Users\\note\\Desktop\\links.txt");


		try (FileInputStream input = new FileInputStream(arquivo)) {

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
