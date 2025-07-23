# 🌐 Web Services com Spring Boot, JPA e Hibernate

Projeto criado durante o curso *Java COMPLETO* do professor Nelio Alves. 
Implementa um serviço web completo com persistência em banco de dados relacional usando **Spring Boot** e **JPA/Hibernate**.

## Objetivos
✅ Criar e consumir APIs REST  
✅ Implementar modelo de domínio com relacionamentos (OneToMany, ManyToMany, etc.)  
✅ Realizar operações CRUD  
✅ Aplicar tratamento de exceções  
✅ Uso de perfis (test/dev/prod) e deploy no Heroku

## Tecnologias
- Java 17
- Spring Boot
- JPA / Hibernate
- H2 (perfil de teste)
- PostgreSQL (produção)
- Maven
- Postman

## Estrutura
entities/
repositories/
services/
resources/
exceptions/
config/


## 🔗 Principais Endpoints
- `GET /users` – listar usuários
- `POST /users` – criar usuário
- `PUT /users/{id}` – atualizar
- `DELETE /users/{id}` – excluir
- `GET /orders` – listar pedidos com itens e total calculado

## Destaque para Recrutadores
- Camadas bem definidas (resource/service/repository)
- Aplicação prática de JPA e mapeamentos complexos
- Experiência com deploy em nuvem (Heroku)
