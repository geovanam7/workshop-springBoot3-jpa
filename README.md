# 🌐 Web Services com Spring Boot, JPA e Hibernate

Projeto criado durante o curso *Java COMPLETO* do professor Nelio Alves. 
Implementa um serviço web completo com persistência em banco de dados relacional usando **Spring Boot** e **JPA/Hibernate**.
 
 **O que faz:**  
sistema de **vendas on‑line**, com **cadastro de usuários, produtos, categorias e pedidos**.  
É possível gerenciar clientes, criar pedidos com itens, calcular totais e manter um histórico de compras.


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

## 🔗 Principais Endpoints
- `GET /users` – listar usuários
- `POST /users` – criar usuário
- `PUT /users/{id}` – atualizar
- `DELETE /users/{id}` – excluir
- `GET /orders` – listar pedidos com itens e total calculado

## Destaque 
- Camadas bem definidas (resource/service/repository)
- Aplicação prática de JPA e mapeamentos complexos
