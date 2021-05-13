package TelecomProject.stepsDefinitions;

import TelecomProject.pages.TelecomAddCustomer;
import TelecomProject.pages.TelecomAddTariff;
import TelecomProject.pages.TelecomBillingAddress;
import TelecomProject.pages.TelecomHeader;
import TelecomProject.utilities.BrowserUtils;
import TelecomProject.utilities.Driver;
import TelecomProject.utilities.PropertiesReading;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Map;


public class TelecomStepsDefinitions {
    TelecomHeader headerPage = new TelecomHeader();
    TelecomAddCustomer addCustomerPage = new TelecomAddCustomer();
    TelecomBillingAddress addBillingPage = new TelecomBillingAddress();
    TelecomAddTariff addTariffPage = new TelecomAddTariff();



    @Given("The user wants to see Guru demo site")
    public void the_user_wants_to_see_guru_demo_site() {

        Driver.getDriver().get(PropertiesReading.getProperties("TelecomProject_URL"));

    }

    @Then("The user wants to verify {string} header")
    public void the_user_wants_to_verify_header(String string) {

        String expectedmessage = "Guru99 telecom";
        String actualmessage = Driver.getDriver().findElement(By.xpath("//a[.='Guru99 telecom']")).getText();

        Assert.assertEquals(actualmessage, expectedmessage);


    }

    @When("The user wants to add a customer")
    public void the_user_wants_to_add_a_customer() {

        BrowserUtils.wait(1);
        headerPage.clickNewaddcustomerButton();

    }

    @Then("The user wants to enter background check as {string}")
    public void the_user_wants_to_enter_background_check_as(String bCheck) {

        switch (bCheck) {
            case "done":
                BrowserUtils.wait(1);
                addCustomerPage.clickDoneButton();
                break;
            case "pending":
                BrowserUtils.wait(1);
                addCustomerPage.clickPendingButton();
                break;
        }


    }

    @Then("The user wants to enter billingaddress as {string} and {string} and {string} and {string} and {string}")
    public void the_user_wants_to_enter_billingaddress_as_and_and_and_and(String fName,String lName,String email,String address,String pNumber) {


        BrowserUtils.wait(1);
        addBillingPage.setTelecomBillingAddress(fName,lName,email,address,pNumber);
        BrowserUtils.wait(1);
        addBillingPage.clickSubmitButton();

    }

    @Then("The wants to verify message as {string}")
    public void the_wants_to_verify_message_as(String string) {

        String expectedmessage = "Access Details to Guru99 Telecom";
        String actualMessage =Driver.getDriver().findElement(By.xpath("//h1[.='Access Details to Guru99 Telecom']")).getText();
        Assert.assertEquals(actualMessage,expectedmessage);

    }
    @When("The user wants to Add Tariff Plan")
    public void the_user_wants_to_add_tariff_plan() {

        BrowserUtils.wait(1);
        headerPage.clickNewaddtariffButton();
    }
    @Then("The user wants to Add Tariff Plan details as")
    public void the_user_wants_to_add_tariff_plan_details_as(Map<String,String> addTariffInfo) {
        BrowserUtils.wait(1);
        addTariffPage.setMonthlyRental(addTariffInfo.get("Monthly Rental"));
        addTariffPage.setFreeLocalMinutes(addTariffInfo.get("Free International Minutes"));
        addTariffPage.setFreeSmspack(addTariffInfo.get("Free SMS Pack"));
        addTariffPage.setLocalPerMinutesCharges(addTariffInfo.get("Local Per Minutes Charges"));
        addTariffPage.setInternationalPerMinutesCharges(addTariffInfo.get("International Per Minutes Charges"));
        addTariffPage.setFreeInternationalminutes(addTariffInfo.get("Free International Minutes"));
        addTariffPage.setSmsPerCharges(addTariffInfo.get("SMS Per Charges"));
    }


    @Then("The user wants to submit")
    public void the_user_wants_to_submit() {
        BrowserUtils.wait(1);
        addTariffPage.clickSubmitButton();

    }
    @Then("The user wants to verify message as {string}")
    public void the_user_wants_to_verify_message_as(String congraMessage) {
      //  String actualmessage = "Congratulation you add Tariff Plan";
        WebElement actualMessage =Driver.getDriver().findElement(By.xpath("//h2[.='Congratulation you add Tariff Plan']"));
        String realOne = actualMessage.getText();
        Assert.assertEquals(realOne,congraMessage);






    }


}
