package Class8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;

public class HandlingStaticWebTables {
    public static String url = "http://syntaxtechs.com/selenium-practice/table-search-filter-demo.php";

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SARA\\Downloads\\selenium-java-3.141.59\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to(url);
        List<WebElement> rowData=driver.findElements(By.xpath("//table[@id= 'task-table']/tbody/tr"));
        System.out.println(rowData.size());
        Iterator<WebElement> it=rowData.iterator();
        while ((it.hasNext())){
            WebElement row=it.next();
            String rowText=row.getText();
            System.out.println(rowText);
        }
        System.out.println("----------------");
        List<WebElement> colsData=driver.findElements(By.xpath("//table[@id= 'task-table']/thead/tr/th"));
        System.out.println("number of cols "+ colsData.size());
        for (WebElement col: colsData){
            String colText= col.getText();
        }
    }
}