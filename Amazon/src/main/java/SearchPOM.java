import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import report.TestLogger;

public class SearchPOM extends CommonAPI {
    @FindBy(xpath = "//span[contains(text(),'Advil Pain Reliever/Fever Reducer, 200mg Ibuprofen')]")
    public static WebElement AdvilSearchResults;

    public void isAdvilDisplayed() {
        Assert.assertEquals(AdvilSearchResults.isDisplayed(), true, "Advil is not displayed");
        TestLogger.log("Advil displayed status: " + AdvilSearchResults.isDisplayed());
    }
}
