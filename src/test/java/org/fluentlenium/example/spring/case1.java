package org.fluentlenium.example.spring;

import java.util.concurrent.TimeUnit;

import org.fluentlenium.adapter.junit.After;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.hook.wait.Wait;
import org.fluentlenium.example.spring.page.FaSongLieBiaoPage;
import org.fluentlenium.example.spring.page.LoginPage;
import org.fluentlenium.example.spring.page.MainPage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Wait(timeout = 5, timeUnit = TimeUnit.SECONDS)
public class case1 extends ExampleFluentTest {
	String title;
	String content;

	@Page
	private LoginPage loginPage;// 登录页面
	@Page
	private MainPage mainPage;// 主页面
	@Page
	private FaSongLieBiaoPage fasongliebiaoPage;// 发送列表
	
	@BeforeTest
	public void beforeTest() {

		title="通知公告标题180602-001";
		content="通知公告内容180602-001";
	}

	@Test
	public void noticeCase01() {
		try{
			// 通过登录页面，输入用户名和密码，进入主页面。
			goTo(loginPage);
			loginPage.usernameTextIn("sqxcy001");
			loginPage.passwordTextIn("123456");
			loginPage.loginButton();
			
			

			// 在主页面，点击一级菜单通知公告，点击二级菜单发送列表。
			mainPage.clickTongZhiGongGao();
			mainPage.clickFaSongLieBiao();

			// 在发送列表页面，新增通知公告
			fasongliebiaoPage.add(title, content);
			
			//公告添加完成之后，输入标题，点击查询
			fasongliebiaoPage.selectByTitle(title);
			//将查询出来的结果，提取该名称
			String newTitle=fasongliebiaoPage.getTitle();
			//将新增的标题与查询出来的标题一致，则说明新增成功。
			Assert.assertEquals(newTitle, title,"通知公告新增不成功");
		}catch(Exception e){
			takeScreenShot("D:\\主页面.jpg");
			takeHtmlDump("D:\\error.html");
			throw e;
		}
		
	
		
	}

	@AfterTest
	public void afterTest() {
 
		
		
	}
}
