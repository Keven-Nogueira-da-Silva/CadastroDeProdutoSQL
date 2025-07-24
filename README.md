🧾 Descrição do Projeto: Sistema de Controle de Estoque em Java com MySQL
Desenvolvi um sistema de controle de estoque utilizando Java puro e banco de dados MySQL, simulando uma aplicação real utilizada por empresas para gerenciar seus produtos. O projeto foi construído com base na arquitetura de camadas (Model, DAO e Main), utilizando o padrão DAO (Data Access Object) para separação de responsabilidades e facilitar a manutenção.

⚙️ Funcionalidades Implementadas:
Cadastro de produtos (nome, preço, quantidade);
Listagem de todos os produtos armazenados no banco;
Conexão segura com banco de dados usando JDBC;
Organização em pacotes para boas práticas (model, dao, util).

🛠️ Tecnologias Utilizadas:
Linguagem: Java
Banco de dados: MySQL (via XAMPP)
Acesso a dados: JDBC
IDE: IntelliJ IDEA / Eclipse
Ferramenta de banco: phpMyAdmin

📦 Estrutura do Projeto:
model.Produto: representa a entidade Produto.
dao.ProdutoDAO: realiza operações de CRUD com o banco.
util.Conexao: gerencia a conexão com o MySQL.
Main: executa o fluxo de cadastro e listagem via terminal.
