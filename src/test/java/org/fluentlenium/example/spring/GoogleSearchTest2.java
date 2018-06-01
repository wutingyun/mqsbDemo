package org.fluentlenium.example.spring;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.example.spring.page.MainPage;
import org.fluentlenium.example.spring.page.ResultsPage;

public class GoogleSearchTest2 extends ExampleFluentTest {
	@Page
	private MainPage mainPage;

	/*@org.testng.annotations.Test
	public void visitGoogle() {

		ResultsPage resultsPage = goTo(mainPage).typeTextIn("TEST").startSearch();
		resultsPage.waitForResults();
		resultsPage.takeScreenShot("D:\\test.jpg");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
}
