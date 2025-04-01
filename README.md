# To-Do List API

## Descrição

Este projeto é uma aplicação de gerenciamento de tarefas (To-Do List) composta por um back-end em Spring Boot e um front-end simples utilizando HTML, CSS e JavaScript. O back-end é responsável por gerenciar as operações CRUD (Criar, Ler, Atualizar e Excluir) para as tarefas, enquanto o front-end oferece uma interface interativa para o usuário.

## Tecnologias Utilizadas

### Back-end:

* Java 21
* Spring Boot (versão 3.4.4)
* Spring Data JPA (para gerenciamento de persistência com banco de dados)
* PostgreSQL (banco de dados)
* HikariCP (pool de conexões)
* Hibernate ORM (para mapeamento objeto-relacional)

### Front-end:

* HTML (estrutura da página)
* CSS (estilização)
* JavaScript (interatividade)

## Imagem do Front-End:
![Captura de tela 2025-04-01 183730](https://github.com/user-attachments/assets/ec8a81a9-85f0-4118-a0d8-a6a00eaaf908)


## Funcionalidades

* **Criar Tarefa:** O usuário pode adicionar novas tarefas à lista.
* **Visualizar Tarefas:** O usuário pode visualizar todas as tarefas.
* **Atualizar Tarefa:** O usuário pode editar uma tarefa existente.
* **Excluir Tarefa:** O usuário pode excluir tarefas da lista.

## Imagem da API:
![Captura de tela 2025-03-31 143248](https://github.com/user-attachments/assets/c2b012e0-42d9-4003-bc48-2c66e2bd9175)

## Como Executar

### Back-end

1.  Clone o repositório:

    ```bash
    git clone https://github.com/DaviLuquini/ToDo-List.git
    ```

2.  Navegue até o diretório do projeto:

    ```bash
    cd To-Do-List.Backend
    ```

3.  Compile e execute o projeto com Maven:

    ```bash
    ./mvnw spring-boot:run
    ```

    A aplicação estará disponível em `http://localhost:8080`.

### Front-end

1.  Clone o repositório (caso ainda não tenha feito):

    ```bash
    git clone https://github.com/DaviLuquini/ToDo-List.git
    ```

2.  Navegue até o diretório `frontend`:

    ```bash
    cd To-Do-List.Frontend
    ```

3.  Abra o arquivo `index.html` em um navegador de sua escolha.

## Endpoints da API

* `GET /tasks`: Retorna todas as tarefas.
* `POST /tasks`: Cria uma nova tarefa.
* `PUT /tasks/{id}`: Atualiza uma tarefa existente.
* `DELETE /tasks/{id}`: Exclui uma tarefa.

## Banco de Dados

A aplicação utiliza o PostgreSQL para persistência das tarefas. O banco de dados deve ser configurado no arquivo `application.properties` (no diretório `src/main/resources`).

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/todolist
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
