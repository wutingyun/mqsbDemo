package org.fluentlenium.example.spring.page;

import org.fluentlenium.core.FluentPage;
import org.fluentlenium.core.annotation.Page;
import org.fluentlenium.core.annotation.PageUrl;
import org.fluentlenium.core.domain.FluentWebElement;
import org.openqa.selenium.support.FindBy;

@PageUrl("/login")
public class LoginPage extends FluentPage {
    @FindBy(name = "username")
    private FluentWebElement usernameInput;
    @FindBy(name = "password")
    private FluentWebElement passwordInput;
    @FindBy(className = "login-button")
    private FluentWebElement loginButton;
    
    @Page
    private MainPage mainPage;
    public LoginPage usernameTextIn(String text) {
    	usernameInput.clear();
    	usernameInput.write(text);
        return this;
    }
    public LoginPage passwordTextIn(String text) {
    	passwordInput.clear();
    	passwordInput.write(text);
        return this;
    }

    public MainPage loginButton() {
    	loginButton.click();
    	
        return mainPage;
    }
}
