import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchResults extends CommonAPI {
    SearchPOM searchPOM;

    @BeforeMethod
    public void setPageFactory() {
        searchPOM = PageFactory.initElements(driver, SearchPOM.class);
    }

    @Test
    public void validateSearchResult() {
        typeOnElementById("twotabsearchtextbox","Advil");
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
        searchPOM.isAdvilDisplayed();
    }
}
