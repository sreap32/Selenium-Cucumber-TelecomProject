package TelecomProject.pages;

import TelecomProject.utilities.BasePage;
import TelecomProject.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelecomBillingAddress extends BasePage {

    @FindBy(id = "fname")
    private WebElement firstName;

    @FindBy(id = "lname")
    private WebElement lastName;

    @FindBy(id = "email")
    private WebElement emailButton;

    @FindBy(xpath = "//textarea[@id = 'message']")
    private WebElement enterYourAddress;

    @FindBy(id = "telephoneno")
    private WebElement mobileNumber;

    @FindBy(xpath = "//input[@value ='Submit']")
    private WebElement submitButton;


    public void setTelecomBillingAddress(String fname, String lName, String email, String address, String pNumber) {
        BrowserUtils.wait(1);
        firstName.sendKeys(fname);
        BrowserUtils.wait(1);
        lastName.sendKeys(lName);
        BrowserUtils.wait(1);
        emailButton.sendKeys(email);
        BrowserUtils.wait(1);
        enterYourAddress.sendKeys(address);
        BrowserUtils.wait(1);
        mobileNumber.sendKeys(pNumber);
    }

    public void clickSubmitButton() {
        BrowserUtils.wait(1);
        submitButton.click();
    }




    }

