import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

public class NewTest {

	public WebDriver driver;
	public Actions action;

	String baseURL = "https://cakeshopowner.000webhostapp.com/cake/cakeshop1.html";

	@BeforeTest
	public void startBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(baseURL);
		action = new Actions(driver);
		driver.manage().window().maximize();
	}

	public WebElement regBtn;
	// Admin Registeration
	@Test
	public void Test1() throws InterruptedException {

		regBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[2]"));
		action.moveToElement(regBtn).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[2]")).click();
		Thread.sleep(500);
		driver.findElement(By.name("email1")).sendKeys("damodar5dikonda@gmail.com"); 
		Thread.sleep(500); 
		driver.findElement(By.name("pw1")).sendKeys("xyz1234");
		Thread.sleep(500);
		driver.findElement(By.name("pw2")).sendKeys("xyz1234");
		Thread.sleep(500);
		driver.findElement(By.className("registerbtn")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();

		driver.findElement(By.name("email1")).clear();
		driver.findElement(By.name("pw1")).clear();
		driver.findElement(By.name("pw2")).clear();
	}

	// Trying to re-register an admin
	@Test
	public void Test2() throws InterruptedException {

		driver.findElement(By.name("email1")).sendKeys("damodar5dikonda@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("pw1")).sendKeys("xyz1234");
		Thread.sleep(500);
		driver.findElement(By.name("pw2")).sendKeys("xyz1234");
		Thread.sleep(500);
		driver.findElement(By.className("registerbtn")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
	}
// Login for Admin
	public WebElement loginBtn;

	@Test
	public void Test3() throws InterruptedException {

		loginBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]"));
		action.moveToElement(loginBtn).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]")).click();
		driver.findElement(By.name("email2")).sendKeys("damodar5gmacom");
		Thread.sleep(500);
		driver.findElement(By.name("psw2")).sendKeys("xyz14");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();

		driver.findElement(By.name("email2")).clear();
		driver.findElement(By.name("psw2")).clear();

	}

	// Login with Dummy credential
	@Test
	public void Test4() throws InterruptedException {

		driver.findElement(By.name("email2")).sendKeys("damodar5dikonda@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.name("psw2")).sendKeys("xyz1234");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"login\"]/button")).click();
		Thread.sleep(500);

	}
	// Adding customers data
	public WebElement addBtn;

	@Test
	public void Test5() throws InterruptedException {

		addBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[2]"));
		action.moveToElement(addBtn).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[2]")).click();
		driver.findElement(By.name("name1")).sendKeys("Avinash Pujari");
		Thread.sleep(500);
		driver.findElement(By.name("dob1")).sendKeys("2/28");
		Thread.sleep(500);
		driver.findElement(By.name("mail1")).sendKeys("Apujari@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"add\"]/button")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();

		driver.findElement(By.name("name1")).clear();
		driver.findElement(By.name("dob1")).clear();
		driver.findElement(By.name("mail1")).clear();

	}
	// again adding that customers data
	@Test
	public void Test6() throws InterruptedException {

		driver.findElement(By.name("name1")).sendKeys("Avinash Pujari");
		Thread.sleep(500);
		driver.findElement(By.name("dob1")).sendKeys("02/08");
		Thread.sleep(500);
		driver.findElement(By.name("mail1")).sendKeys("Apujari@gmail.com");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"add\"]/button")).click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();

	}

	// Show information of all customers
	public WebElement viewBtn;

	@Test
	public void Test7() throws InterruptedException {

		viewBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[6]"));
		action.moveToElement(viewBtn).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"view\"]/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/h1/a")).click();
		Thread.sleep(500);
	}

	public WebElement todayBtn;
	// To check birth day date
	@Test
	public void Test8() throws InterruptedException {
		todayBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[4]"));
		action.moveToElement(todayBtn).perform();
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[4]")).click();
		driver.findElement(By.xpath("//*[@id=\"today\"]/input[1]")).sendKeys("23/04");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"today\"]/button")).click();
		Thread.sleep(500);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//*[@id=\"today\"]/input[1]")).clear();
	}
	// To check Birth day date
	@Test
	public void Test9() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"today\"]/input[1]")).sendKeys("02/08");
		Thread.sleep(500);
		driver.findElement(By.xpath("//*[@id=\"today\"]/button")).click();
		Thread.sleep(500);
		driver.findElement(By.xpath("/html/body/h1/a")).click();
		
		Thread.sleep(1500);
	}
	
	// Send the mail regarding discount 
	 public WebElement sendBtn;
	 @Test(priority = 1, alwaysRun = true) 
	  public void Test10() throws InterruptedException {
		  
		    sendBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[5]"));
			action.moveToElement(sendBtn).perform();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send\"]/input[1]")).sendKeys("02/08");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send\"]/input[2]")).sendKeys("Avinash Pune");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send\"]/input[3]")).sendKeys("Strawberry");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send\"]/input[4]")).sendKeys("20%");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"send\"]/button")).click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();

	  }
	  //Deleting an account
	  public WebElement deleteBtn;
	  @Test(priority = 2, alwaysRun = true) 
	  public void Test11() throws InterruptedException { 

		    deleteBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]"));
			action.moveToElement(deleteBtn).perform();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[1]")).sendKeys("Saurabh Singh");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[2]")).sendKeys("11/11");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"delete\"]/button")).click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
			
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[1]")).clear();
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[2]")).clear();
		  
			}
	  
	  // Deleting an Account
	  @Test(priority = 3, alwaysRun = true) 
	  public void Test12() throws InterruptedException { 

		    deleteBtn = driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]"));
			action.moveToElement(deleteBtn).perform();
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"myTopnav\"]/a[3]")).click();
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[1]")).sendKeys("Avinash Pujari");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"delete\"]/input[2]")).sendKeys("02/08");
			Thread.sleep(1500);
			driver.findElement(By.xpath("//*[@id=\"delete\"]/button")).click();
			Thread.sleep(1500);
			driver.switchTo().alert().accept();
		  
	  }
	// Logout Button
	 @Test(priority = 4, alwaysRun = true) 
	public void Test13() throws InterruptedException {
	
		WebElement logoutBtn = driver.findElement(By.linkText("Logout"));
		action.moveToElement(logoutBtn).perform();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1500);
	
	}
	  
	  @AfterTest
public void terminate() {
		  driver.close();
	  System.out.println("Testing successfull");
	  }
	  
	 

}
