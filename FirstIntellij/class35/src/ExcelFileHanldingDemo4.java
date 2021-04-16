import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHanldingDemo4 {
    public static void main(String[] args) throws IOException {

    String path = "C:\\Users\\SARA\\IdeaProjects\\FirstIntellij\\class35\\src\\Test.xlsx ";
    FileInputStream fileInputStream = new FileInputStream(path);// creating connection
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);// creating the object of XSSFWorkbook
    Sheet sheet = workbook.getSheet("FirstPage");// accessing the sheet
    for (int row=0; row<sheet.getPhysicalNumberOfRows(); row++) {
        Row rowData = sheet.getRow(row);
        for (int j = 0; j < rowData.getPhysicalNumberOfCells(); j++) {
            System.out.print(rowData.getCell(j) + " ");// getting the cells one by one using inner loop
        }
        System.out.println();
    }
        /*Cell cell = row.getCell(0); // accessing the cell by index
        String firstName = row.getCell(0).getStringCellValue();
        String lastName = row.getCell(1).getStringCellValue();
        double hobby = row.getCell(2).getNumericCellValue();
        int age=(int)row.getCell(3).getNumericCellValue();
        int age2=Integer.parseInt(row.getCell(3).getStringCellValue());
*/
    }







}
