package ApachePOI;

import org.apache.poi.ss.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class _04_GetAllDataInRow {
    public static void main(String[] args) throws IOException {

        String path="src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
        FileInputStream InputStream=new FileInputStream(path);
        Workbook workbook= WorkbookFactory.create(InputStream);
        Sheet sheet= workbook.getSheet("Sheet1");

        Row row=sheet.getRow(1);
        for (int i=0; i<4; i++){
            System.out.println(row.getCell(i));


        }
        Row row1=sheet.getRow(3);
        Cell cell =row1.getCell(0);
        System.out.println(cell);
    }
}
