#language: pt
#enconding: UTF-8

@login
Funcionalidade: Cadastrar usuario

  @cadastro
  Cenario: Cadastrar usuario
    Quando eu acionar a aba admin
    E acionar o botao add
    E informa no campo employer name ""
    E informa no campo employer username ""
    E informa no campo employer password ""
    E informa no campo employer confirmar password ""
    E acionar o botao salvar
    Entao o sistema cadastra o usuario