# language: pt
@Correios
Funcionalidade: Buscar cep nos site do Correios

Cenário: Teste
Dado que esteja logado no site dos correios
Quando pesquiso um cep
Então verifico se as informacoes do cep foram retornadas 
