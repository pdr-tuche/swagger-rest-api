# swagger-rest-api

🌐 API REST com documentação Swagger

Execução do projeto:

1. Clonar o repositório

```bash
git clone https://github.com/pdr-tuche/swagger-rest-api
```

2. Entrar na pasta do projeto e iniciar o container

```bash
cd swagger-rest-api
docker-compose up
```

3. Em outro terminal, dentro do container, crie o banco de dados 'apiproduto' e feche o terminal.

```bash
docker ps
docker exec -it swagger-rest-api-db-1 bash
psql -U postgres
create database apiproduto;
```

4. instale as depedencias na pasta do projeto

```bash
mvn clean install
```

5. Execute a aplicação

```bash
mvn spring-boot:run
```

A aplicação estará disponível na porta 8080

Para ver a documentação do swagger acesse: http://localhost:8080/swagger-ui/index.html
