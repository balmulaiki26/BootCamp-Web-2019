import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;


public class HomePagePOM extends CommonAPI {
    @FindBy(xpath = "//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]")
    public static WebElement accountButton;

    @FindBy(xpath = "//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][contains(text(),'Sign in')]")
    public static WebElement logInButton;

    @FindBy(id = "twotabsearchtextbox")
    public static WebElement searchbox;

    @FindBy(xpath = "//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']")
    public static WebElement searchbutton;

    @FindBy(xpath = "//span[@class='icp-nav-link-inner']")
    public static WebElement languagebutton;

    @FindBy(xpath = "//div[@id='nav-flyout-icp']//span[@class='nav-text'][contains(text(),'Español - ES')]")
    public static WebElement esponalbutton;


    public void testDropDown(){
        WebElement element = getElement("//select[@id='searchDropdownBox']");
        Select select = new Select(element);
        select.selectByIndex(3);
        sleepFor(5);
        clickOnElementByXpath("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
    }


    public void menuButton(){
        clickOnElementByXpath("//i[contains(@class,'hm-icon nav-sprite')]");
        clickOnElementByXpath("//ul[contains(@class,'hmenu-visible')]//li[3]//a[1]");
        clickOnElementByXpath("//ul[contains(@class,'hmenu hmenu-visible hmenu-translateX')]//li[3]//a[1]");
    }


    public void logIn() {
        accountButton.click();
        logInButton.click();
    }

    public void clickLanguage(){
        languagebutton.click();
        esponalbutton.click();
    }


    public void searchText(String text){
        searchbox.sendKeys(text);
    }
    public void searchButton(){
        searchbutton.click();
    }



}
