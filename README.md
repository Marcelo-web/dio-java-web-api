<p align="center">
<img alt="GitHub Top Language" src="https://img.shields.io/github/languages/top/Marcelo-web/dio-java-web-api" />
</p>

## 📌  Estudo sobre Web API usando Java com Spring Boot 

Repositório de estudo sobre Web API por meio da plataforma DIO (Digital Innovation One). 

- Será criada um modelo de  REST API documentada com Swagger. 
- Será estabelecido o tratamento de exceções de negócio por meio de handlers.

### 🔵 Conceito API REST
Uma API REST (Representational State Transfer) é uma **interface de programação de aplicações** que segue os princípios de design do estilo arquitetônico REST.

1. **Recursos e URIs:** No REST, tudo é um recurso, como um usuário, um produto ou um pedido. Cada recurso tem um identificador único chamado URI (Uniform Resource Identifier). Por exemplo:
  - Um usuário:  /usuarios/123
  - Um produto: /produtos/456

2. **Métodos HTTP**
- **GET:** Obtém informações de um recurso (por exemplo, obter detalhes de um usuário).
- **POST:**  Cria um novo recurso (por exemplo, criar um novo pedido).
- **PUT**: Atualiza um recurso existente (por exemplo, atualizar informações de um produto).
- **DELETE**: Remove um recurso (por exemplo, excluir um usuário).

3. **Estado sem sessão:** As APIs REST são sem estado, o que significa que cada solicitação contém todas as informações necessárias. Não há necessidade de manter sessões no servidor.
