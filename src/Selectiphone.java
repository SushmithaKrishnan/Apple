import org.openqa.selenium.By;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selectiphone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","/Users/vivek/Desktop/chromedriver");
		//System.setProperty("webdriver.chrome.driver", "/Users/vivek/Desktop/chromedriver");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/au");
        driver.findElement(By.xpath("//*[@id=\"ac-globalnav\"]/div/ul[2]/li[4]/a")).click();
       
    
     
	}

}
