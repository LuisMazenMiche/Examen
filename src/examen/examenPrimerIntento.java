package examen;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class examenPrimerIntento {
	
	private static String[] columns = {"Brand", "Model", "Color"};
    private static List<Carro>carros=  new ArrayList<>();
    private static String fileName="miExcelConPOI.xlsx";
    
    static {
        carros.add(new Carro("Seat","Ibiza","azul"));
        carros.add(new Carro("Volkswagen","Beatle","rojo con manchitas negras"));
        carros.add(new Carro("Nissan","Sentra","blanco"));
        carros.add(new Carro("Toyota","Corolla","verde"));
    }
    
	public static void main(String[] args) throws IOException, InvalidFormatException,NullPointerException{
		System.out.println("Crear un nuevo archivo de Excel y escribirle la lista de carros");
		escribirEnNuevoExcel(fileName);

	 }
	
	
	
	public static void escribirEnNuevoExcel(String excel) throws FileNotFoundException,IOException, InvalidFormatException
	{
		 // Create a Workbook
        Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

        // Create a Sheet
      Sheet sheet = workbook.createSheet("Lista de Carros");

        // Create a Font for styling header cells
        Font headerFont = workbook.createFont();
        headerFont.setBold(true);
        headerFont.setFontHeightInPoints((short) 14);
        headerFont.setColor(IndexedColors.RED.getIndex());

        // Create a CellStyle with the font
        CellStyle headerCellStyle = workbook.createCellStyle();
        headerCellStyle.setFont(headerFont);

        // Create a Row
        Row headerRow = sheet.createRow(0);

        // Create cells
        for(int i = 0; i < columns.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(columns[i]);
            cell.setCellStyle(headerCellStyle);
            System.out.println(cell.getStringCellValue());
        }

       
        // Create Other rows and cells with cars data
        int rowNum = 1;
        for(Carro carro: carros) {
            Row row = sheet.createRow(rowNum++);

            row.createCell(0)
                    .setCellValue(carro.getMarca());

            row.createCell(1)
                    .setCellValue(carro.getModelo());
            
            row.createCell(2)
            .setCellValue(carro.getColor());
 
        }

		// Resize all columns to fit the content size
        for(int i = 0; i < columns.length; i++) {
            sheet.autoSizeColumn(i);
        }

        // Write the output to a file
        FileOutputStream fileOut;
			fileOut = new FileOutputStream(System.getProperty("user.home") + "/Desktop/"+excel);
		
        workbook.write(fileOut);
        fileOut.close();

        // Closing the workbook
        workbook.close();
		
	}
}
