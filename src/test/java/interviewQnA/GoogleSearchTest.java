package interviewQnA;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchTest {

	static WebDriver driver;

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(60));
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("COVID-19", Keys.ENTER);

		List<WebElement> tabs = driver.findElements(By.xpath(".//a[@class='hide-focus-ring']"));

		for (WebElement tab : tabs) {
			if (tab.getText().trim().contains("News")) {
				tab.click();
				break;
			}
		}

		List<WebElement> agencies = driver.findElements(By.xpath(".//div[@class='XTjFC WF4CUc']"));

		List<String> agy_names = new ArrayList<>();

		for (WebElement ele : agencies) {
			agy_names.add(ele.getText().trim());
		}

		if (agy_names.size() < 3) {
			System.out.println("Missing Leading News Agencies");
		} else {
			for (String agy : agy_names) {
				System.out.println(agy);
			}
		}

		driver.quit();
	}

}
