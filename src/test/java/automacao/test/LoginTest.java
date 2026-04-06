package automacao.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import PageObject.LoginPO;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class LoginTest extends BaseTest {

    private static LoginPO loginPage;


    @Before
    public void prepararTestes(){
        loginPage = new LoginPO(driver);
    }


    @Test
    public void TCC01_LOGIN_COM_CAMPOS_VAZIOS(){
        loginPage.executarAcaoDeLogar("","");
        String mensagem = loginPage.obterMensagem();
        assertEquals("Epic sadface: Username is required", mensagem);
        loginPage.fecharMensagemErro();
  }
    @Test
    public void TCC02_LOGIN_COM_EMAIL_CERTO_E_SENHA_INCORRETA(){
        loginPage.executarAcaoDeLogar("standard_user","1234 ");
        String mensagem = loginPage.obterMensagem();
        assertEquals("Epic sadface: Username and password do not match any user in this service", mensagem);
        loginPage.fecharMensagemErro();
    }

    @Test
    public void TCC03_LOGIN_COM_EMAIL_INCORRETO_E_SENHA_CORRETO(){
        loginPage.executarAcaoDeLogar("teste@123","secret_sauce");
        String mensagem = loginPage.obterMensagem();
        loginPage.fecharMensagemErro();
    }
    @Test
    public void TCC04_LOGIN_VALIDO(){
        loginPage.executarAcaoDeLogar("standard_user","secret_sauce");
        assertEquals("Swag Labs", loginPage.obterTituloPagina().trim());
    }
}

