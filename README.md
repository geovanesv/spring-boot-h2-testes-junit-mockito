

# spring boot testes com junit e mockito

Este projeto demonstra como realizar testes unitários em uma aplicação Spring Boot utilizando JUnit e Mockito. A aplicação simula um serviço de gerenciamento de alunos (Aluno Service).

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação.
- **Spring Boot**: Framework para construção da aplicação.
- **JUnit 5**: Biblioteca de testes unitários.
- **Mockito**: Framework para criação de mocks e stubs em testes unitários.
- **H2 Database**: Banco de dados em memória para testes.

## Estrutura do Projeto

- **`/src/main/java`**: Contém a implementação principal da aplicação.
  - **`com.br.geovane.aluno.service`**: Pacote base da aplicação.
    - **`model`**: Entidades do domínio, como `Aluno`.
    - **`repository`**: Interface de persistência, utilizando `JpaRepository`.
    - **`service`**: Implementação do serviço de negócios (`AlunoService`).
    - **`controller`**: Controladores REST para manipulação de requisições HTTP.

- **`/src/test/java`**: Contém os testes unitários da aplicação.
  - **`com.br.geovane.aluno.service`**: Pacote base dos testes.
    - **`service`**: Testes para o `AlunoService` usando JUnit e Mockito.
    - **`service`**: Testes para o `Arquitetura` usando JUnit e Mockito.

## Como Executar os Testes

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/spring-boot-h2-testes-junit-mockito.git
   cd spring-boot-h2-testes-junit-mockito
   ```

2. Execute os testes utilizando o Maven:
   ```bash
   ./mvnw test
   ```

3. Os resultados dos testes serão exibidos no terminal.


## Entre em Contato

Se você tiver dúvidas ou quiser saber mais, entre em contato comigo através do LinkedIn:

- **Linkedin**: [Linkedin](https://www.linkedin.com/in/geovanesaraujo/)

Fico à disposição para ajudar e discutir ideias!

