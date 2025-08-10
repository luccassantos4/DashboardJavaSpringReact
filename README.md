
# DSMeta - Dashboard de Relatório de Vendas

> Sistema full stack para visualização de vendas, envio de notificações por SMS e análise de desempenho de vendedores. Desenvolvido com Java Spring Boot no backend e React no frontend.

---

## :rocket: Visão Geral

O **DSMeta** é um dashboard interativo que permite filtrar, visualizar e notificar vendas realizadas por vendedores. O sistema integra uma API RESTful, banco de dados em memória, frontend responsivo e envio de SMS via Twilio.

---

## :computer: Tecnologias Utilizadas

### Backend
- **Java 11**
- **Spring Boot** (Web, Data JPA, Security)
- **Lombok**
- **Banco de Dados H2** (em memória)
- **Twilio API** (envio de SMS)

### Frontend
- **React 18**
- **TypeScript**
- **Vite**
- **Axios**
- **React Datepicker**
- **React Toastify**

---

## :gear: Funcionalidades

- Listagem de vendas com filtros por data
- Visualização de dados: vendedor, visitas, vendas, valor total
- Envio de notificação por SMS para o vendedor destaque
- Integração frontend-backend via API REST
- Interface responsiva e intuitiva

---

## :triangular_flag_on_post: Como Executar o Projeto

### Pré-requisitos
- Node.js 16+
- Java 11+
- Maven

### 1. Backend

```bash
# Acesse a pasta backend
cd backend
# Instale dependências e rode a aplicação
mvn spring-boot:run
```
O backend estará disponível em `http://localhost:8080`.

#### Configuração do Twilio (opcional para SMS)
Defina as variáveis de ambiente no arquivo `application.properties`:
```
twilio.sid=SEU_TWILIO_SID
twilio.key=SEU_TWILIO_KEY
twilio.phone.from=SEU_NUMERO_TWILIO
twilio.phone.to=NUMERO_DESTINO_TESTE
```

### 2. Frontend

```bash
# Acesse a pasta frontend
cd frontend
# Instale as dependências
npm install
# Rode o projeto
npm run dev
```
O frontend estará disponível em `http://localhost:5173` (ou porta informada pelo Vite).

---

## :mag: Estrutura do Projeto

```
backend/
  └─ src/main/java/com/github/luccassantos4/dsmeta/
      ├─ controllers/   # Endpoints REST
      ├─ entities/      # Entidades JPA
      ├─ repository/    # Repositórios Spring Data
      └─ services/      # Lógica de negócio e integração Twilio
frontend/
  └─ src/
      ├─ components/    # Componentes React (Header, SalesCard, NotificationButton)
      ├─ models/        # Tipos TypeScript
      └─ utils/         # Configuração de requisições
```

---

## :iphone: Demonstrações Visuais

<div align="center">
  <h4>Tela inicial - Dashboard de Vendas</h4>
  <img height="400" width="900" src="https://user-images.githubusercontent.com/62127980/204376816-c1b49e9a-59be-4467-ba0e-31b8986b81d2.png">
</div>

<div align="center">
  <h4>Envio de Notificação SMS</h4>
  <img height="350" width="700" src="https://user-images.githubusercontent.com/62127980/204376825-3b506656-6b1a-423e-b988-67ead6b9275a.png">
</div>

<div align="center">
  <h4>Exemplo de SMS Recebido</h4>
  <img height="150" width="400" src="https://user-images.githubusercontent.com/62127980/204376826-50b5d523-85e5-43d3-93da-4a776f27584a.jpg">
</div>

---

## :bookmark_tabs: Observações

- O banco de dados H2 é populado automaticamente com dados de exemplo ao iniciar o backend.
- O envio de SMS depende de configuração válida do Twilio.
- O frontend consome a API backend via variável de ambiente `VITE_BACKEND_URL` (padrão: `http://localhost:8080`).

---
