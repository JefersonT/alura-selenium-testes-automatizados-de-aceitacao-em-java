package br.com.alura.leilao.login;

import org.junit.jupiter.api.*;

public class LoginTest {

    private LoginPage loginPage;

    @BeforeAll
    public static void beforeAll() {

    }

    @BeforeEach
    public void beforeEach() {
        this.loginPage = new LoginPage();

    }

    @AfterEach
    public void afterEach(){
        loginPage.fechar();
    }

    @Test
    public void deveriaEfeturarLoginComDadosValidos(){
        loginPage.preencheFormularioLogin("fulano", "pass");
        loginPage.efetuaLogin();

        Assertions.assertFalse(loginPage.isPageLogin());
        Assertions.assertEquals("fulano", loginPage.getUsuarioLogado());
    }

    @Test
    public void naoDeveriaLogarComDadosInvalidos() {
        loginPage.preencheFormularioLogin("invalido", "123132");
        loginPage.efetuaLogin();

        Assertions.assertTrue(loginPage.isCurrentUrl("http://localhost:8080/login?error"));
        Assertions.assertTrue(loginPage.pageSourceContains("Usuário e senha inválidos."));
        Assertions.assertNull(loginPage.getUsuarioLogado());
    }

    @Test
    public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
        loginPage.navigateToPageLeiloes();

        Assertions.assertTrue(loginPage.isPageLogin());
        Assertions.assertFalse(loginPage.pageSourceContains("Dados do Leilão"));
    }
}
