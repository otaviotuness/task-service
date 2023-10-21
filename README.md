# To-Do List Service

Bem-vindo ao serviço de gerenciamento de lista de tarefas (to-do list) desenvolvido como parte de um estudo de arquitetura hexagonal em Java e Spring Boot.

## Sobre o Projeto

Este projeto tem como objetivo demonstrar a implementação da arquitetura hexagonal (também conhecida como Arquitetura de Portas e Adaptadores) em uma aplicação Java Spring Boot. A arquitetura hexagonal promove a separação de preocupações e a modularidade em uma aplicação, tornando-a mais escalável e de fácil manutenção.

## Funcionalidades

O serviço oferece as seguintes funcionalidades:

- Criação de tarefas com título e descrição.
- Listagem de todas as tarefas.
- Recuperação de uma tarefa específica por ID.
- Atualização de tarefas existentes.
- Exclusão de tarefas.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (para fins de desenvolvimento)
- Maven (para gerenciamento de dependências)

## Estrutura do Projeto

O projeto segue a estrutura clássica de uma aplicação Spring Boot com a arquitetura hexagonal:

- **Camada de Domínio (Domain)**: Contém a lógica de negócios, representações de entidades e regras de domínio.
- **Camada de Aplicação (Application)**: Contém a lógica da aplicação, como o serviço de tarefas e os casos de uso.
- **Camada de Adaptadores (Adapters)**: Contém as implementações concretas, como controladores e repositórios JPA.
- **Camada de Porta de Entrada (Port.in)**: Define as interfaces de casos de uso (portas de entrada).
- **Camada de Porta de Saída (Port.out)**: Define interfaces para os adaptadores externos (portas de saída).

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto em sua IDE favorita (como o IntelliJ IDEA ou o Eclipse).
3. Configure as dependências do Maven.
4. Execute o aplicativo Spring Boot.

```shell
mvn spring-boot:run
