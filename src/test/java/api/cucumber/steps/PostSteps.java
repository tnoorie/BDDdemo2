package api.cucumber.steps;



import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.CucumberOptions;



@CucumberOptions(features = {"src/test/java/api/cucmber/features"}, glue = "api/cucmber/steps/PostSteps.java")
public class PostSteps {

    @Given("^User should be logged in and should be present on his wall$")
    public void user_should_be_logged_in_and_should_be_present_on_his_wall() throws Throwable {
        System.out.println("User should be logged in and should be present on his wall");
    }

    @When("^I type message in the box$")
    public void i_type_message_in_the_box() throws Throwable {
        System.out.println("I type message in the box");
    }

    @Then("^Message should get posted$")
    public void message_should_get_posted() throws Throwable {
        System.out.println("Message should get posted");
    }

    @And("^Click on Post button$")
    public void click_on_post_button() throws Throwable {
        System.out.println("Click on Post button");
        ;
    }

}



