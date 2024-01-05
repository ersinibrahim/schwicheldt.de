package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import pages.Elements_Homepage;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.ReusableMethods;


public class Elements_HomePage_StepDefinitions {

    Elements_Homepage elementsHomepage = new Elements_Homepage();


    @Given("Navigate to the website")
    public void navigate_to_the_website() {

        Driver.getDriver().get(ConfigurationReader.getProperty("toUrl"));



        ReusableMethods.waitForPageToLoad(10);

     for (WebElement obj : elementsHomepage.getHomePage_Elements()) {

      System.out.println("obj = " + obj.getText());
     }


    }

    @Then("Controlling clickability the elements_homePage")
    public void controlling_clickability_the_elements_home_page() {
        elementsHomepage.listElementsIsclickableAndDropDownsIsVisible(elementsHomepage.getHomePage_Elements(), elementsHomepage.getElements_HomePage_dropDownsMenus());

    }

    @Then("Controlling the carousel icons")
    public void controlling_the_carousel_icons() {

       elementsHomepage.carouselIconIsClickable(elementsHomepage.getCarouselControlNextIcon_HomePage());
       elementsHomepage.carouselIconIsClickable(elementsHomepage.getCarouselControlPrevIcon_HomePage());
       Driver.closeDriver();

    }


}