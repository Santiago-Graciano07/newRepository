package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/talosdigital/Downloads/chromedriver 2");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

	}

}
