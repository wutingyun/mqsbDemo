package org.fluentlenium.example.spring;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.example.spring.page.MainPage;
import org.fluentlenium.example.spring.page.ResultsPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest3 extends ExampleFluentTest {
	@Page
	private MainPage mainPage;

	/*// �����������
	@DataProvider(name = "search")
	public Object[][] Users() {
		return new Object[][] { { "java" }, { "page object" }, { "testNG" } };
	}

	@Test(dataProvider = "search")
	public void testCase(String search) throws Exception {
		ResultsPage resultsPage = goTo(mainPage).typeTextIn(search)
				.startSearch();
		resultsPage.waitForResults();
		resultsPage.takeScreenShot("D:\\" + search + ".jpg");
		Thread.sleep(2000);
	}*/

}
