package emantask;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class contact extends BaseTest{
	@Test (priority =1 ,description="create contact")
    public void contact11() {
		driver.findElement(By.id(null)).click();
        WebElement contact1=driver.findElement(By.xpath("null"));
		 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
   			  ImmutableMap.of("elementId",((RemoteWebElement)contact1).getId(),
   			  "duration",2000));
		 driver.findElement(By.xpath("null[0]")).click();
	    driver.findElement(By.className(null)).sendKeys("rasha");
		driver.findElement(By.className(null)).sendKeys("0776857176");
		driver.findElement(By.className(null)).sendKeys("0777625716");
		driver.findElement(By.className(null)).sendKeys("rashadamer13@gmail.com");
		driver.hideKeyboard();
		driver.findElement(By.xpath(null)).click();
		WebElement Editcontact=driver.findElement(By.xpath("null"));
		 ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
  			  ImmutableMap.of("elementId",((RemoteWebElement)Editcontact).getId(),
  			  "duration",2000));
       driver.findElement(By.xpath("null[1]")).click();
    }
    @Test (priority=2,description="make sure contact have the same name ")
    	    public void getcontact1() {
    	   String contact=driver.findElement(By.className(null)).getText();
    	   Assert.assertEquals(contact, "");
    	   System.out.println(contact);
    }
    @Test (priority=3,description="edit our contact")
    	    public void edit() {
       
    	driver.findElement(By.className(null)).sendKeys("rasha");
		driver.findElement(By.className(null)).sendKeys("0776857176");
		driver.findElement(By.className(null)).sendKeys("0777625716");
		driver.findElement(By.className(null)).sendKeys("rashadamer13@gmail.com");
		driver.findElement(By.className(null)).click();

       
	}
    @Test (priority=3,description="edit our contact")
	    public void ErrorEdit() {
    	driver.findElement(By.className(null)).remove();
    	String error=driver.findElement(By.tagName("")).getText();
    	Assert.assertEquals(error, "phone numberr is required");
}
    
}

