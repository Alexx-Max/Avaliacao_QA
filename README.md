# Avaliação QA - Automação de Testes Web

Projeto de automação de testes funcionais para a aplicação SauceDemo, utilizando Java, Selenium WebDriver e JUnit. O foco é validar os principais fluxos de um e-commerce, aplicando boas práticas de organização e manutenção de testes automatizados.

## Tecnologias utilizadas
* Java
* Selenium WebDriver
* JUnit
* Maven
* ChromeDriver

## Arquitetura do projeto

O projeto segue o padrão **Page Object Model (POM)**, promovendo separação entre a lógica de testes e a interação com a interface.

* **Page Objects ('PageObject')**: centralizam as ações e elementos das páginas
* **Testes ('automacao.test')**: contêm as validações dos cenários
* **BaseTest**: responsável pela configuração e gerenciamento do WebDriver

## Estrutura do projeto
src/
 ├── main/
 │    ├── java/
 │    │    └── PageObject/
 │    │         ├── BasePO.java
 │    │         ├── LoginPO.java
 │    │         └── PaginaInicialPO.java
 │    │
 │    └── resources/
 │
 ├── test/
 │    └── java/
 │         └── automacao.test/
 │              ├── BaseTest.java
 │              ├── LoginTest.java
 │              └── PaginaInicialTest.java
 │
 ├── Resource/        # Driver do navegador
 └── Screenshots/     # Evidências de execução

## Configuração do ambiente

### 1. Clonar o repositório
git clone https://github.com/Alexx-Max/Avaliacao_QA.git

### 2. Configurar o ChromeDriver
No arquivo 'BaseTest.java', ajuste o caminho do driver conforme o ambiente local:
private static final String CAMINHO_DRIVER = "C:/caminho/para/chromedriver.exe";


### 3. Execução dos testes
Os testes podem ser executados diretamente pela IDE (IntelliJ ou Eclipse).

Via Maven:
mvn test

## Cenários automatizados
* Login com credenciais válidas
* Login com credenciais inválidas
* Navegação após autenticação
* Validação da página inicial
* Ordenação de produtos
* Acesso ao checkout
* Validação de elementos da interface
* Captura de evidências (screenshots)

## Estratégias adotadas
* Uso do padrão Page Object Model
* Separação clara entre testes e regras de negócio
* Utilização de seletores estáveis ('id','data-test')
* Reutilização de código com classes base
* Execução com navegador configurado (inclusive modo anônimo)

## Exemplo de validação
assertEquals(assertEquals("Error: Postal Code is required", PaginaInicialPage.msgErro());

## Evidências
As capturas de tela dos testes são armazenadas no diretório:
/Screenshots

## Melhorias futuras

* Implementação de execução paralela
* Integração com CI/CD (GitHub Actions)
* Suporte a múltiplos navegadores
* Geração de relatórios (Allure ou Extent Reports)
* Uso de WebDriverManager para gerenciamento automático do driver

## Autor
Alex Max

## Observações
Projeto desenvolvido como parte de avaliação técnica, com foco na aplicação de boas práticas de automação de testes e organização de código.
