package testpkg;

import java.awt.AWTException;
import java.awt.Desktop.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import io.netty.handler.codec.http.multipart.FileUpload;
import pagespkg.Datadriven;
import pagespkg.Fileupload;
import pagespkg.Mouseover;
import utils.Exelutils;

public class Testdob  extends Baseclass{
      
	@Test
	public void testrun() throws AWTException, InterruptedException
	{
		driver.manage().window().maximize();
		Datadriven l=new Datadriven(driver);
		String xl="C:\\Users\\reshm\\OneDrive\\Desktop\\Adob.xlsx";
		String sheet="Sheet1";
		
		int rowCount=Exelutils.getRowCount(xl, sheet);
		for(int i=1;i<=rowCount;i++) {
			String email=Exelutils.getCellValues(xl, sheet, i, 0);
			System.out.println("email-----"+email);
			String password=Exelutils.getCellValues(xl, sheet, i, 1);
			System.out.println("password----"+password);
			l.logininclick();
			l.details(email, password);
			l.clicklogin();
		}
		Fileupload fu=new Fileupload(driver);
		fu.file();
		fu.Fileupload("C:\\Users\\reshm\\OneDrive\\Desktop\\Adob.xlsx");
		Thread.sleep(5000);
		Mouseover mu=new Mouseover(driver);
		mu.click();
		Thread.sleep(5000);
		WebElement oo=mu.click2();
		Actions act=new Actions(driver);
		
		act.moveToElement(oo);
	
	}
}
