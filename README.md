# 🛒 Mini Loja Virtual – Java (Console)

Projeto desenvolvido em **Java** com foco em **Programação Orientada a Objetos**, simulando o funcionamento de uma **mini loja virtual em ambiente de console**.

O sistema permite o cadastro e gerenciamento de diferentes tipos de produtos, aplicação de regras de negócio específicas e interação com o usuário através de um menu dinâmico.

Este projeto faz parte da minha evolução prática em Java e organização de código em camadas, seguindo boas práticas de desenvolvimento.

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
- 🧱 Separação de responsabilidades (Menu, Regras de Negócio e Entidades)

---

## 🧠 Conceitos Aplicados

- Programação Orientada a Objetos (POO)
- Herança e Polimorfismo
- Classes Abstratas
- Enumerações (`enum`)
- Encapsulamento
- Separação de responsabilidades
- Organização em pacotes (`entities`, `services`, `application`)
- Boas práticas de código limpo
- Versionamento com Git (commits semânticos em português)

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

├── application
  ├── Main.java
  └── Menu.java 
├── entities
  ├── Produto.java
  ├── ProdutoFisico.java
  ├── ProdutoDigital.java
  ├── ProdutoAssinatura.java
  ├── Carrinho.java
  └── Cliente.java
├── entities.enums
  └── Categoria.java
└── services
  └── GerenciamentoLoja.java

---




