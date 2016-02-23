package cn.gloryroad.testcase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;
import cn.gloryroad.webdriver.basecase.WebdriverBaseCase;
import cn.gloryroad.pageobjects.*;

public class LogonTest extends WebdriverBaseCase {
	private LoginPage LoginPage;
	private HomePage HomePage;
	protected WebdriverBaseApi webDriver;
	
	@BeforeClass
	public void beforeClassTest(){
		webDriver=new WebdriverBaseApi(driver);
	}
	@Test
	public void testLogin(){
		HomePage=new HomePage(webDriver);
		LoginPage=HomePage.goLoginPage();
		HomePage=LoginPage.loginOK("18700000000", "Lwx123456");
		
	}
	
	
}
