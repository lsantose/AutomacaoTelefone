#encoding: utf-8
#language: pt

  Funcionalidade: Salvar contato

    @Tag1
  Cenario: Validar Registro de Contato no Android
    Dado que estou no app Telefone
    E acesso a aba Contatos
    Quando acesso a tela Salvar contatos
    E seleciono a opcao Telefone
    E insiro o Nome
    E insiro o Sobrenome
    E insiro o Telefone
    E insiro o E-mail
    E salvo o contato com as informacoes inseridas
    Entao valido que o contato foi criado com sucesso
