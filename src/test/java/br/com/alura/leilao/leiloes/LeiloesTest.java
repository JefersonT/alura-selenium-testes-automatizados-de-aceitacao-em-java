package br.com.alura.leilao.leiloes;

import br.com.alura.leilao.login.LoginPage;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LeiloesTest {

    private LeiloesPage leiloesPage;
    private CadastroLeilaoPage cadastroLeilaoPage;

    @BeforeEach
    public void beforeEach() {
        LoginPage loginPage = new LoginPage();
        loginPage.preencheFormularioLogin("fulano", "pass");
        this.leiloesPage = loginPage.efetuaLogin();
        this.cadastroLeilaoPage = leiloesPage.carregarFormulario();
    }

    @AfterEach
    public void afterEach(){
        leiloesPage.fechar();
    }

    @Test
    public void deveriaCadastrarLeilao() {
        String hoje = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String nome = "Leilão do dia "+hoje;
        String valor = "500.00";

        this.leiloesPage = this.cadastroLeilaoPage.cadastrarLeilao(nome, valor, hoje);

        Assertions.assertTrue(leiloesPage.isLeilaoCadastrado(nome, valor, hoje));
    }

    @Test
    public void deveriaValidarCadastroDeLeilao(){
        this.leiloesPage = this.cadastroLeilaoPage.cadastrarLeilao("", "", "");


        Assertions.assertFalse(this.cadastroLeilaoPage.isPaginaAtual());
        Assertions.assertTrue(this.leiloesPage.isPaginaAtual());
        Assertions.assertTrue(this.cadastroLeilaoPage.isMensagensDeValidacaoVisiveis());
    }

}
