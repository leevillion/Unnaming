package myfirst.selenium.nonaming.driver;
/**
 * @author leshuo
 * @version 2014Äê4ÔÂ20ÈÕ
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;

public class CreateIEDriver implements ICreateDriver{
	private WebDriver driver;
	public WebDriver createDriver() {
		// TODO Auto-generated method stub
		System.setProperty ( InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY , 
						"D:\\workspace\\selenium\\src\\resource\\IEDriverServer.exe");
		DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
	/**
	public WebDriver createDriver(String[] IEOptions) {
		// TODO Auto-generated method stub
		System.setProperty ( InternetExplorerDriverService.IE_DRIVER_EXE_PROPERTY , 
						"D:\\workspace\\selenium\\src\\resource\\IEDriverServer.exe");
		DesiredCapabilities capabilities =DesiredCapabilities.internetExplorer();
		//for(String IEOption:IEOptions)
			//capabilities.setCapability(IEOption,true);
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,
				true);
		driver = new InternetExplorerDriver(capabilities);
		return driver;
	}
	*/

}
