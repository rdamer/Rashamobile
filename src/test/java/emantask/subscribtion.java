package emantask;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class subscribtion extends BaseTest {
	@Test(description = "swipe subscribtion left")
	public void swipeleft() {
		driver.findElement(By.xpath("")).click();
		WebElement subscribtion = driver.findElement(By.xpath(""));
		Assert.assertEquals(driver.findElement(By.xpath("")).getAttribute(""), "true");
		SwipeAction(swipeleft, "Left");
		Assert.assertEquals(
				driver.findElement(By.xpath("()[1]")).getAttribute(""), "false");
	}
	@Test(description = "swipe subscribtion1 right")
	public void swiperight() {
		driver.findElement(By.xpath("")).click();
		WebElement swiperight = driver.findElement(By.xpath(""));
		Assert.assertEquals(driver.findElement(By.xpath("")).getAttribute(""), "true");
		SwipeAction(swiperight, "right");
		Assert.assertEquals(
				driver.findElement(By.xpath("[1]")).getAttribute(""), "false");
	}
	
   private void SwipeAction(WebElement swiperight, String string) {
		// TODO Auto-generated method stub
		
	}
   @Test(description = "swipe subscribtion1 right")
        public void submit() {
		driver.findElement(By.xpath("")).click();

   }

	}
