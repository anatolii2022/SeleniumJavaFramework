import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.google.de/?hl=de");
		driver.close();
	}
}
