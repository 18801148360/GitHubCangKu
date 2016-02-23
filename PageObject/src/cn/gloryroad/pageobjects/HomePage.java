package cn.gloryroad.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;

public class HomePage extends BasePage{
	
	public HomePage(WebdriverBaseApi driver){

		super(driver);
	}
	
	/**
	 * 进入登录界面
	 * @return
	 */
	public LoginPage goLoginPage(){
		driver.click(By.xpath("//a[text()='登录']"));
		return new LoginPage(driver);
	}
	
	/**
	 * 进入基础信息页面
	 * 
	 * @return
	 */
	public JiChuPage goJiChuPage(){
		driver.click(By.xpath("//p[text()='基础信息']"));
		return new JiChuPage(driver);
	}
	
	/**
	 * 进入票据加工页面
	 *  
	 * @return 
	 */
	public PiaoJuPage goPiaoJuPage(){
		driver.click(By.xpath("//p[text()='票据加工']"));
		return new PiaoJuPage(driver);
	}
}
