# Carpoolio

Sistema de gerenciamento de veículos desenvolvido em Java utilizando JPA/Hibernate e banco de dados Oracle.

## Sobre o Projeto

O Carpoolio é um projeto acadêmico desenvolvido durante a graduação com o objetivo de aplicar conceitos de orientação a objetos, persistência de dados e integração com banco de dados utilizando Java.

O sistema realiza operações de cadastro, consulta, atualização e exclusão(CRUD) de informações relacionadas a usuários e veículos, implementando um modelo de persistência com JPA e Hibernate.

> **Observação:** Este projeto foi desenvolvido para fins de aprendizado durante a faculdade e representa a aplicação prática dos conceitos estudados em disciplinas relacionadas a desenvolvimento Java e banco de dados.

---

## Tecnologias Utilizadas

* Java
* Maven
* JPA (Jakarta Persistence)
* Hibernate ORM
* Oracle Database
* Eclipse IDE

---

## Modelo de Dados

### Usuário

Entidade responsável pelo armazenamento das informações dos usuários cadastrados no sistema.

Principais atributos:

* Nome
* E-mail
* Senha
* Telefone
* Créditos

### Veículo

Entidade responsável pelo cadastro e gerenciamento dos veículos.

### Tipo de Veículo

Classificação dos veículos cadastrados.

Exemplos:

* Carro Familiar
* Caminhão

### Status do Veículo

Controle de disponibilidade dos veículos.

Exemplos:

* Disponível
* Alugado

---

## Funcionalidades

O projeto implementa as operações básicas de persistência de dados:

### Create

Cadastro de usuários, veículos, tipos e status.

### Read

Consulta de registros armazenados no banco de dados.

### Update

Atualização de informações previamente cadastradas.

### Delete

Remoção de registros persistidos.

---

## Arquitetura

O projeto segue uma arquitetura simples baseada em:

* Entidades JPA para representação dos dados.
* Hibernate como framework ORM.
* Oracle Database para persistência.
* Classes de teste para validação das operações CRUD.

---

## 🎓 Objetivos de Aprendizagem

Durante o desenvolvimento deste projeto foram aplicados conhecimentos relacionados a:

* Programação Orientada a Objetos (POO)
* Persistência de Dados
* JPA
* Hibernate
* Maven
* Integração com Oracle Database
* Operações CRUD
