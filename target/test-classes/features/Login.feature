#language: pt
#enconding: UTF-8

@login
Funcionalidade: login

Cenario: usuario invalido
Quando eu informa o usuario "Lucas"
E informa a senha "gft"
E clicar no botao conecte-se
Entao o sistema exibe a mensagem de usuario invalido

@loginSucesso
Cenario: realizar login
Quando eu informa o usuario "admin"
E informa a senha "admin123"
E clicar no botao conecte-se
Entao o sistema exibe o usuario logado 