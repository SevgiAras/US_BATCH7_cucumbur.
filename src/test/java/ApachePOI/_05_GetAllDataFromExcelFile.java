package ApachePOI;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class _05_GetAllDataFromExcelFile {
    public static void main(String[] args) throws IOException {
//        String[][] zoo = {{"Lion", "4", "Africa"}, {"Tiger", "2"}, {"Elephant", "5", "Africa"}, {"Shark", "3"}};
//        for (int i = 0; i < zoo.length; i++) {
//            for (int j = 0; j < zoo[i].length; j++) {
//                System.out.println(zoo[i][j]);
//            }
//        }

        String path = "src/test/java/ApachePOI/Resources/ApacheExcel2.xlsx";
        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Sheet1");
//
//        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { //sheet.getPhysicalNumberOfRows() works like length in arrays zoo.length
//            Row row =sheet.getRow(i);
//            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { //zoo[i].length
//                Cell cell = row(i).getCell(j);
//                System.out.print(cell+" ");
//            }
//            System.out.println();
//            System.out.println("++++++++++++++++++++");
//        }
        // }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) { //sheet.getPhysicalNumberOfRows() works like length in arrays zoo.length
            for (int j = 0; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) { //zoo[i].length
                Cell cell = sheet.getRow(i).getCell(j);
                System.out.print(cell + " ");
            }
            System.out.println();
            System.out.println("++++++++++++++++++++");
        }
    }
}
