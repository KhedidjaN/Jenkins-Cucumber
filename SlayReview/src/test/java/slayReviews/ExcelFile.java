package slayReviews;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelFile {
    static String path="C:\\Users\\SARA\\IdeaProjects\\SlayReview\\excel\\data.xlsx";


    public static void main(String[] args) throws IOException {


           FileInputStream fileInputStream=new FileInputStream(path);


                 XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);
                 XSSFSheet sheet = workbook.getSheet("Sheet1");
                int rowCount = sheet.getPhysicalNumberOfRows();
                System.out.println("No of row" + rowCount);


            }
        }


