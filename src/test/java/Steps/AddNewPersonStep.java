package Steps;

import PageObjectModel.AddNewPersonPage;
import com.github.dockerjava.core.dockerfile.DockerfileStatement;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import gherkin.lexer.Th;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class AddNewPersonStep {
    AddNewPersonPage AddNewPersonPage =new AddNewPersonPage();
    private WebDriver driver;

    @Given("^navigate a Website$")
    public void navigateAWebsite() {
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        AddNewPersonPage.getUrl();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^enter  username \"([^\"]*)\"$")
    public void enterUsername(String username) throws Throwable {
        AddNewPersonPage.typeUsername(username);
        Thread.sleep(2000);
    }

    @And("^enter  password \"([^\"]*)\"$")
    public void enterPassword(String password) throws Throwable {
       AddNewPersonPage.typePassword(password);
       Thread.sleep(2000);

    }

    @When("^click  button$")
    public void clickButton() throws InterruptedException {
        AddNewPersonPage.clickOnSendButton();
        Thread.sleep(2000);
    }

    @And("^choose category$")
    public void chooseCategory() throws InterruptedException {
        AddNewPersonPage.clickOnHrefButton();
        Thread.sleep(2000);
    }

    @And("^Select customer$")
    public void selectCustomer() throws InterruptedException {
        AddNewPersonPage.clickCandidate();
        Thread.sleep(2000);
        AddNewPersonPage.selectCustomer();
        Thread.sleep(2000);

    }

    @And("^Select position$")
    public void selectPosition() throws InterruptedException {
        AddNewPersonPage.selectPosition();
        Thread.sleep(2000);
    }

    @And("^Select Hr$")
    public void selectHr() throws InterruptedException {
        AddNewPersonPage.selectHr();
        Thread.sleep(2000);
    }

    @And("^Select Date$")
    public void selectDate() throws InterruptedException {
        AddNewPersonPage.clickDate();
        Thread.sleep(2000);
        AddNewPersonPage.selectDateTime();
        Thread.sleep(2000);
        AddNewPersonPage.setClickApplyButton();
    }


    @And("^Enter phone number \"([^\"]*)\"$")
    public void enterPhoneNumber(String number) throws Throwable {
        AddNewPersonPage.typePhone(number);
        Thread.sleep(2000);


    }


    @And("^Enter a name \"([^\"]*)\"$")
    public void enterAName(String name) throws Throwable {
        AddNewPersonPage.setClickName();
        AddNewPersonPage.typeName(name);
        Thread.sleep(2000);
    }

    @And("^Enter a surname \"([^\"]*)\"$")
    public void enterASurname(String surname) throws Throwable {
        AddNewPersonPage.typeSurname(surname);
        Thread.sleep(2000);

    }

    @And("^Select Cv source$")
    public void selectCvSource() throws InterruptedException {
        AddNewPersonPage.selectCv();
        Thread.sleep(2000);
    }

    @And("^Select status$")
    public void selectStatus() throws InterruptedException {
        AddNewPersonPage.selectStatus();
        Thread.sleep(2000);
    }

    @And("^enter a not \"([^\"]*)\"$")
    public void enterANot(String note) throws Throwable {
        AddNewPersonPage.typeNote(note);
        Thread.sleep(2000);

    }

    @And("^Select language$")
    public void selectLanguage() throws InterruptedException {
        AddNewPersonPage.clickLanguage();
        Thread.sleep(2000);
        AddNewPersonPage.clickEmail();
    }
    @And("^Enter a email \"([^\"]*)\"$")
    public void enterAEmail(String email) throws Throwable {

        AddNewPersonPage.typeEmail(email);
        Thread.sleep(2000);
    }



    @When("^click save button$")
    public void clickSaveButton() {
    }

    @Then("^Driver And$")
    public void driverAnd() {
    }


}
