# Backend Consultas

API REST desenvolvida com Spring Boot para gerenciamento de pacientes e especialidades médicas.

---

## 🚀 Funcionalidades

* CRUD completo de **Pacientes**
* CRUD completo de **Especialidades**
* Integração com banco de dados H2
* Arquitetura em camadas (Controller, Service, Repository, Model)

---

## 🛠 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database

---

## ▶️ Como executar o projeto

1. Clone o repositório:

```
git clone https://github.com/AgathaCassari/backend-consultas
```

2. Abra o projeto no VS Code ou IntelliJ

3. Execute a classe:

```
BackendConsultasApplication
```

4. A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 📌 Endpoints da API

### 👤 Pacientes

* GET → listar todos
  http://localhost:8080/pacientes

* GET → buscar por ID
  http://localhost:8080/pacientes/{id}

* POST → criar
  http://localhost:8080/pacientes

* PUT → atualizar
  http://localhost:8080/pacientes/{id}

* DELETE → remover
  http://localhost:8080/pacientes/{id}

---

### 🩺 Especialidades

* GET → listar todas
  http://localhost:8080/especialidades

* GET → buscar por ID
  http://localhost:8080/especialidades/{id}

* POST → criar
  http://localhost:8080/especialidades

* PUT → atualizar
  http://localhost:8080/especialidades/{id}

* DELETE → remover
  http://localhost:8080/especialidades/{id}

---

## 🗄 Banco de dados

O projeto utiliza o banco H2 local.

O banco é criado automaticamente ao rodar a aplicação.

Para acessar o console H2:

```
http://localhost:8080/h2-console
```

---

## 📎 Observações

* O projeto deve ser executado localmente para que os endpoints funcionem
* O banco de dados é gerado automaticamente na execução
* Estrutura organizada seguindo boas práticas de desenvolvimento

---

## 👩‍💻 Autora

Agatha Cassari Benedicto
