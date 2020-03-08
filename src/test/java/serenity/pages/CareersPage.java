package serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.worldremit.com/en/careers")
public class CareersPage extends PageObject {

    @FindBy(id = "see-all-our-roles")
    private WebElementFacade seeAllOurRolesButton;

    @FindBy(id = "our-opportunities")
    private WebElementFacade ourOpportunitiesSection;

    @FindBy(id = "mui-component-select-department-selector")
    private WebElementFacade departmentsSelectBox;

    @FindBy(xpath = "//li[text()='Engineering & IT']")
    private WebElementFacade engineeringAndItDepartment;

    @FindBy(id = "mui-component-select-office-selector")
    private WebElementFacade officesSelectBox;

    @FindBy(xpath = "//li[text()='Krakow, Poland']")
    private WebElementFacade krakowOffice;

    @FindBy(xpath = "//a[@href='/en/careers/krakw-qatest-engineer']")
    private WebElementFacade testEngineerLink;

    @FindBy(name = "first_name")
    private WebElementFacade firstNameInputField;

    @FindBy(name = "last_name")
    private WebElementFacade lastNameInputField;

    @FindBy(name = "email")
    private WebElementFacade emailInputField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElementFacade submitButton;

    @FindBy(xpath = "//p[contains(text(),'This field is required.')]")
    private WebElementFacade validationMessage;

    public void clickSeeAllOurRolesButton() {
        seeAllOurRolesButton.waitUntilClickable().click();
    }

    public void clickOurOpportunitiesSection() {
        ourOpportunitiesSection.waitUntilClickable().click();
    }

    public void clickAllDepartmentsSelectBox() {
        departmentsSelectBox.waitUntilClickable().click();
    }

    public void selectEngineeringAndItDepartment() {
        engineeringAndItDepartment.waitUntilClickable().click();
    }

    public void clickAllOfficesSelectBox() {
        officesSelectBox.waitUntilClickable().click();
    }

    public void selectKrakowOffice() {
        krakowOffice.waitUntilClickable().click();
    }

    public void clickTestEngineerLink() {
        testEngineerLink.waitUntilClickable().click();
    }

    public void populateFirstNameInputField(String firstName) {
        firstNameInputField.type(firstName);
    }

    public void populateLastNameInputField(String lastName) {
        lastNameInputField.type(lastName);
    }

    public void populateEmailInputField(String email) {
        emailInputField.type(email);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isValidationMessageDisplayed() {
        return validationMessage.isDisplayed();
    }
}