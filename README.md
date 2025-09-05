# Validador de CPF e CNPJ

## Descrição
Este projeto em **Java** permite validar e formatar **CPFs** e **CNPJs** de forma prática e rápida.  
Ele é ideal para quem quer aprender **validação de dados, lógica de programação e boas práticas em Java**.  

Funcionalidades:  
- Validar CPF (11 dígitos, dígitos verificadores).  
- Validar CNPJ (14 dígitos, dígitos verificadores).  
- Formatar CPF/CNPJ válidos.  
- Aceitar entradas com ou sem pontuação (`123.456.789-09` ou `12345678909`).  


---

## Evoluções Futuras

Criar interface gráfica com JavaFX.

Adicionar testes unitários com JUnit.

---
## Boas Práticas Aplicadas

Uso de constantes para tamanho de CPF e CNPJ (TAMANHO_CPF, TAMANHO_CNPJ).  Clean Code

Código modular (Main, CPFValidator, CNPJValidator).

Limpeza de entradas com replaceAll("\\D", "").

Preparado para manutenção e evolução.
