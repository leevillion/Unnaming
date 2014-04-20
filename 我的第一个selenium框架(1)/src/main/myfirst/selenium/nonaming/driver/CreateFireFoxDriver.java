package myfirst.selenium.nonaming.driver;
/**
 * @author leshuo
 * @version 2014Äê4ÔÂ20ÈÕ
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateFireFoxDriver implements ICreateDriver{
	private WebDriver driver;
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		System.setProperty ( "webdriver.firefox.bin" , "D:\\Program Files\\firefox\\firefox.exe" );
		driver = new FirefoxDriver();
		return driver;
	}

}
