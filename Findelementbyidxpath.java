package basicweb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Findelementbyidxpath {
	
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver", "C:\\uttamproject\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String baseURL = "https://letskodeit.teachable.com/p/practice";
		driver.get(baseURL);
		driver.findElement(By.xpath("/html//a[@id='opentab']")).click();
		// driver.findElement(By.id("name"));
	}
}
