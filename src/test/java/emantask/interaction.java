package emantask;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class interaction extends BaseTest {
	 @Test (priority=1,description="search for element")
     public void interaction1() {
		 driver.findElement(By.id(null)).sendKeys("botox");
		  driver.hideKeyboard();
	      driver.pressKey(new KeyEvent(AndroidKey.BACK ));
         
	      @Test (priority=1,description="choosing date then assert lf its the right date")
	      public void datepicker() {  
	      // 
	      driver.findElement(By.id(null)).click();
	      driver.findElement(By.xpath(null)).click();
	      driver.findElement(By.xpath(null)).click();
	      String date =driver.findElement(By.xpath(null)).getText();
          Assert.assertEquals(date, "");
	      
	      //filter dialouge
	          driver.findElement(By.xpath(null)).click();
	          boolean filter= driver.findElement(By.xpath(null)).isSelected();
	          Assert.assertTrue(filter);
	      }
	          @Test(priority=4,description="tag filter/reset/choose a tag one other time")
   
	       public void tagnamefilter() {

	          driver.findElement(By.xpath(null)).click();
	         driver.findElement(By.xpath(null)).click();
	          driver.findElement(By.xpath(null)).click();
	          driver.findElement(By.id(null)).click();
	      }
	          @Test (priority=1,description="choosing date then assert lf its the right date")
		      public void sortfilter() {  
	         driver.findElement(AppiumBy.accessibilityId(null)).click();
	         driver.findElement(By.xpath("null[1]"));
			 int date = driver.findElements(By.xpath("null")).size();
			 for(int i=0;i<date;i++);
			 {
		 String datetext=driver.findElement(By.className(null)).get(i).getText();
		 if (datetext.equalsIgnoreCase("12-7-2023)"));
		 {
			 System.out.println(date);
		 }
         @Test (priority=3,description="choose two filters -search")
	      public void choosefilters() {  
	      driver.findElement(By.id(null)).click();
	      driver.findElement(By.id(null)).click();
	      driver.findElement(By.id(null)).click();
			 }
			 
	 {
		
	}

}

