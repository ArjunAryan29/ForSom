package StepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.BrowserDriver;
import static pages.SearchInvalidJobTitle.search_invalid_job_title;
import static pages.SearchInvalidJobTitle.search_result_invalid_job_title;


public class JobSearchInvalidTitle {
    @Given("I am a job seeker on NHS Jobs website using {string} for invalid title search")
    public void nhs_home_page(String browser) throws Throwable {
        BrowserDriver.invokedriver(browser);
    }

    @When("I enter incorrect job title in search")
    public void user_enter_incorrect_job_title() throws Throwable {
        search_invalid_job_title();
    }

    @Then("I should get no results found")
    public void user_view_search_results() throws Throwable {
        search_result_invalid_job_title();
    }

}
