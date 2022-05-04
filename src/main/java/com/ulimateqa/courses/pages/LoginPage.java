package com.ulimateqa.courses.pages;

import com.ulimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {


    By welcomeText = By.xpath("//h1[contains(text(),'Welcome Back!')]");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By loginButton = By.xpath("//body/main[@id='main-content']/div[1]/div[1]/article[1]/form[1]/div[4]/input[1]");
    By errorMessage = By.xpath("//li[contains(text(),'Invalid email or password.')]");


    public String getWelcomeText(){
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email){
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password){
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getErrorMessage(){
        return getTextFromElement(errorMessage);
    }
}
