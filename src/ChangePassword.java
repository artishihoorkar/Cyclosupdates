import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
public class ChangePassword {
  @Test
  public static void main(String[] args){
	 
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\IBM_ADMIN\\Desktop\\Cucumber Framework\\SeleniumTraining\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  EventFiringWebDriver eventHandler = new EventFiringWebDriver(driver);
	  driver.get("http://ec2-13-233-153-88.ap-south-1.compute.amazonaws.com:8080/web");
	  driver.findElement(By.id("cyclosUsername")).sendKeys("admin");
	  driver.findElement(By.id("cyclosPassword")).sendKeys("1234");
	  driver.findElement(By.xpath("//*[@id='cyclosLogin']/table/tbody/tr[3]/td/input")).click();
	  driver.findElement(By.id("menu1")).click();
	  driver.findElement(By.id("submenu1.1")).click();
  }
}
