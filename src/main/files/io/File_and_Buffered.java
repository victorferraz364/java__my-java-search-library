package files.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Exemplo de leitura de arquivo texto linha a linha utilizando
 * {@link java.io.FileReader} combinado com {@link java.io.BufferedReader}
 * em um bloco try-with-resources.
 */
public class File_and_Buffered {

	public static void main(String[] args) {
		
		File arquivo = new File("C:\\Users\\note\\Desktop\\links.txt");
	

	        try (FileReader fileReader = new FileReader(arquivo);
	             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

	            String line;
	            // Lê cada linha do arquivo e imprime no console
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	}

}
