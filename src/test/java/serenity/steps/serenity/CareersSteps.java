package serenity.steps.serenity;

import net.thucydides.core.annotations.Step;
import serenity.pages.CareersPage;

public class CareersSteps {

    private CareersPage careersPage;

    @Step
    public void openCareerPage() {
        careersPage.open();
    }

    @Step
    public void clickSeeAllOurRolesButton() {
        careersPage.clickSeeAllOurRolesButton();
    }

    @Step
    public void clickOurOpportunitiesSection() {
        careersPage.clickOurOpportunitiesSection();
    }

    @Step
    public void clickAllDepartmentsSelectBox() {
        careersPage.clickAllDepartmentsSelectBox();
    }

    @Step
    public void selectEngineeringAndItDepartment() {
        careersPage.selectEngineeringAndItDepartment();
    }

    @Step
    public void clickAllOfficesSelectBox() {
        careersPage.clickAllOfficesSelectBox();
    }

    @Step
    public void selectKrakowOffice() {
        careersPage.selectKrakowOffice();
    }

    @Step
    public void clickTestEngineerPosition() {
        careersPage.clickTestEngineerLink();
    }

    @Step
    public void enterFirstName(String firstName) {
        careersPage.populateFirstNameInputField(firstName);
    }

    @Step
    public void enterLastName(String lastName) {
        careersPage.populateLastNameInputField(lastName);
    }

    @Step
    public void enterEmail(String email) {
        careersPage.populateEmailInputField(email);
    }

    @Step
    public void clickSubmitButton() {
        careersPage.clickSubmitButton();
    }

    @Step
    public boolean isValidationMessageDisplayed() {
        return careersPage.isValidationMessageDisplayed();
    }
}