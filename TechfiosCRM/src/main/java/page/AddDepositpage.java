package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddDepositpage extends BasePage {
	WebDriver driver;

	public AddDepositpage(WebDriver driver) {
		this.driver = driver;
	}
	
	  @FindBy(how = How.XPATH, using = "//select[@id='account']") 
	  WebElement AcccountDropDown;
	 @FindBy(how = How.ID, using = "description")
	 WebElement DescriptionField;
	 @FindBy(how = How.ID, using = "amount")
	 WebElement AmountField;
	 @FindBy(how = How.ID, using = "submit") 
	  WebElement SubmitButton;
	 
		public void fillInTheAddDepositForm(String description, String amount) {
		DescriptionField.sendKeys(description);
		AmountField.sendKeys(amount);
		SubmitButton.click();
	}

	

	public void selectFromDropDownForAccount(String string) {
		Select select = new Select(AcccountDropDown);
		select.selectByVisibleText(string);

	}

}
