package interviewQnA;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAscendingDescending {

	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		Select ele = new Select(driver.findElement(By.id("select-demo")));
		List<WebElement> dd_list = ele.getOptions();
		List<String> myList = new ArrayList<>();

		for (WebElement el : dd_list) {
			myList.add(el.getText());
		}

		// sort ascending
		Collections.sort(myList);
		System.out.println(myList);

		// sort descending
		Collections.reverse(myList);
		System.out.println(myList);

		driver.quit();
	}

}
