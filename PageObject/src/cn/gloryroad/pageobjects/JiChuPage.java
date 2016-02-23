package cn.gloryroad.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import cn.gloryroad.webdriver.baseapi.WebdriverBaseApi;

public class JiChuPage extends BasePage{	
	
	public JiChuPage(WebdriverBaseApi driver){
		super(driver);
	}
	
	/**
	 * �޸Ļ�����Ϣ����ҵ��ϵ��
	 * @param lianxiren
	 * 
	 */
	public void bianjiqiye(String lianxiren){
		driver.clear(By.xpath("//span[text()='��ҵ��ϵ��']/input"));
		driver.sendKeys(By.xpath("//span[text()='��ҵ��ϵ��']/input"), lianxiren);
		driver.click(By.xpath("//button[text()='��  ��']"));
	}
}
