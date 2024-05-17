package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utility.BrowserDriver;

import static pages.SearchPage.*;
import static pages.SearchResult.get_search_result;
import static pages.SearchResultRecentDate.get_search_result_recent_date;

public class JobSearchValidData {
    @Given("I am a job seeker on NHS Jobs website using {string} for job search")
    public void nhs_home_page(String browser) throws Throwable {
        BrowserDriver.invokedriver(browser);
    }

    @When("I put search preference into the Search functionality")
    public void user_enter_search_preference() throws Throwable {
        job_search_valid_data();
    }

    @Then("I should get a list of jobs which matches my preferences")
    public void user_view_search_results() throws Throwable {
        get_search_result();
    }

    @And("sort my search results with the newest Date Posted")
    public void user_filter_by_recent_date() throws Throwable {
        get_search_result_recent_date();
    }

}
