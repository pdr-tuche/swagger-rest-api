# swagger-rest-api

🌐 API REST com documentação Swagger

Execução do projeto:

1. Clonar o repositório

```PS1
git clone https://github.com/pdr-tuche/swagger-rest-api
```

2. Entrar na pasta do projeto e iniciar o container

```PS1
cd swagger-rest-api
docker-compose up
```

3. Em outro terminal, dentro do container, crie o banco de dados 'apiproduto' e feche o terminal.

```PS1
docker ps
docker exec -it swagger-rest-api-db-1 bash
psql -U postgres
create database apiproduto;
```

4. instale as depedencias na pasta do projeto

```PS1
mvn clean install
```

5. Execute a aplicação

```PS1
mvn spring-boot:run
```

A aplicação estará disponível na porta 8080

Para ver a documentação do swagger acesse: http://localhost:8080/swagger-ui/index.html

A documentação também esta em formato json no arquivo [api-docs.json](./api-docs.json)
