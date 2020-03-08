package serenity.steps;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import serenity.steps.serenity.CareersSteps;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CareerStepDefinitions {

    @Steps
    private CareersSteps careersSteps;

    @Given("user navigates to the 'Careers' page")
    public void userNavigatesToTheCareerPage() {
        careersSteps.openCareerPage();
    }

    @Given("user clicks 'See All Our Roles' button")
    public void userClicksSeeAllOurRolesButton() {
        careersSteps.clickSeeAllOurRolesButton();
    }

    @Given("user selects 'Engineering & IT' department in 'All Departments' select box")
    public void userSelectsEngineeringAndItDepartment() {
        careersSteps.clickOurOpportunitiesSection();
        careersSteps.clickAllDepartmentsSelectBox();
        careersSteps.selectEngineeringAndItDepartment();
    }

    @Given("user selects 'Krakow, Poland' office in 'All offices' select box")
    public void userSelectsKrakowOffice() {
        careersSteps.clickOurOpportunitiesSection();
        careersSteps.clickAllOfficesSelectBox();
        careersSteps.selectKrakowOffice();
    }

    @Given("user clicks 'Test Engineer' link in the list of found positions")
    public void userClicksTestEngineerLink() {
        careersSteps.clickTestEngineerPosition();
    }

    @Given("user enters his 'First name' - $firstName")
    public void userEntersFirstName(String firstName) {
        careersSteps.enterFirstName(firstName);
    }

    @Given("user enters his 'Last name' - $lastName")
    public void userEntersLastName(String lastName) {
        careersSteps.enterLastName(lastName);
    }

    @Given("user enters his 'Email' - $email")
    public void userEntersEmail(String email) {
        careersSteps.enterEmail(email);
    }

    @When("user submits the application form")
    public void userSubmitsTheApplicationForm() {
        careersSteps.clickSubmitButton();
    }

    @Then("user gets validation message 'This field is required.' for CV")
    public void userGetsValidationMessageForCv() {
        assertTrue("Validation message for CV field is expected to be displayed", careersSteps.isValidationMessageDisplayed());
    }
}
