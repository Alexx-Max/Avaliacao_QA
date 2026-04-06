package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPO extends BasePO{

    @FindBy(id = "user-name")
    public WebElement inputEmail;

    @FindBy(id = "password")
    public WebElement inputSenha;

    @FindBy(id = "login-button")
    public WebElement buttonEntrar;

    @FindBy(xpath = "//h3[@data-test='error']")
    public WebElement spanMensagem;

    @FindBy(xpath = "//button[@class='error-button']//*[name()='svg']")
    public WebElement fecharSpan;

    public void fecharMensagemErro(){
        fecharSpan.click();
    }

    public String obterMensagem(){

        return spanMensagem.getText();
    }

    public LoginPO(WebDriver driver) {
        super(driver);

    }

    public void executarAcaoDeLogar(String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        buttonEntrar.click();
    }


}
