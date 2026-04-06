package automacao.test;

import PageObject.PaginaInicialPO;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import static org.junit.Assert.assertEquals;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class PaginaInicialTest extends BaseTest{
    private static PaginaInicialPO PaginaInicialPage;

    @Before
    public void prepararTestes(){
        PaginaInicialPage = new PaginaInicialPO(driver);
    }

    @Test
    public void TCC01_LOGIN_VALIDO(){
        PaginaInicialPage.executarAcaoDeLogar("standard_user","secret_sauce");
        assertEquals("Swag Labs", PaginaInicialPage.obterTituloPagina().trim());
    }

    @Test
    public void TCC02_BOTAO_ORDERNAR(){
    PaginaInicialPage.ordenar.click();
    assertEquals("Sauce Labs Backpack", PaginaInicialPage.pegarNomeProduto());
    }

    @Test
    public void TCC03_BOTAO_ADICIONAR_PRODUTO_AO_CARRINHO(){
        PaginaInicialPage.ordenar.click();
        PaginaInicialPage.clicarNoProduto();
        PaginaInicialPage.adicionarProduto();
        assertEquals("Sauce Labs Backpack", PaginaInicialPage.obterMensagemProduto());
    }

    @Test
    public void TCC04_CARRINHO(){
        PaginaInicialPage.carrinhoCompra.click();
        assertEquals("Checkout", PaginaInicialPage.obterMsgCarrinho());
    }

    @Test
    public void TCC05_CHECKOUT(){
        PaginaInicialPage.clicarCheckout.click();
    assertEquals("Checkout: Your Information", PaginaInicialPage.infoCheckout());
    }

    @Test
    public void TCC06_CHECKOUT_COM_NOME(){
        PaginaInicialPage.cadastrar("alex", "", "");
        assertEquals("Error: Last Name is required", PaginaInicialPage.msgErro());
    }

    @Test
    public void TCC07_CHECKOUT_COM_ULTIMO_NOME(){
        PaginaInicialPage.fecharMensagemErro();
        PaginaInicialPage.cadastrar("", "max", "");
        assertEquals("Error: Postal Code is required", PaginaInicialPage.msgErro());
    }

    @Test
    public void TCC08_CHECKOUT_COM_CEP(){
        PaginaInicialPage.fecharMensagemErro();
        PaginaInicialPage.cadastrar("", "", "09974180");
    }

}
