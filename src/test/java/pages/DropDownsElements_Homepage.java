package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class DropDownsElements_Homepage extends ReusableMethods {

    public DropDownsElements_Homepage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "li[class='dropdown-item']")
    private List<WebElement> homePage_DropDownsElements;










    public List<WebElement> getHomePage_DropDownsElements() {
        return homePage_DropDownsElements;
    }
}
