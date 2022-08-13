package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumLoginCHeck {
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.name("PASSWORD"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementWeb = driver.findElement(By.tagName("h2"));
		String text = elementWeb.getText();
		System.out.println(text);
		WebElement findElementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		findElementCRMSFA.click();
		//WebElement elementUserName12 = driver.findElement(By.id("username"));
		//elementUserName12.sendKeys("Demosalesmanager");
		//WebElement elementPassword1 = driver.findElement(By.name("PASSWORD"));
		//elementPassword1.sendKeys("crmsfa");
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreatelead = driver.findElement(By.linkText("Create Lead"));
		elementCreatelead.click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("VembuTechnologies");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("jayachithra");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("S");
		WebElement elementSourcedd = driver.findElement(By.id("createLeadForm_dataSourceId"));
		elementSourcedd.sendKeys("Employee");
		WebElement elementMarketingdd = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marketingdd =new Select(elementMarketingdd);
		marketingdd.selectByIndex(3);
		WebElement elementIndustrydd = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select Industrydd = new Select(elementIndustrydd);
		Industrydd.selectByVisibleText("Computer Hardware");
		WebElement elementOwnershipdd = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownershipdd = new Select(elementOwnershipdd);
		ownershipdd.selectByValue("OWN_PROPRIETOR");
		WebElement elementSubmit = driver.findElement(By.className("smallSubmit"));
		elementSubmit.click();							

	}

}
