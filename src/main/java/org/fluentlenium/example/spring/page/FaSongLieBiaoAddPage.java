package org.fluentlenium.example.spring.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

public class FaSongLieBiaoAddPage extends FluentPage{

	@FindBy(id = "title")
	private FluentWebElement inputTitle; // 在通知公告添加页面，新增标题。
	
	@FindBy(id = "content")
	private FluentWebElement inputContent;// 在通知公告添加页面，新增内容。
	
	@FindBy(css = ".input-group-addon")
	private FluentWebElement clickSelectAccepter;//在通知公告添加页面，在接收者处,点击“选择”。
	
	@FindBy(id = "treeUlSub_1_span")
	private FluentWebElement SelectAccepters;//在选择接收者页面，点击第一个“所有人”。
	
	@FindBy(css = ".btn btn-primary")
	private FluentWebElement confirmSelectAccepters;//在选择接收者页面，点击第一个“所有人”后，点击“确定”。
	
	@FindBy(css = ".btn btn-primary")
	private FluentWebElement clickKeep;//在通知公告添加页面，点击“保存”。
	
	@Page
	private FaSongLieBiaoPage fasongliebiaoPage; // 新增    发送列表
	
	public FaSongLieBiaoPage add(){
		
		return fasongliebiaoPage;
	}
	
}
