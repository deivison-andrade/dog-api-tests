#  Dog API - Testes Automatizados

[[CI](https://github.com/deivison-andrade/dog-api-tests/actions/workflows/tests.yml/badge.svg)](https://github.com/deivison-andrade/dog-api-tests/actions)

##  Sobre o Projeto

Este projeto contém testes automatizados para validação da Dog API (https://dog.ceo/dog-api/).

O objetivo é garantir:

* ✔ Validação de status code
* ✔ Estrutura de resposta
* ✔ Conteúdo retornado
* ✔ Cenários positivos e negativos

---


##  Tecnologias Utilizadas

* Java 11
* Maven
* RestAssured
* JUnit 5
* Allure Reports


---

#  Como Executar o Projeto


---

#  1. Execução LOCAL 

##  Pré-requisitos

* Java 11+
* Maven instalado

### Verificar instalação:

```bash
java -version
mvn -version
```

---

## Passo a passo

```bash
git clone <https://github.com/deivison-andrade/dog-api-tests.git>
cd dog-api-tests
mvn clean test
```

---

## Relatório Allure (opcional)

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



##  Relatório

Após a execução, o relatório será gerado na pasta:

```bash
allure-report/
```

###  Abrir relatório:



```bash
start allure-report/index.html
```
---



#  Estrutura do Projeto

```bash
src/test/java/
├── base/
├── tests/
└── utils/

src/test/resources/
└── schemas/
```

---

#  Autor

Desenvolvido por Deivison Andrade 🚀
