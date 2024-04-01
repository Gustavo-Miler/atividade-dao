# Geral
Em um banco de dados H2 foram craidas as tabelas ALUNO, EMPRESTIMO E PUBLICACAO. As relações entre tabelas foram estabelecidas no código sql.

## Classe DAO
A classe DAO é responsável pela arquitetura a ser utilizada no sistema, gerenciando as entidades pelo "javax.persistence", além dos métodos de manipulação dados CRUD (findAll, insert, update e delete).

## Empréstimo DAO
A emprestimoDAO tem o padrão DAO, que sobrescreve os métodos CRUD atribuidos à classe DAO. Utiliza Criteria para retornar dados do H2 e a classe Transaction para manipulação de dados (insert, update e delete).

## Atividade DAO
A classe principal do projeto, responsável pelos testes da aplicação.

### Discente:
Gustavo Miler Gonçalves Santos