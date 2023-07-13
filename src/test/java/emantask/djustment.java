package emantask;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class assets extends BaseTest {
	  @Test //("description:search for an asset name ")
      public void search(){
	      driver.findElement(By.className(null)).click();
		  driver.findElement(By.id(null)).sendKeys("botox");
		  driver.hideKeyboard();
		  String Title=driver.findElement(By.id(null)).getText();
	      Assert.assertEquals(Title, "botox");
	      driver.pressKey(new KeyEvent(AndroidKey.BACK ));

	      
	  }
	  @Test //("description: scroll the page down to see all the cards")

	      public void scroll() {     
	      boolean scrollmore;
	      scrollmore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
   			    "left", 100, "top", 100, "width", 200, "height", 200,
   			    "direction", "down",
   			    "percent", 3.0
   			));
	  }
	  {
	  }
		  @Test (priority=1 ,description="fullview for the card+screenrotation+scrolldown ")
	      public void fullview() {     
	      driver.findElement(AppiumBy.accessibilityId(null)).click();
	      DeviceRotation landScape=new DeviceRotation(0, 0, 90);
    	  driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Lead Time\"));"));
    	  String Title2=driver.findElement(AppiumBy.accessibilityId(null)).getText();
    	  Assert.assertEquals(Title2, "Lead Time");
		  }
    	  @Test (priority=2,description="fullview for the card+screenrotation+scrolldown ")
	      public void Titleforfullviewcard() {
	      driver.findElement(AppiumBy.accessibilityId(null)).click();
          String TITLE1=driver.getTitle();
          System.out.println(TITLE1);
    	  }
    	  @Test (priority=3,description="update status then come back to home page-make sure the status is right  ")
	      public void status2() {
           //
	      driver.findElement(By.id(null)).click();
	      driver.findElement(By.xpath("\\tagname[2]")).click();
          driver.pressKey(new KeyEvent(AndroidKey.HOME ));
          String fullview=driver.findElement(By.xpath("\\tagname[2]")).getText();
          Assert.assertEquals(fullview, "");
    	  }
    	  
          @Test (priority=4,description="get the text and size into asset card")
	      public void GetText1() {
	      List<WebElement> asset=driver.findElements(By.id(null));
	      for (int i=0 ;i<asset.size();i++);{
	      System.out.println(asset.get(i).getText());
		  System.out.println(asset.size());
          }
          }
          @Test (priority=5,description="get the text and size into asset card")
	      public void GetText() {
	      List<WebElement> asset=driver.findElements(By.id(null));
	      for (int i=0 ;i<asset.size();i++);{
	      System.out.println(asset.get(i).getText());
		  System.out.println(asset.size());
	      }
          }
    	  
          @Test (priority=6,description="testing the warrining of upper limit and to print it")
	      public void Warrning() {
        	boolean war=driver.findElement(By.className("")).isDisplayed() 
        	Assert.assertTrue(war);
        	System.out.println(war);
          }
          
            @Test (priority=7,description="testing the warrining of expiry date and to print it  ")     
          public void Expirydate() {
          	boolean Exp=driver.findElement(By.className("")).isDisplayed() 
          	Assert.assertTrue(Exp);
          	System.out.println(Exp);
            }  
          @Test (priority=8,description="testing the warrining of lower limit and to print it ")
          public void lowerlimit() {
	     boolean lower=driver.findElement(By.className("")).isDisplayed() 
	     Assert.assertTrue(lower);
	     System.out.println(lower);
  } 
          @Test (priority=9,description="verifying the icons ")
          public void icons() {  
		  driver.findElement(By.xpath(null)).isDisplayed();
		  boolean Picture=driver.findElement(By.xpath(null)).isDisplayed();
	      Assert.assertTrue(Picture);
          }
          
	      @Test (priority=10 ,description="verify view document button") 
          public void ViewDocument() { 		  
		//verify view document button 
		driver.findElement(By.id(null)).click();
		boolean Notion= driver.findElement(By.id(null)).isDisplayed();
		  Assert.assertTrue(Notion);
		
	      }
}