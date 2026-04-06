package PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PaginaInicialPO extends BasePO{

    @FindBy(id = "user-name")
    public WebElement inputEmail;

    @FindBy(id = "password")
    public WebElement inputSenha;

    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    public WebElement clicarProduto;

    @FindBy(id = "add-to-cart")
    public WebElement adicionarProduto;

    @FindBy(xpath = "//a[@class='shopping_cart_link']")
    public WebElement carrinhoCompra;

    @FindBy(id = "login-button")
    public WebElement buttonEntrar;

    @FindBy(id = "checkout")
    public WebElement clicarCheckout;

    @FindBy (css = ".inventory_details_name.large_size")
    public WebElement obterMensagem;

    @FindBy (id = "checkout")
    public WebElement obterMsgCarrinho;

    @FindBy(css = ".title")
    public WebElement infoCheckout;

    @FindBy (xpath = "//select[@class='product_sort_container']")
    public WebElement ordenar;

    @FindBy (xpath = "//div[normalize-space()='Sauce Labs Backpack']")
    public WebElement pegarNomeProduto;

    @FindBy (id = "first-name")
    public WebElement inputNome;

    @FindBy (id = "last-name")
    public WebElement inputUltimoNome;

    @FindBy (id = "postal-code")
    public WebElement inputCep;

    @FindBy (id = "continue")
    public WebElement botaoContinuar;

    @FindBy (xpath = "//h3[@data-test='error']")
    public WebElement msgErro;

    @FindBy(xpath = "//button[@class='error-button']//*[name()='svg']//*[name()='path' and contains(@fill,'currentCol')]")
    public WebElement fecharSpan;

    public void fecharMensagemErro(){
        fecharSpan.click();
    }

    public String msgErro(){
     return msgErro.getText();
    }

    public void ordenar(){
        ordenar.click();
    }
    public String pegarNomeProduto(){
        return pegarNomeProduto.getText();
    }

    public String infoCheckout(){
        return infoCheckout.getText();
    }

    public String obterMsgCarrinho(){return obterMsgCarrinho.getText();}
    public String obterMensagemProduto(){ return obterMensagem.getText(); }
    public void adicionarProduto(){
        adicionarProduto.click();
    }
    public void clicarNoProduto() {
        clicarProduto.click();
    }
    public void ClicarCheckout(){
        clicarCheckout.click();
    }
    public PaginaInicialPO(WebDriver driver) {
        super(driver);

    }

    public void executarAcaoDeLogar(String email, String senha){
        escrever(inputEmail, email);
        escrever(inputSenha, senha);
        buttonEntrar.click();
    }

    public void cadastrar(String nome, String ultimoNome, String cep){
        escrever(inputNome, nome);
        escrever(inputUltimoNome, ultimoNome);
        escrever(inputCep, cep);
        botaoContinuar.click();
    }
}

