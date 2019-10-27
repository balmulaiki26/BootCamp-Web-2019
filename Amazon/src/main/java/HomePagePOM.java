import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePagePOM extends CommonAPI {
    @FindBy(xpath = "//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")
    public static WebElement accountButton;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    public static WebElement logInButton;

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement searchbox;

    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    public static WebElement searchbutton;

    public void logIn() {
        accountButton.click();
        logInButton.click();
    }

    public void searchText(String text){
        searchbox.sendKeys(text);
    }
    public void searchButton(){
        searchbutton.click();
    }



}
