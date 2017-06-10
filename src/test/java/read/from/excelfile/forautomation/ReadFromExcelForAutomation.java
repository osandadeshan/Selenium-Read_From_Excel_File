package read.from.excelfile.forautomation;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import lib.ExcelDataConfig;

/**
 * Created by Osanda on 10/4/2016.
 */

public class ReadFromExcelForAutomation {
    WebDriver driver;
    String ROOT = System.getProperty("user.dir");

    @Test
    public void newToursRegister() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", ROOT + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://newtours.demoaut.com/mercuryregister.php");

        ExcelDataConfig excel=new ExcelDataConfig(ROOT + "\\TestData.xlsx");
            int dataRow = 1;
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(excel.getData(0,dataRow,0));
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(excel.getData(0,dataRow,1));
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(String.valueOf(excel.getData(0,dataRow,2)));
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(excel.getData(0,dataRow,3));
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(excel.getData(0,dataRow,4));
        driver.findElement(By.xpath("//input[@name='address2']")).sendKeys(excel.getData(0,dataRow,5));
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(excel.getData(0,dataRow,6));
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(excel.getData(0,dataRow,7));
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(excel.getData(0,dataRow,8));
        // driver.findElement(By.xpath("//select[@name='country']/option[text() = 'ALGERIA ']"));
        Select select = new Select(driver.findElement(By.xpath("//select[@name='country']")));
        select.selectByVisibleText("ALGERIA");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(excel.getData(0,dataRow,10));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(excel.getData(0,dataRow,11));
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(excel.getData(0,dataRow,12));
        driver.findElement(By.xpath("//input[@name='register']")).click();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

}
