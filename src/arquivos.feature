Feature: login válido
  Scenario: Realizar login com email e senha corretos
    Given que o usuário acesse o site Sauce Labs
    And e o usuário preencha os campos email e senha corretos
    When o usuário efetua o login
    Then o usuário deve ser redirecionado para a página principal

Feature: botão adicionar ao carrinho
  Scenario: Produto deve ser adicionado ao carrinho
    Given que o usuário esteja na página do produto
    When o usuário clica em adicionar ao carrinho
    Then o simbolo de quantidade deve ser mostrado no ícone do carrinho

Feature: Ícone de Carrinho
  Scenario: ao clicar o ícone de carrinho, deve aparecer os produtos adicionados
    Given que o usuário está na página inicial
    And clica em adicionar um produto ao carrinho
    When o usuário clica no ícone do carrinho
    And e o usuário é redirecionado para página do carrinho
    Then deve aparecer os produtos adicionados

Feature: Ordenar os Produtos
  Scenario: clicando no icone de ordenar e selecionando a opção, os produtos devem ser ordenados de acordo
    Given que o usuário esteja na página incial
    And e o usuário clique no ícone de ordenar
    When o usuário seleciona o filtro desejado
    Then os produtos devem ser ordenados de acordo

Feature: login inválido
  Scenario: Ao tentar realizar login com email e senha incorretas, o acesso deve ser inválido
    Given que o usuário acesse o site da amazon
    And e o usuário tenha o email e senha incorretos
    When o usuário efetua o login
    Then o usuário não deve ser redirecionado para a página principal
    And deve mostra uma mensagem de erro

Feature: Carrinho Vazio
  Scenario: Ao clica em adicionar o produto ao carrinho, o produto não é exibido na página do carrinho
    Given que o usuário esteja na página do produto
    And o usuário adicione o produto ao carrinho
    When o usuário clica no ícone do carrinho
    Then não deve mostrar nada no carrinho

Feature: Checkout incompleto
  Scenario: Tentar finalizar uma compra sem preencher os campos
    Given que o usuário esteja no checkout
    And e não preencha os campos ou deixe algo em branco
    When o usuário tentar finalizar
    Then o usuário não deve conseguir finalizar o pedido
    And deve informar uma mensagem informando para preencher os campos


Feature: Botão de adicionar ao carrinho não funciona
  Scenario: Ao clicar em adicionar ao carrinho, produto não é exibido no carrinho
    Given que o usuário esteja na pagina inicial
    And e o usuário clica em um produto
    When o usuário clica em adicionar o produto no carrinho
    Then o produto não é exibido no carrinho
