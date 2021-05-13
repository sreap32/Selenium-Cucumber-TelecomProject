package TelecomProject.pages;

import TelecomProject.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelecomAddTariff extends BasePage {

    @FindBy(id="rental1")
    private WebElement monthlyRental;

    @FindBy(id = "local_minutes")
    private WebElement freeLocalMinutes;

    @FindBy(id="inter_minutes")
    private WebElement freeInternationalminutes;

    @FindBy(id="sms_pack")
    private WebElement freeSmspack;

    @FindBy(id="minutes_charges")
    private WebElement localPerMinutesCharges;

    @FindBy(id="inter_charges")
    private WebElement internationalPerMinutesCharges;

    @FindBy(id="sms_charges")
    private WebElement smsPerCharges;

    @FindBy(xpath ="//input[@value='submit']")
    private WebElement submitButton;


    public void setMonthlyRental(String monthlyRental1){
        monthlyRental.sendKeys(monthlyRental1);}
    public void setFreeLocalMinutes(String freeLocalMinutes1){
        freeLocalMinutes.sendKeys(freeLocalMinutes1);}
    public void setFreeInternationalminutes(String freeInternationalminutes1){
        freeInternationalminutes.sendKeys(freeInternationalminutes1);}
    public void setFreeSmspack(String freeSmspack1){
        freeSmspack.sendKeys(freeSmspack1);}
    public void setLocalPerMinutesCharges(String localPerMinutesCharges1){
        localPerMinutesCharges.sendKeys(localPerMinutesCharges1);}
    public void setInternationalPerMinutesCharges(String internationalPerMinutesCharges1){
        internationalPerMinutesCharges.sendKeys(internationalPerMinutesCharges1);}
    public void setSmsPerCharges(String smsPerCharges1){
        smsPerCharges.sendKeys(smsPerCharges1);}
    public void clickSubmitButton(){
        submitButton.click();}

}
