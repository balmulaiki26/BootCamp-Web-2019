import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class HomePagePOM  {

        @FindBy(id = "email")
        public static WebElement emailField;

        @FindBy(id = "pass")
        public static WebElement passwordField;

        public void enterEmailAndPassword(String email, String password) {
            emailField.sendKeys(email);
            passwordField.sendKeys(password);
        }

        @FindBy(xpath = "//a[contains(text(),'Forgot account?')]")
    public static WebElement forgetbutton;

        public void forgotAccount(){
            forgetbutton.click();
        }

    }

