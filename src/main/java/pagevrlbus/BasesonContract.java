package pagevrlbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasesonContract {
	WebDriver driver;
	By vrlBusesContract=By.xpath("//*[@id=\"VRL_Header\"]/div/div/div/div/div[2]/div[1]/div[2]/button/span");
	By vrlCName=By.xpath("//*[@id=\"txtcontactPerson\"]");
	By vrlEmail=By.xpath("//*[@id=\"txtEmail\"]");
	By vrlMobile=By.xpath("//*[@id=\"txtMobileNo\"]");
	public BasesonContract(WebDriver driver) {
		this.driver=driver;
	}
	public void open() {
		driver.findElement(vrlBusesContract).click();
	}
	public void contact_details(String name,String email,String mobile) {
		driver.findElement(vrlCName).sendKeys(name);
		driver.findElement(vrlEmail).sendKeys(email);
		driver.findElement(vrlMobile).sendKeys(mobile);
		
	}
}
