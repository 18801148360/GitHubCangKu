package cn.gloryroad.webdriver.basecase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;

import cn.gloryroad.webdriver.testcase.InitWebdriverTest;

public class WebdriverBaseCase {
	protected static WebDriver driver;

	public void beforeSuite(){
		driver=InitWebdriverTest.getWebDriver();
	}
}
