package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _07_WriteIntoExistingExcelFile {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "src/test/java/ApachePOI/Resources/Book1.xlsx";
        Sheet sheet;
        Workbook workbook;
        FileInputStream inputStream;
        try {
            inputStream = new FileInputStream(path);
            workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheet("Sheet1");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // We made changes in the memory not in the file
        Row row = sheet.createRow(0); // created a new row
        Cell cell = row.createCell(0); // created a new cell
        cell.setCellValue("Hello World!"); // typed the value in the cell

        for (int i=1; i<10; i++){
            row.createCell(i).setCellValue(i);


        }

        FileOutputStream outputStream;
        try {
            inputStream.close();
            outputStream = new FileOutputStream(path);
            workbook.write(outputStream);
            workbook.close();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
