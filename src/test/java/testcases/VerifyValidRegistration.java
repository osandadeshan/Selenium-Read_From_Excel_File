package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import pagefactory.RegisterPage;

/**
 * Created by Osanda on 10/5/2016.
 */

public class VerifyValidRegistration {
    WebDriver driver;
    String ROOT = System.getProperty("user.dir");

    @Test
    public void checkValidRegistraion(){

        System.setProperty("webdriver.chrome.driver", ROOT + "\\src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("http://newtours.demoaut.com/mercuryregister.php");

        RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);

        registerPage.register("FirstName3","LastName3","715522089","osanda.deshan3@gmail.com","Address31","Address32","City3","State3","80301","ALGERIA","UserName3","Password3","Password3");
    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
