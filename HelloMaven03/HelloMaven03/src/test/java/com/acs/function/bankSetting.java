package com.acs.function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class bankSetting {
	
	public void visaswitch (WebDriver driver, boolean isVisaswitch) {
		if (isVisaswitch)
			driver.findElement(By.id("visaSwitch1")).click();
		else
			driver.findElement(By.id("visaSwitch2")).click();
	}
	
	public void masterswitch (WebDriver driver, boolean isMasterswitch) {
		if (isMasterswitch)
			driver.findElement(By.id("mastercardSwitch1")).click();
		else
			driver.findElement(By.id("mastercardSwitch2")).click();
	}
	
	public void jcbswitch (WebDriver driver, boolean isJcbswitch) {
		if (isJcbswitch)
			driver.findElement(By.id("jcbSwitch1")).click();
		else
			driver.findElement(By.id("jcbSwitch2")).click();
	}
	
	public void amexswitch (WebDriver driver, boolean isAmexswitch) {
		if (isAmexswitch)
			driver.findElement(By.id("amexSwitch1")).click();
		else
			driver.findElement(By.id("amexSwitch2")).click();
	}
	
	public void pswdMode (WebDriver driver, String i) {
		if(i.equals("1"))
			driver.findElement(By.id("pswdMode1")).click();
		if(i.equals("2"))
			driver.findElement(By.id("pswdMode2")).click();
		if(i.equals("3"))
			driver.findElement(By.id("pswdMode3")).click();
	}

}
