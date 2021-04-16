package class36;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class Temp {
    public static void main(String[] args) throws IOException {

        String path="Book3.xlsx";
        System.out.println(path);
        FileOutputStream fileOutputStream=new FileOutputStream(path);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
        XSSFSheet sheet= xssfWorkbook.createSheet("MySheet2");
        XSSFRow row = sheet.createRow(0);
        XSSFCell cell = row.createCell(0);
        cell.setCellValue("myCreation");
        xssfWorkbook.write(fileOutputStream);

    }
}

