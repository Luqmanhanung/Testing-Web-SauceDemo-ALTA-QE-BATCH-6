package starter.Pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@DefaultUrl("https://www.saucedemo.com/")
public class LoginPage extends PageObject {
    @Managed
    WebDriver driver = getDriver();

    private By usernameField = By.id("user-name");
    private By passwordField = By.id("password");
    private By loginButtonField = By.id("login-button");

    public void inputUsername(String username){
        driver.findElement(usernameField).sendKeys(username);
    }

    public void inputPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public void clickLoginButton(){
        driver.findElement(loginButtonField).click();
    }
}
