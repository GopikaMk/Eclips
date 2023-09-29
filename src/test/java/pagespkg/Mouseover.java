package pagespkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class Mouseover {
    WebDriver driver;
    By Aedit=By.xpath("/html/body/header/div[2]/nav[1]/div[1]/div[1]/div[4]/a");
    By Asplit=By.xpath("//*[@id=\"navmenu-3\"]/ul/li[3]/a");
    public Mouseover(WebDriver driver)
    {
    	this.driver=driver;
    }
    public void click()
    {
    	driver.findElement(Aedit).click();
    }
    public WebElement click2()
    {
    	return driver.findElement(Asplit);
    }

}