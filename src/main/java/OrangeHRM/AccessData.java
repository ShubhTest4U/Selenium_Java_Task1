package OrangeHRM;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class AccessData {

    @DataProvider(name = "loginData")
    public Object[][] Send_Data() throws BiffException, IOException {
        String file = "C:\\Users\\shubham.kori\\eclipse-workspace\\Selenium_Java_Task\\src\\main\\java\\OrangeHRM\\OrangeHRM-Sheet.xls";
        File f = new File(file);
        
        Workbook wk = Workbook.getWorkbook(f);
        Sheet s = wk.getSheet("Login_Data");
        int row = s.getRows();
        
        // Only take username and password columns
        Object[][] final_Data = new Object[row-1][2];
        
        // Skip header row (i starts from 1)
        for(int i=1; i<row; i++) {
            Cell usernameCell = s.getCell(0,i);
            Cell passwordCell = s.getCell(1,i);
            final_Data[i-1][0] = usernameCell.getContents();
            final_Data[i-1][1] = passwordCell.getContents();
        }
        return final_Data;
    }
    
    @Test(dataProvider = "loginData")
    public void Get_Data(String username, String password) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
        
        driver.quit();
    }
}