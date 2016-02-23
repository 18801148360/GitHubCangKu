package cn.gloryroad.webdriver.testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;
import cn.gloryroad.webdriver.basecase.WebdriverBaseCase;

public class InitWebdriverTest extends WebdriverBaseCase {
	
	
	@BeforeSuite
	public void beforeTestSuite(){
		//���������driver
		
		System.setProperty("webdriver.firefox.bin","C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://192.168.1.11/ug/");
		
		//��ȡdriverʵ��������
		beforeSuite();
		
		
	}
	
	/**
	 * static��������ֻ����һ��ʵ��driver�����ⲿ����
	 * @return
	 */
	public static WebDriver getWebDriver(){
		return driver;
	}
	
}
