# Backend Consultas

API REST desenvolvida com **Spring Boot** para gerenciamento de consultas médicas, permitindo o cadastro e gerenciamento de pacientes, médicos, especialidades e consultas.

---

## Funcionalidades

- ✅ CRUD completo de **Pacientes**
- ✅ CRUD completo de **Médicos**
- ✅ CRUD completo de **Especialidades**
- ✅ CRUD completo de **Consultas**
- ✅ Integração com banco de dados H2
- ✅ API REST seguindo boas práticas de desenvolvimento
- ✅ Arquitetura em camadas (Controller, Service, Repository e Model)

---

## Tecnologias utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- Maven
- H2 Database
- Jackson

---

## Estrutura do projeto

```
src
 ├── controller
 ├── service
 ├── repository
 ├── model
 ├── resources
 └── BackendConsultasApplication.java
```

---

## Como executar o projeto

### 1. Clone o repositório

```bash
git clone https://github.com/AgathaCassari/backend-consultas.git
```

### 2. Entre na pasta do projeto

```bash
cd backend-consultas
```

### 3. Abra o projeto

Abra o projeto utilizando o **IntelliJ IDEA** ou **Visual Studio Code**.

### 4. Execute a aplicação

Execute a classe principal:

```
BackendConsultasApplication
```

ou pelo terminal:

```bash
./mvnw spring-boot:run
```

No Windows:

```bash
mvnw.cmd spring-boot:run
```

---

## Endereço da API

Após iniciar a aplicação, ela estará disponível em:

```
http://localhost:8080
```

---

# Endpoints

## Pacientes

| Método | Endpoint |
|---------|----------|
| GET | `/pacientes` |
| GET | `/pacientes/{id}` |
| POST | `/pacientes` |
| PUT | `/pacientes/{id}` |
| DELETE | `/pacientes/{id}` |

---

## Médicos

| Método | Endpoint |
|---------|----------|
| GET | `/medicos` |
| GET | `/medicos/{id}` |
| POST | `/medicos` |
| PUT | `/medicos/{id}` |
| DELETE | `/medicos/{id}` |

---

## Especialidades

| Método | Endpoint |
|---------|----------|
| GET | `/especialidades` |
| GET | `/especialidades/{id}` |
| POST | `/especialidades` |
| PUT | `/especialidades/{id}` |
| DELETE | `/especialidades/{id}` |

---

## Consultas

| Método | Endpoint |
|---------|----------|
| GET | `/consultas` |
| GET | `/consultas/{id}` |
| POST | `/consultas` |
| PUT | `/consultas/{id}` |
| DELETE | `/consultas/{id}` |

---

## Testando a API

Os endpoints podem ser testados utilizando:

- Postman
- Insomnia
- cURL

Exemplo:

```bash
curl http://localhost:8080/consultas
```

---

## Banco de dados

O projeto utiliza o banco de dados **H2** em memória.

O banco é criado automaticamente ao iniciar a aplicação.

Console H2:

```
http://localhost:8080/h2-console
```

As configurações de conexão estão definidas no arquivo:

```
src/main/resources/application.properties
```

---

## Observações

- O backend deve estar em execução para que o aplicativo mobile consiga consumir a API.
- O banco de dados é recriado automaticamente durante a execução da aplicação.
- Recomenda-se utilizar o Postman ou cURL para validar os endpoints da API.

---

## Autora

**Agatha Cassari Benedicto**
