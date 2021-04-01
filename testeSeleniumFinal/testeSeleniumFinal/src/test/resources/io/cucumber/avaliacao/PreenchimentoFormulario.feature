# language: pt
Funcionalidade: Preencher o formulario no site de vendas
  O projeto consiste em preencher os formularios do site do 
  professor, devido ao site da Sampleapp ter ficado fora do ar.

  Cenario: Preencher o formulario de clientes
    Quando entro no site
    E clico em cliente
    E clico em novo
    E preencho o nome
    E preencho o telefone
    E preencho o email
    E clico para salvar
    Entao vejo a mensagem de sucesso "Cliente was successfully created."
    
  Cenario: Preencher o formulario de pedidos
    Quando clico em pedidos
    E clico em novo
    E seleciono o cliente
    E clico para salvar
    Entao vejo a mensagem de sucesso "Pedido was successfully created."

  Cenario: Preencher o formulario de produtos
    Quando clico em produtos
    E clico em novo
    E preencho o nome
    E preencho a descricao
    E preencho a quantidade
    E preencho a data de vencimento
    E preencho o preco de compra
    E preencho a venda


  