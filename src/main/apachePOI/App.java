package apachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class App {

	public static void main(String[] args) throws FileNotFoundException {
		
		 File path = new File("C:\\Users\\note\\Desktop\\logs.xlsx");
		 int rowIndex = 2;
		 try (InputStream excelFile1 = new FileInputStream(path);
	             Workbook workbook = new XSSFWorkbook(excelFile1)) {

	            // Obtém a primeira planilha do arquivo do Excel
	            Sheet sheet = workbook.getSheetAt(0);

	            Row row = sheet.getRow(rowIndex);
	            if (row != null) {
	                // Itera sobre as células da linha
	                for (Cell cell : row) {
	                    // Obtém o valor da célula e imprime no console
	                    System.out.print(cell.toString() + "\t");
	                }
	                // Quebra de linha após imprimir todas as células da linha
	                System.out.println();
	            } else {
	                System.out.println("A linha especificada não existe na planilha.");
	            }
	            
	            // Itera sobre as linhas da planilha
//	            for (Row row : sheet) {
//	                // Itera sobre as células de cada linha
//	                for (Cell cell : row) {
//	                    // Obtém o valor da célula e imprime no console
//	                    System.out.print(cell.toString() + "\t");
//	                }
//	                // Quebra de linha após cada linha da planilha
//	                System.out.println();
//	            }

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		 
	}

}
