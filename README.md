# 🛒 Mini Loja Virtual (V3.0) – Java + JUnit (Console)

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos**, arquitetura em camadas e testes unitários com JUnit 5, simulando o funcionamento de uma **mini loja virtual em ambiente de console**.

O sistema simula o gerenciamento de uma loja virtual, permitindo o cadastro, edição, remoção, listagem e filtragem de produtos, além do cálculo do valor total do carrinho. O sistema permite o gerenciamento completo de produtos, aplicação de regras de negócio por tipo de produto e cálculo automático do carrinho, com validações e tratamento de exceções. 

Esta versão marca a evolução do projeto com testes automatizados, melhoria de arquitetura e maior robustez do código.



---

## 🚀 Funcionalidades

- 📦 Cadastro de produtos:
  - Produto Físico (com peso e custo de frete)
  - Produto Digital (com taxa digital)
  - Produto por Assinatura (com meses e desconto)
- 📋 Listagem de produtos cadastrados
- 🔍 Busca e remoção de produtos por ID
- ✏️ Edição de produtos existentes
- 🗂️ Filtro de produtos por categoria
- 🧾 Exibição de resumo do carrinho
- 🧠 Cálculo automático do preço final com regras específicas por tipo de produto
- 🧱 Separação de responsabilidades (Menu Interatico com pausas controladas, Regras de Negócio e Entidades)
- ⚠️ Tratamento de exceções customizadas
- 🧪 Testes unitários com JUnit 5
- 🧱 Arquitetura organizada em camadas

---

## 🧪 Testes Automatizados (JUnit 5)

Cobertura atual:

✔ Cálculo total do carrinho

✔ Preço final Produto Físico

✔ Preço final Produto Digital

✔ Preço final Produto Assinatura

Os testes garantem:

- Confiabilidade das regras de negócio

- Segurança em refatorações

- Validação automática do sistema

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e Polimorfismo
- Classes Abstratas
- Enumerações (`enum`)
- Encapsulamento
- Separação de responsabilidades
- Organização em pacotes (`entities`, `services`, `application`)
- Padrão DTO (centraliza a entrada e saída de dados e facilita a evolução/manutenção do sistema)
- Classe Utilitária (centraliza leitura e validação de dados, UX no console e método de pausa)
- Boas práticas de código limpo
- Versionamento com Git (commits semânticos)
- Arquitetura em Camadas (SRP)
- Tratamento de Exceções Customizadas
- Testes Unitários (`JUnit 5`)

---

## 🖥️ Exemplo de Execução no Console

```

==============================
MINI LOJA VIRTUAL

1 - Cadastrar produto
2 - Listar produtos
3 - Remover produto
4 - Editar produto
5 - Filtrar produtos por categoria
6 - Exibir resumo do carrinho
0 - Sair

Escolha uma opção: 1

Cadastrar Produto: (1. Físico / 2. Digital / 3. Assinatura)
Escolha o tipo de produto: 1
Nome: Teclado Mecânico
Preço: (R$) 350.00
Quantidade: (unidades) 2
Categoria: ELETRONICO
Peso: (g) 850
Custo do frete: (R$) 25.00

Produto cadastrado com sucesso!

Escolha uma opção: 2

Lista de produtos:
ID: 1 | Nome: Teclado Mecânico | Categoria: ELETRONICO | Quantidade: 2 | Preço final: R$ 725.00
Preço final do carrinho: R$ 725.00

Escolha uma opção: 6

Resumo do carrinho:
Total de itens: 2
Valor total: R$ 725.00

```


---

## 📂 Estrutura do Projeto

src/

 ── application
 
   - Main.java
   - Menu.java
     
── entities

   - Produto.java
   - ProdutoFisico.java
   - ProdutoDigital.java
   - ProdutoAssinatura.java
   - Carrinho.java
   - Cliente.java
     
 ── entities.enums

   - Categoria.java
   
 ── entities.exceptions

   - ProdutoNaoEncontradoException.java
   
── services

   - GerenciamentoLoja.java

── dto   

   - ProdutoDTO.java 

── services

   - InputUtils.java
   
── test

   - CarrinhoTest.java
   - ProdutoTest.java   
   


---




## ▶️ Como Executar

 Clone o repositório;

  ```
    git clone https://github.com/seu-usuario/seu-repositorio.git   
   ```
   
Abra o projeto em uma IDE Java (Eclipse, IntelliJ ou VS Code);

Execute a classe e interaja com o sistema pelo console;



```
	application.Main

```

Rodar os testes: execute as classes: 

```
	test.CarrinhoTest
	test.ProdutoTest
```



🔄 Versionamento

	Versão atual: 3.0


# 🚀Evolução do Projeto

## V1.0

- CRUD básico

- Estrutura inicial

## V2.0

- Polimorfismo

- DTO

- Filtros

- Melhor organização

## V3.0

- Testes unitários (JUnit)

- Exception customizada

- Refatoração

- Arquitetura mais limpa

- Código mais robusto

- Próxima versão planejada:

- Persistência de dados (arquivo ou banco)

- Testes unitários

- Interface gráfica ou API Rest

- Refatoração para uso de interfaces

- Relatórios mais detalhados

## 🚀 Próximas Evoluções (Roadmap)

- Persistência em arquivo ou banco de dados

- Interface gráfica ou API REST (Spring Boot)

- Uso de Interfaces e SOLID completo

- Testes mais avançados (Mockito)

- Relatórios mais completos

- Sistema de múltiplos clientes

- Logging e tratamento global de exceções


##📌 Autor

- **Marcelo Nascimento**
- Estudante de Análise e Desenvolvimento de Sistemas
- Foco em Backend Java ☕

🔗 **LinkedIn:** https://www.linkedin.com/in/marcelo-nascimento-gomes

💻 **GitHub:** https://github.com/marcelo25sp

##⭐ Considerações Finais

Este projeto representa uma etapa importante da minha evolução como desenvolvedor Java, reforçando conceitos fundamentais de POO, organização de código e boas práticas.

Sugestões e feedbacks são muito bem-vindos!




