package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		WebElement elementUserName = driver.findElement(By.id("username"));
		elementUserName.sendKeys("Demosalesmanager");
		WebElement elementPassword = driver.findElement(By.id("password"));
		elementPassword.sendKeys("crmsfa");
		WebElement elementLogin = driver.findElement(By.className("decorativeSubmit"));
		elementLogin.click();
		WebElement elementCRMSFA = driver.findElement(By.linkText("CRM/SFA"));
		elementCRMSFA.click();
		WebElement elementLeads = driver.findElement(By.linkText("Leads"));
		elementLeads.click();
		WebElement elementCreateLead = driver.findElement(By.linkText("Create Lead"));
		elementCreateLead.click();
		WebElement elementCompanyName = driver.findElement(By.id("createLeadForm_companyName"));
		elementCompanyName.sendKeys("CTS");
		WebElement elementFirstName = driver.findElement(By.id("createLeadForm_firstName"));
		elementFirstName.sendKeys("Jessi");
		WebElement elementLastName = driver.findElement(By.id("createLeadForm_lastName"));
		elementLastName.sendKeys("S");
		WebElement elementFirstNameLocal = driver.findElement(By.id("createLeadForm_firstNameLocal"));
		elementFirstNameLocal.sendKeys("ssrk");
		WebElement elementDepartment = driver.findElement(By.id("createLeadForm_departmentName"));
		elementDepartment.sendKeys("CSE");
		WebElement elementDescription = driver.findElement(By.id("createLeadForm_description"));
		elementDescription.sendKeys("Working in CTS as QA Infra");
		WebElement elementEmailAdress = driver.findElement(By.id("createLeadForm_primaryEmail"));
		elementEmailAdress.sendKeys("jaya45@gmail.com");
		WebElement elementStateProvince	 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateprovincedd = new Select(elementStateProvince);
		stateprovincedd.selectByVisibleText("New York");
		WebElement elementSubmit = driver.findElement(By.className("smallSubmit"));
		elementSubmit.click();
		System.out.println("The Title Of the Final page is " + driver.getTitle());

	}
}
