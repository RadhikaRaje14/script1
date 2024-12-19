package NewScripts;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testcase1 {
	@Test
	public void launch()
	{
		WebDriverManager.firefoxdriver().setup();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.close();
			
	}

}
