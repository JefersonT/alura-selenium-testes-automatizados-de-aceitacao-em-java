package br.com.alura.leilao.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    public static final String URL_LOGIN = "http://localhost:8080/login";
    private WebDriver browser;

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver");
        browser = new ChromeDriver();
        browser.navigate().to(URL_LOGIN);
    }

    public void fechar() {
        browser.quit();
    }

    public void preencheFormularioLogin(String username, String password) {
        browser.findElement(By.id("username")).sendKeys(username);
        browser.findElement(By.id("password")).sendKeys(password);
    }

    public void efetuaLogin() {
        browser.findElement(By.id("login-form")).submit();
    }

    public boolean isPageLogin() {
        return browser.getCurrentUrl().equals(URL_LOGIN);
    }

    public String getUsuarioLogado() {
        try {
            return browser.findElement(By.id("usuario-logado")).getText();
        } catch (NoSuchElementException e) {
            return null;
        }
    }

    public boolean isCurrentUrl(String url) {
        return browser.getCurrentUrl().equals(url);
    }

    public boolean pageSourceContains(String text) {
        return browser.getPageSource().contains(text);
    }

    public void navigateToPageLeiloes() {
        this.browser.navigate().to("http://localhost:8080/leiloes/2");
    }
}
