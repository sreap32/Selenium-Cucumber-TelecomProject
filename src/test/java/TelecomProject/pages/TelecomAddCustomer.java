package TelecomProject.pages;

import TelecomProject.utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelecomAddCustomer extends BasePage {

    @FindBy(xpath = "//label[@for = 'done']")
    private WebElement doneButton;

    @FindBy(xpath = "//label[@for = 'Pending']")
    private WebElement pendingButton;


    public void clickDoneButton() {doneButton.click();}
    public void clickPendingButton(){pendingButton.click();}




}
