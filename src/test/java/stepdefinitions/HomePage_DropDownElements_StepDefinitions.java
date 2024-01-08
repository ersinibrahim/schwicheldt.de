package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.DropDownsElements_Homepage;
import pages.Elements_Homepage;

public class HomePage_DropDownElements_StepDefinitions {

    DropDownsElements_Homepage dropDownsElements_homepage= new DropDownsElements_Homepage();
    Elements_Homepage elements_homepage = new Elements_Homepage();

    @Given("Controlling the DropDown Elements Clickablity")
    public void controllingTheDropDownElementsClickablity() {

        dropDownsElements_homepage.elementsIsClickable(dropDownsElements_homepage.getHomePage_DropDownsElements(),elements_homepage.getHomePage_Elements());



    }
}
