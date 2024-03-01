package stepDefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;


public class HomePageSteps {

    @Given("user is on home page")
    public void user_is_on_login_page() {

        DriverFactory.getDriver()
                .get("https://www.myfavdesigners.com/");
    }}
