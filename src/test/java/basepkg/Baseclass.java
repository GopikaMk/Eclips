package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class Baseclass {
     public WebDriver driver;
     @BeforeTest
     public void test()
     {
    	 driver=new ChromeDriver();
     }
     @BeforeMethod
     public void test1()
     {
    	 driver.get("https://www.adobe.com/in/acrobat/online/convert-pdf.html");
     }
     
}
