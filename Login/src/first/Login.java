package first;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {
	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files (x86)\\Mozilla Firefox\\firefox.exe");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Ananyakrishna\\Desktop\\Selenium\\Selenium jars\\firfox_dr\\geckodriver.exe");
		// asljlksajlkasjglkasj
		// objects and variables instantiation

		WebDriver driver = new FirefoxDriver();
		String appUrl = "https://www.facebook.com/";
		// launch the firefox browser and open the application url
		driver.get(appUrl);
		// maximize the browser window
		driver.manage().window().maximize();
		// declare and initialize the variable to store the expected title of the webpage.
		String expectedTitle = "Facebook-log in or sign up";
		// fetch the title of the web page and save it into a string variable
		String actualTitle = driver.getTitle();
		// compare the expected title of the page with the actual title of the page and print the result
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Verification Successful - The correct title is displayed on the web page.");

		} else {
			System.out.println("Verification Failed - An incorrect title is displayed on the web page.");
		}

		// enter a valid username in the email textbox
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("facebook username");
		// enter a valid password in the password textbox
		WebElement password = driver.findElement(By.id("pass"));
		password.clear();
		password.sendKeys("facebook Password");
		// click on the Sign in button
		WebElement signIn = driver.findElement(By.id("loginbutton"));
		signIn.click();
		// close the web browser
		driver.close();
		System.out.println("Test script executed successfully.");

	}

}