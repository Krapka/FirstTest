package automationFramework;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTestCase {

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.test3.netri.org");
		driver.get("http://www.test3.netri.org/individual-order/large");

		// Choose "ٳ������ ������"
		WebElement paperDensityEl = driver.findElement(By.id("paperType"));

		List<WebElement> options = paperDensityEl.findElements(By.tagName("option"));

		for (WebElement option : options) {

			if (option.getText().equals("����������� ���� 250 ��/�2")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "�����"
		WebElement paperEditionEl = driver.findElement(By.id("printingQuantitySelect"));

		List<WebElement> options1 = paperEditionEl.findElements(By.tagName("option"));

		for (WebElement option : options1) {

			if (option.getText().equals("3000")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "�����"
		WebElement paperFormatEl = driver.findElement(By.id("format_4"));
		paperFormatEl.click();
		// End

		// Choose "��������� ������_1"
		WebElement laminationEl = driver.findElement(By.name("postPress_1"));

		List<WebElement> options2 = laminationEl.findElements(By.tagName("option"));

		for (WebElement option : options2) {

			if (option.getText().equals("������ �������� 1+0")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_2"
		WebElement roundingEl = driver.findElement(By.name("postPress_2"));

		List<WebElement> options3 = roundingEl.findElements(By.tagName("option"));

		for (WebElement option : options3) {

			if (option.getText().equals("������������ ����")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_3"
		WebElement creasingEl = driver.findElement(By.name("postPress_3"));

		List<WebElement> options4 = creasingEl.findElements(By.tagName("option"));

		for (WebElement option : options4) {

			if (option.getText().equals("4 ���")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_4"
		WebElement fillisterEl = driver.findElement(By.name("postPress_4"));

		List<WebElement> options5 = fillisterEl.findElements(By.tagName("option"));

		for (WebElement option : options5) {

			if (option.getText().equals("2 ������")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_5"
		WebElement perforationEl = driver.findElement(By.name("postPress_5"));

		List<WebElement> options6 = perforationEl.findElements(By.tagName("option"));

		for (WebElement option : options6) {

			if (option.getText().equals("7 �������")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_6"
		WebElement cuttingEl = driver.findElement(By.name("postPress_6"));

		List<WebElement> options7 = cuttingEl.findElements(By.tagName("option"));

		for (WebElement option : options7) {

			if (option.getText().equals("1 ��")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "��������� ������_7"
		WebElement boringEl = driver.findElement(By.name("postPress_7"));

		List<WebElement> options8 = boringEl.findElements(By.tagName("option"));

		for (WebElement option : options8) {

			if (option.getText().equals("2 ������")) {
				option.click();
				break;
			}
		}

		// End

		// Choose "�����"
		WebElement radioButtontEl = driver.findElement(By.id("url_option"));
		radioButtontEl.click();
		// End

		// Upload image
		WebElement maket = driver.findElement(By.id("urlFrontSide"));
		maket.sendKeys(
				"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSGsO-zd40r_JG8PMB-DrE_jXnhsiV8VDDT6GEXStDambxrAdYZizeMY8WH");

		WebElement orderName = driver.findElement(By.id("MargorderName"));
		orderName.sendKeys("Test");
		// End

		// Choose delivery city
		WebElement deliveryCityEl = driver.findElement(By.id("deliveryCity"));

		List<WebElement> options9 = deliveryCityEl.findElements(By.tagName("option"));

		for (WebElement option : options9) {

			if (option.getText().equals("���")) {
				option.click();
				break;
			}
		}
		// End

		// Choose delivery post
		WebElement deliveryPostEl = driver.findElement(By.id("deliveryPost"));

		List<WebElement> options10 = deliveryPostEl.findElements(By.tagName("option"));

		for (WebElement option : options10) {

			if (option.getText()
					.equals("³������� �30 (�� 30 �� �� ���� ����): ���. ������������, 14 (������� ��)")) {
				option.click();
				break;
			}
		}
		// End

		// Enter comment
		WebElement commentText = driver.findElement(By.name("orderComment"));
		commentText.sendKeys("������, �����, ������ � ���������!");
		// End

		// Personal info
		WebElement userFirstName = driver.findElement(By.name("userFirstName"));
		userFirstName.sendKeys("��������");

		WebElement userPhone = driver.findElement(By.name("userPhone"));
		userPhone.sendKeys("+380636845572");

		WebElement userSecondPhoneEl = driver.findElement(By.name("userSecondPhone"));
		userSecondPhoneEl.sendKeys("0444408517");

		// End

		//

		List<WebElement> userMail = driver.findElements(By.name("email"));

		for (WebElement option : userMail) {
			
			if (option.isDisplayed()) {
				option.sendKeys("anastasia.toporovska@netri.org");
			}
		}
		//
		
		// Order
		WebElement buttonOrderEl = driver.findElement(By.name("buttonOrderSubmit"));
		buttonOrderEl.click();
		// End
		
		// driver.quit();
		
	}

}