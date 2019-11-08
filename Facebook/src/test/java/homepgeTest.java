import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class homepgeTest extends CommonAPI {
    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setPageFactory() {
        homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
    }

    @Test
    public void login() {
        homePagePOM.enterEmailAndPassword("balmulaiki26@gmail.com", "password5");
        clickOnElementByXpath("//input[@id='u_0_2']");
    }

    @Test
    public void validateForgotbutton(){
        homePagePOM.forgotAccount();
    }

}
