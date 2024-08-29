


<div align="center">
<img src="https://github.com/user-attachments/assets/d6ecbd17-8fa4-4ea9-906e-eb9d9a9e4207" width="200px" />
</div>

<h4 align="center">NOME: FABIANO LUIZ - RM:96044<h3>

<span align="center">

##  Microsserivço de análise de crédito 💳💸

</span>

## 📝 Descrição
<p align="center">
  Microsserviço desenvolvido para receber solicitação de propostas de análise de crédito que. Após a solicitação ser feita 
a proposta fica com status de aprovado como false, aguardando a análise para a decidir se vai ser aprovado ou não.

## 💻 Tecnologias usadas

<p align="center">

 <img src="https://img.shields.io/badge/-JAVA-CB3837?style=flat-square&logo=java&logoColor=white" height="25"/>
<img src="https://github.com/user-attachments/assets/12e3e5aa-0377-484f-ac55-6013bda1cf80" height="30"/>
<img src="https://github.com/user-attachments/assets/e7f94849-f108-43f6-9e56-68f8dae33a63" height="30"/>
<img src="https://github.com/user-attachments/assets/84534e34-c76e-4477-bcab-3c1d6180eead" height="30"/>
<img src="https://github.com/user-attachments/assets/093caedc-da0d-4b7d-aa93-3e3f95b81d5a" height="30"/>
<img src="https://github.com/user-attachments/assets/55211e26-9e01-410d-b228-ee6805e74520" height="30"/>







## 🏛️ Estrutura do projeto

<p>
 O projeto está estruturado nas seguintes camadas:
<br><strong> - Model: </strong> Responsável por representar as entidades de negócio.
Nela estamos fazendo as definições do banco de dados e as relações 
entre as entidades. Um user pode ter uma ou muitas propostas. <strong>OneToMany</strong>
na entidade User e <strong>ManyToOne</strong> na entidade Proposta.

<br> <strong>- Repository: </strong> Responsável pela interação com a base de dados.
Para a <strong>UserRepository</strong> está sendo utilizado os métodos <strong>save, findAll, findById,
getReferenceById, existsById, deleteById.</strong> Para a <strong>PropostaRepository</strong> 
está sendo utilizado os métodos <strong>save, findAll, findById.</strong>

<br> <strong>- Service: </strong>Responsável por conter a lógica de negócio e operações com o banco de dados
(repository) garantindo que as operações sejam transacionais.

<br> <strong>- Controller: </strong>Responsável por lidar com as requisições HTTP e mapear essas requisições para os serviços adequados. É o ponto de entrada da aplicação para clientes.

</p>

<h3 align="center"><strong>Endpoints</strong></h4>
<p >
  -> /users HTTP POST -> Responsável pelo cadastro de um usário;
 <br>-> /users HTTP GET -> Responsável por listar todos os usuários;
 <br>-> /users/{id} HTTP GET -> Responsável por buscar um usuário pelo id;
 <br>-> /users/{id} HTTP PUT -> Responsável por fazer a atualização do registro de um usário;
 <br>-> /users/{id} HTTP DELETE -> Responsável por deletar um usuário pelo id
<br>
<br>
<br>-> /propostas HTTP POST -> Responsável pelo cadastro de uma proposta;
 <br>-> /propostas HTTP GET -> Responsável por listar todos as propostas;
 <br>-> /propostas/{id} HTTP GET -> Responsável por buscar uma proposta pelo id;
</p>



