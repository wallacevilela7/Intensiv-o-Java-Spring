## 🎮 Intensivão Java Spring - DevSuperior

Este projeto é uma implementação prática do desafio proposto no **Intensivão Java com Spring Boot** da [DevSuperior](https://github.com/devsuperior/dslist-backend). A aplicação consiste em uma API REST para gerenciamento de uma lista de jogos, com funcionalidades como listagem, ordenação por posição e associação entre listas e jogos.

### 🔗 Repositório de Referência

> [https://github.com/devsuperior/dslist-backend](https://github.com/devsuperior/dslist-backend)

---

### 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* H2 Database (ambiente de testes)
* PostgreSQL (produção)
* Maven
* ModelMapper

---

### 📦 Funcionalidades

* Listagem de jogos
* Consulta por ID
* Listagem por categoria
* Reordenação de jogos dentro de uma lista

---

### 🛠️ Como executar o projeto

1. **Clone o repositório:**

   ```bash
   git clone https://github.com/wallacevilela7/Intensivao-Java-Spring.git
   cd Intensivao-Java-Spring
   ```

2. **Configure o banco de dados:**

   * Por padrão, o projeto usa H2 para testes.
   * Configure `application.properties` para usar PostgreSQL se necessário.

3. **Execute o projeto:**

   * Via IDE (Spring Boot run)
   * Ou via terminal:

     ```bash
     ./mvnw spring-boot:run
     ```

---

### 🧪 Acesso ao banco H2 (modo dev)

* URL: `http://localhost:8080/h2-console`
* JDBC URL: `jdbc:h2:mem:testdb`
* User: `sa`
* Password: *(em branco)*

---

### 📂 Estrutura do projeto

```
src/
├── main/
│   ├── java/
│   │   └── com.example.dslist/
│   │       ├── controllers/
│   │       ├── dto/
│   │       ├── entities/
│   │       ├── repositories/
│   │       └── services/
│   └── resources/
│       └── application.properties
```

---

### 📸 Exemplo de resposta da API

```json
[
  {
    "id": 1,
    "title": "The Witcher 3",
    "platforms": "PC, PS4, Xbox One",
    "score": 9.5,
    "genre": "RPG"
  }
]
```

