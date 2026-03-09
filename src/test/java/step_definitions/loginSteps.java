package step_definitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.cucumber.java.en.*;



public class loginSteps {

	WebDriver driver;
	

	@Given("I access the DemoBlaze webpage")
	public void openWebsite() {
  
		ChromeOptions options = new ChromeOptions();
    	options.addArguments("--headless=new");
    	options.addArguments("--no-sandbox");
    	options.addArguments("--disable-dev-shm-usage");

    	driver = new ChromeDriver(options);

    	driver.manage().window().maximize();
    	driver.get("https://www.demoblaze.com");

	}

	@When("I click on login menu")
	public void clickLoginMenu() {

		  driver.findElement(By.id("login2")).click();
	}

	@And("I enter username {string}")
	public void enterUsername(String user) {
		driver.findElement(By.id("loginusername")).sendKeys(user);
	}

	@And("I enter password {string}")
	public void enterPassword(String pass) {

	    driver.findElement(By.id("loginpassword")).sendKeys(pass);
	}

	@And("I click on login button")
	public void clickLogin() {

		 driver.findElement(By.xpath("//button[text()='Log in']")).click();
	}

	@Then("I verify the title")
	public void verifyTitle() {
     	 String title = driver.getTitle();
		 System.out.println(title);
		driver.quit();
	}

}
