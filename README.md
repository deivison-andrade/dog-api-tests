# 🐶 Dog API - Testes Automatizados

## 📌 Sobre o Projeto

Este projeto contém testes automatizados para validação da Dog API (https://dog.ceo/dog-api/).

O objetivo é garantir:

* ✔ Validação de status code
* ✔ Estrutura de resposta
* ✔ Conteúdo retornado
* ✔ Cenários positivos e negativos

---

## 🚀 Tecnologias Utilizadas

* Java 11
* Maven
* RestAssured
* JUnit 5
* Allure Reports
* Docker
* GitHub Actions (CI/CD)

---

# ⚙️ Como Executar o Projeto

Você pode rodar o projeto de **duas formas**:

---

# 🧪 1. Execução LOCAL (sem Docker)

## 📋 Pré-requisitos

* Java 11+
* Maven instalado

### 🔎 Verificar instalação:

```bash
java -version
mvn -version
```

---

## ▶️ Passo a passo

```bash
git clone <https://github.com/deivison-andrade/dog-api-tests.git>
cd dog-api-tests
mvn clean test
```

---

## 📊 Relatório Allure (opcional)

### Instalar Allure:

**Mac:**

```bash
brew install allure
```

**Windows:**

```bash
npm install -g allure-commandline
```

---

### Gerar relatório:

```bash
allure serve target/allure-results
```

---

# 🐳 2. Execução com Docker (RECOMENDADO)

👉 Essa abordagem garante que o projeto rode em qualquer máquina sem precisar instalar Java ou Maven.

---

## 📋 Pré-requisitos

* Docker instalado

👉 Download:
https://www.docker.com/products/docker-desktop/

---

## ▶️ Passo a passo

### 🔨 1. Build da imagem

```bash
docker build -t dog-api-tests .
```

---

### ▶️ 2. Rodar os testes

### 💻 Windows (PowerShell):

```bash
docker run --rm -v ${PWD}:/app dog-api-tests
```

### 💻 Windows (CMD):

```bash
docker run --rm -v %cd%:/app dog-api-tests
```

### 🍎 Mac / 🐧 Linux:

```bash
docker run --rm -v $(pwd):/app dog-api-tests
```

---

## 📊 Relatório

Após a execução, o relatório será gerado na pasta:

```bash
allure-report/
```

### 👉 Abrir relatório:

**Windows:**

```bash
start allure-report/index.html
```

**Mac:**

```bash
open allure-report/index.html
```

---

# ⚙️ CI/CD (Execução Automática)

O projeto possui integração com GitHub Actions.

A cada push na branch `main`:

* 🐳 Build da imagem Docker
* 🧪 Execução dos testes
* 📊 Geração do relatório Allure
* 📦 Upload do relatório como artefato

---

## 📥 Como acessar o relatório no GitHub

1. Acesse a aba **Actions**
2. Clique no último workflow executado
3. Baixe o artefato **allure-report**
4. Abra o arquivo `index.html`

---

# 📁 Estrutura do Projeto

```bash
src/test/java/
├── base/
├── tests/
└── utils/

src/test/resources/
└── schemas/
```

---

# 🧠 Diferenciais do Projeto

* ✔ Testes automatizados de API
* ✔ Estrutura organizada e escalável
* ✔ Testes positivos e negativos
* ✔ Validação de resposta
* ✔ Relatório Allure
* ✔ Execução via Docker
* ✔ Pipeline CI/CD com GitHub Actions

---

# 💬 Considerações Finais

Este projeto foi desenvolvido seguindo boas práticas de qualidade de software, com foco em:

* Manutenibilidade
* Reprodutibilidade
* Clareza de execução
* Portabilidade entre ambientes

---

# 👨‍💻 Autor

Desenvolvido por Deivison Andrade 🚀
