package testvrl;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pagevrlbus.BasesonContract;
import pagevrlbus.OneWay;

public class Testvrl1 {
	WebDriver driver;
	@BeforeTest
	public void browser() {
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload() {
		driver.get("https://www.vrlbus.in//#/");
	}
	@Test
	public void setup() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	OneWay ow=new OneWay(driver);
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("eindow.scrollBy(0,250)","");
	Thread.sleep(2000);
	driver.navigate().refresh();
	ow.entersdd("AHMEDABAD","BANGALORE","30/08/2023");
	ow.search();
	driver.navigate().refresh();
	BasesonContract boc=new BasesonContract(driver);
	boc.open();
	Thread.sleep(2000);
	boc.contact_details("Resh","resh@gmail.com","09445345438");
	
	
	
	
	
	
		
	}

}
