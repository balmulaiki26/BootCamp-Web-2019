import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends CommonAPI {
    HomePagePOM homePagePOM;

    @BeforeMethod
    public void setPageFactory() {
        homePagePOM = PageFactory.initElements(driver, HomePagePOM.class);
    }


    @Test
    public void SignIn() {
        homePagePOM.logIn();
    }

    @Test
    public void browseForItemsAndCheckout() {
        homePagePOM.searchText("Advil");
        homePagePOM.searchButton();
        clickOnElementByXpath("//span[contains(text(),'Advil Pain Reliever/Fever Reducer, 200mg Ibuprofen')]");
        clickOnElementByXpath("//input[@id='add-to-cart-button']");
        clickOnElementByXpath("//a[@id='hlb-ptc-btn-native']");
    }
}
