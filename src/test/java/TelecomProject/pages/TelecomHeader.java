package TelecomProject.pages;

import TelecomProject.utilities.BasePage;
import TelecomProject.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelecomHeader extends BasePage {

    @FindBy(xpath = "//a[.='Add Customer']")
    private WebElement newAddcustomerButton;

    @FindBy(xpath = "//a[.='Add Tariff Plan']")
    private WebElement newAddTariffButton;

    public void clickNewaddcustomerButton() {
        BrowserUtils.wait(1);
        newAddcustomerButton.click();
    }

    public void clickNewaddtariffButton(){
        BrowserUtils.wait(1);
        newAddTariffButton.click();
    }
}
