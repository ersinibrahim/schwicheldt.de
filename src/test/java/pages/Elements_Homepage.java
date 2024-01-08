package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;


import java.util.List;

public class Elements_Homepage extends ReusableMethods {

    // Constructor to initialize elements
    public Elements_Homepage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Elements with FindBy annotations
    @FindBy(xpath = "//div[@id='navbarScroll']/ul/li")
    private List<WebElement> homePage_Elements;

    @FindBy(css = "ul[class*='dropdown-menu bg-warning']")
    private List<WebElement> elements_HomePage_dropDownsMenus;

    @FindBy(css = "span[class*='carousel-control-next-icon']")
    private WebElement carouselControlNextIcon_HomePage;

    @FindBy(css = "span[class*='carousel-control-prev-icon']")
    private WebElement carouselControlPrevIcon_HomePage;

    // Getter methods for accessing elements
    public List<WebElement> getHomePage_Elements() {
        return homePage_Elements;
    }

    public List<WebElement> getElements_HomePage_dropDownsMenus() {
        return elements_HomePage_dropDownsMenus;
    }

    public WebElement getCarouselControlNextIcon_HomePage() {
        return carouselControlNextIcon_HomePage;
    }

    public WebElement getCarouselControlPrevIcon_HomePage() {
        return carouselControlPrevIcon_HomePage;
    }
}
