# Exercício 01 - Bootcamp devsuperior

## Busca paginada de clientes
GET /clients?page=0&linesPerPage=6&direction=ASC&orderBy=name


## Busca de cliente por id
GET /clients/1

## Inserção de novo cliente
POST /clients
````json
{
  "name": "Maria Silva",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
````

## Atualização de cliente
PUT /clients/1
````json
{
  "name": "Maria Silvaaa",
  "cpf": "12345678901",
  "income": 6500.0,
  "birthDate": "1994-07-20T10:30:00Z",
  "children": 2
}
````
## Deleção de cliente
DELETE /clients/1
