package org.fluentlenium.example.spring.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/")
public class FaSongLieBiaoPage extends FluentPage {

	@FindBy(css = ".btn btn-default btn-sm")
	private FluentWebElement clickAddButton; // 在发送列表页面，点击 新增 按钮
	
	@FindBy(xpath = "//*[@id=\"divmaincontent\"]/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[2]")
	private FluentWebElement getTitle; // 在发送列表页面，获取标题
	
	@FindBy(xpath = "//*[@id=\"divmaincontent\"]/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[4]")
	private FluentWebElement getStatus;// 在发送列表页面，获取状态
	
	@FindBy(xpath = "//*[@id=\"divmaincontent\"]/section/div/div/div/div[2]/div/table/tbody/tr[2]/td[6]/a")
	private FluentWebElement clickChaKanButton;// 在发送列表页面，点击 查看 按钮
	
	@FindBy(name = "sname")
	private FluentWebElement inputTitle;// 在发送列表页面，右上角处查询框输入标题
	
	@FindBy(css = ".btn btn-sm btn-default")
	private FluentWebElement search;// 在发送列表页面，右上角处查询框输入标题后，点击查询

	@Page
	private FaSongLieBiaoAddPage fasongliebiaoAddPage; // 新增页面

	public FaSongLieBiaoAddPage add(String title, String content) {
		// clickAddButton.click();
		window().clickAndOpenNew(clickAddButton);

		return fasongliebiaoAddPage;
	}

	// FluentWebElement getWrappedElement()获得org.openqa.selenium.WebElement 这个是
	// 原生的WebElement对象 和原来的操作一样
	// FluentWebElement是包装了WebElement的对象 增加了额外方法
	public String getTitle() {
		return getTitle.text();
	}

}
