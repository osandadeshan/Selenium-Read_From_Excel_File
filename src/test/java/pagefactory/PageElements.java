package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by Osanda on 10/5/2016.
 */
 public class PageElements {

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstName;

    @FindBy(how= How.XPATH,using="//input[@name='lastName']")
    WebElement lastName;

    @FindBy(how= How.XPATH,using="//input[@name='phone']")
    WebElement phone;

    @FindBy(how= How.XPATH,using="//input[@name='userName']")
    WebElement userName;

    @FindBy(how= How.XPATH,using="//input[@name='address1']")
    WebElement address1;

    @FindBy(how= How.XPATH,using="//input[@name='address2']")
    WebElement address2;

    @FindBy(how= How.XPATH,using="//input[@name='city']")
    WebElement city;

    @FindBy(how= How.XPATH,using="//input[@name='state']")
    WebElement state;

    @FindBy(how= How.XPATH,using="//input[@name='postalCode']")
    WebElement postalCode;

    @FindBy(how=How.XPATH, using="//select[@name='country']")
    WebElement country;

    @FindBy(how= How.XPATH,using="//input[@name='email']")
    WebElement email;

    @FindBy(how= How.XPATH,using="//input[@name='password']")
    WebElement password;

    @FindBy(how= How.XPATH,using="//input[@name='confirmPassword']")
    WebElement confirmPassword;

    @FindBy(how=How.XPATH,using="//input[@name='register']")
    WebElement register;

    public void selectCountry(String name){
        Select dropdown=new Select(country);
        dropdown.selectByVisibleText(name);
        country.sendKeys(name);
    }
}
