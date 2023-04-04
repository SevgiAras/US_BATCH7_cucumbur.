package ApachePOI;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class _06_GetASpecificDAta {
    /*
     * Write the code that gives specific data the user wants
     * E.G. WHEN USER TYPES YSERNAME PRINT THE USERNAME FROM THE EXCEL FILE
     * */
    public static void main(String[] args) throws IOException {

        String path = "src/test/java/ApachePOI/Resources/LoginData (1).xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Login");

        System.out.println("What do you want to search?");
        Scanner input = new Scanner(System.in);
        String userResponse = input.nextLine();
        System.out.println(search(userResponse));

//        for (int i=0; i< sheet.getPhysicalNumberOfRows(); i++){
//            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(userResponse)){
//                for (int j=1; j<sheet.getRow(i).getPhysicalNumberOfCells(); j++){
//                    System.out.println(sheet.getRow(i).getCell(j));
//                };
//            }
        //}

    }

    public static String search(String searchKeyWord) throws IOException {
        String returnString = "";
        String path = "src/test/java/ApachePOI/Resources/LoginData (1).xlsx";

        FileInputStream inputStream = new FileInputStream(path);
        Workbook workbook = WorkbookFactory.create(inputStream);
        Sheet sheet = workbook.getSheet("Login");


        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {
            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(searchKeyWord)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    //  System.out.println(sheet.getRow(i).getCell(j));
                    returnString += sheet.getRow(i).getCell(j);
                }
                ;
            }
        }
        return returnString;
    }
}
