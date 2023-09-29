package pagespkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Datadriven {
   WebDriver driver;
    
   By Asignin=By.xpath("/html/body/header/div[2]/nav[1]/div[2]/a");
   By Aemail=By.xpath("//*[@id=\"EmailPage-EmailField\"]");
   By Aemailclick=By.xpath("//*[@id=\"EmailForm\"]/section[2]/div[2]/button/span");
   By Apassword=By.xpath("//*[@id=\"PasswordPage-PasswordField\"]");
   By Apasswordclick=By.xpath("//*[@id=\"PasswordForm\"]/section[2]/div[2]/button");

public Datadriven(WebDriver driver) {
	this.driver=driver;
}
public void logininclick()
{
	driver.findElement(Asignin).click();
}
public void details(String email,String password) {
	driver.findElement(Aemail).clear();
	driver.findElement(Aemail).sendKeys(email);
	driver.findElement(Apassword).clear();
	driver.findElement(Apassword).sendKeys(password);
}
public void clicklogin()
{
	driver.findElement(Aemailclick).click();
	driver.findElement(Apasswordclick).click();
}
}