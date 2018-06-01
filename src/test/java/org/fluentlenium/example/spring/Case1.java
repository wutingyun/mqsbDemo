package org.fluentlenium.example.spring;

import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.example.spring.page.FaSongLieBiaoAddPage;
import org.fluentlenium.example.spring.page.FaSongLieBiaoPage;
import org.fluentlenium.example.spring.page.LoginPage;
import org.fluentlenium.example.spring.page.MainPage;
import org.testng.annotations.Test;

public class Case1 extends ExampleFluentTest {
	String title;
	String content;
	
	@Page
	private LoginPage loginPage;//登录页面
	@Page
	private MainPage mainPage;//主页面
	@Page
	private FaSongLieBiaoPage fasongliebiaoPage;//发送列表
	@Page
	private FaSongLieBiaoAddPage fasongliebiaoAddPage; //发送列表  新增页面

	@Test
	public void visitGoogle() throws InterruptedException {

		//通过登录页面，输入用户名和密码，进入主页面。
		goTo(loginPage);
		loginPage.usernameTextIn("sqxcy001");
		//await().atMost(5, TimeUnit.SECONDS);
		//await().atMost(5, TimeUnit.SECONDS).until(el("#loginPage")).present();
               
		loginPage.passwordTextIn("123456");
		loginPage.loginButton();
		//await().atMost(5, TimeUnit.SECONDS).until("mainPage").present();
		
		mainPage.takeScreenShot("D:\\主页面.jpg");
		
		//在主页面，点击一级菜单通知公告，点击二级菜单发送列表。
		mainPage.clickTongZhiGongGao();
		//mainPage.wait(5);
		mainPage.clickFaSongLieBiao();
		
		//在发送列表页面，点击新增按钮		
		fasongliebiaoAddPage=fasongliebiaoPage.add(title,content);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
