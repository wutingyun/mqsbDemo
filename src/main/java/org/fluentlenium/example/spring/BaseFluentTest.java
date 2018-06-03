package org.fluentlenium.example.spring;

import org.fluentlenium.adapter.testng.FluentTestNg;
import org.fluentlenium.example.spring.config.BrowserConfig;
import org.fluentlenium.example.spring.config.SeleniumBrowserConfigProperties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseFluentTest extends FluentTestNg{

	SeleniumBrowserConfigProperties config =new SeleniumBrowserConfigProperties();

	@Override
	public WebDriver newWebDriver() {
		BrowserConfig browserConfig = getBrowserConfig();
		return browserConfig.resolveDriver(browserConfig);
	}
	
	@Override
	public String getBaseUrl() {
		return config.getPageUrl();
	}

	private BrowserConfig getBrowserConfig() {
		return config.getBrowserConfig();
	}

	public static void main(String[] args) {
		BaseFluentTest exampleFluentTest = new BaseFluentTest();
		System.out.println(exampleFluentTest.getBaseUrl());
	//	System.out.println(exampleFluentTest.newWebDriver());
	}

}
