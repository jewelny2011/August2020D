package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps {
    @Given(":I am at talentTEK home page")
    public void i_Am_At_Talent_TEKHome_Page() {
        System.out.println("Thsi is my talentTEK home page");
    }

    @And(":I enter valid email")
    public void i_Enter_Valid_Email() {
        System.out.println("This is valid email");
    }

    @And(":I enter valid password")
    public void i_Enter_Valid_Password() {

        System.out.println("This is valid password");
    }

    @When(":I click on login button")
    public void i_Click_On_LoginButton() {

        System.out.println("This is click on");
    }

    @Then(":I will verify I successfully logged into my existing account")
    public void i_Will_Verify_I_Successfully_Logged_Into_My_Existing_Account() {

        System.out.println("This is logged");
    }

    @And(":I close browser")
    public void i_Close_Browser() {
        System.out.println("This is close");

    }
}
