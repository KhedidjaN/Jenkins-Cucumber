import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFileHandlingDemo2 {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\SARA\\IdeaProjects\\FirstIntellij\\class35\\src\\Test.xlsx ";
        FileInputStream fileInputStream=new FileInputStream(path);
        XSSFWorkbook workbook=new XSSFWorkbook(fileInputStream);
        Sheet sheet=workbook.getSheet("SecondPage");
        Row row=sheet.getRow(1);
        Cell cell=row.getCell(2); // accessing the cell by index
        System.out.println(cell); //
    }
}
