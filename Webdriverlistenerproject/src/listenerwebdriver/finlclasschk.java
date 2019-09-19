package listenerwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class finlclasschk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		String path;
		path=System.getProperty("user.dir")+"//Driver//chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		EventFiringWebDriver eventDriver = new EventFiringWebDriver(driver);
		
		EventHandler handler = new EventHandler();
		
		 eventDriver.register(handler);
		 eventDriver.get("https://www.facebook.com/");
		 eventDriver.findElement(By.id("day")).sendKeys("12");
		 eventDriver.findElement(By.id("month")).sendKeys("May");
		 eventDriver.findElement(By.id("year")).sendKeys("1996");
		 eventDriver.findElement(By.name("firstname")).sendKeys("Admin");
		 eventDriver.findElement(By.name("lastname")).sendKeys("admin");
		 eventDriver.findElement(By.name("reg_email__")).sendKeys("Admin@yahoo.com");
		 eventDriver.findElement(By.name("reg_passwd__")).sendKeys("123456");
		 eventDriver.findElement(By.name("reg_email_confirmation__")).sendKeys("Admin@yahoo.com");
		 //WebElement element = eventDriver.findElement(By.id("target"));
		 //element.click();
		 driver.findElement(By.name("websubmit")).click();
		 eventDriver.unregister(handler);
	}
	public void Launch()
	{
		
	}

}
