package cn.gloryroad.webdriver.baseapi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
/**
 * �ÿ�ܵ����˼·������
 * 1����дһ��Webdriverbaseapi�࣬����WebDriver driver���󣬲�����ʵ����driver
 * 2����дһ��basePage�࣬����Webdriverbaseapi driver���󣬲�����ʵ���� driver
 * 3��дһ��HomePage�࣬�̳�basePage�࣬������ʵ����driver����super��driver�����ڸ�ҳ������У�д�����ҳ��ķ�����������ҳ����󲢴���driver
 * 4��д����ҳ������࣬�̳�basePage��������ʵ����driver��д��ҳ���и��ֲ���������ʱ����baseapi�еķ���
 * 5��дһ��BaseCase�࣬����WebDriver driver����д��beforeSuite������ָ��driverΪ�����driver��ͬʱд��InitWebdriverTest�̳�baseCase��
 * ��driver��ֵָ��Ϊfirefox��������󣬲�����baseCase���е�beforeSuite������ȡdriver��
 * 
 * @author CWB_PC
 *
 */
public class WebdriverBaseApi {
	
	private WebDriver driver;
	public WebdriverBaseApi(WebDriver driver){
		this.driver=driver;
		
	}
	
	/**
	 * rewrite the click method,click on the element to be find by By</BR>
	 * 
	 * @param by
	 * 	   the locator you want to find the element
	 * @param timeout
	 *    ��ʱʱ�䣬��λ����
	 */
	public void click(By by){
		driver.findElement(by).click();
	}
	/**
	 * @param by
	 * 
	 */
//	public void click(By by){
//		click(by,0);
//	}
	
	/**
	 * ��װ�������
	 * @param by
	 * @param text
	 */
	public void sendKeys(By by,String text){
		driver.findElement(by).sendKeys(text);
	}
	
	/**
	 * ��������
	 * @param by
	 * 
	 */
	public void clear(By by){
		driver.findElement(by).clear();
	}
	
}
