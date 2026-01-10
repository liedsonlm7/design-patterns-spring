# 💡 Design Patterns com Spring Boot

Exemplo de Implementação prática de **Design Patterns** com Spring Boot. A aplicação é uma API Rest para gerenciamento de clientes, integrando
a API ViaCEP para preencher automaticamente informações de endereço.

<br>

## 📚 Padrões de Projeto Aplicados

* **Singleton:** Beans Spring (`@Service`, `@Repository`) são singletons por padrão.  
* **Strategy:** `ClienteService` define a interface de operações de clientes, e `ClientServiceImpl` fornece a implementação concreta.  
* **Facade:** `ClientServiceImpl` simplifica o fluxo de criação de clientes, orquestrando consultas ao banco de dados e à API externa.

<br>

## 🛠️ Tecnologias usadas

Este projeto foi desenvolvido com:

* **Java 17**  
* **Spring Boot, Spring Data JPA, Spring Web**  
* **H2 Database** (em memória para testes)  
* **Spring Cloud OpenFeign** (cliente REST)  
* **Maven**

<br>

## 🗂️ Estrutura do projeto

```text
src
├── main
│   └── java/com/one/digitalinnovation
│       ├── gof
│       │   ├── controller
|       |   |   ├── ClienteController
│       │   ├── model
|       |   |   ├── Cliente
|       |   |   └── Endereco
│       │   ├── repository
│       │   |     ├── ClienteRepository
│       │   |     └── EnderecoRepository
│       │   ├── service
│       │          ├── impl
│       │          |    └──  ClienteServiceImpl
│       │          ├── ClienteService
│       │          └── ViaCepService
└── test
    └── java
```

<br>

## ▶️ Como executar o projeto 

### Pré-requisitos 
* Java 17+
* SpringBoot
* Maven
  
### Passos
```bash
# Clonar o repositório
git clone https://github.com/liedsonlm7/design-patterns-spring.git

# Entrar no projeto
cd design-patterns-spring

# Executar a aplicação
mvn spring-boot:run

A aplicação estará disponível em:
http://localhost:8080
```

<br>

## 📌 Endpoints Principais

### 🔹 Listar todos os clientes
```http 
GET /clientes – Lista todos os clientes
```

### 🔹 Buscar cliente por ID
```http
GET /clientes/{id} – Busca cliente por ID
```

### 🔹Criar clientes (nome e CEP)
```http
POST /clientes – Cria cliente (nome e CEP)
```

### 🔹Atualizar cliente
```http
PUT /clientes/{id}
```

### 🔹Remover cliente
```http
DELETE /clientes/{id}
```

<br>

## Exemplo de Requisição

```
{
    "nome": "Liedson",
    "endereco": {
        "cep": "07244230"
    }
}
```

<br>

## Exemplo de Resposta da API

```
{
    "endereco": {
        "bairro": "Parque Jurema",
        "cep": "07244-230",
        "complemento": "",
        "ddd": "11",
        "gia": "3360",
        "ibge": "3518800",
        "localidade": "Guarulhos",
        "logradouro": "Rua Marambaia",
        "siafi": "6477",
        "uf": "SP"
    },
    "id": 1,
    "nome": "Liedson"
}
```

<br>

## 📄 Licença
Este é um projeto desenvolvido para fins de estudos como parte de um desafio do treinamento <br>
Java & Spring Boot da plataforma DIO.


