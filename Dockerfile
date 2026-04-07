FROM maven:3.9.6-eclipse-temurin-11

WORKDIR /app

COPY . .

# Instala Allure
RUN apt-get update && \
    apt-get install -y wget unzip && \
    wget https://github.com/allure-framework/allure2/releases/download/2.24.0/allure-2.24.0.zip && \
    unzip allure-2.24.0.zip && \
    mv allure-2.24.0 /opt/allure && \
    ln -s /opt/allure/bin/allure /usr/bin/allure

CMD mvn clean test && allure generate target/allure-results --clean -o allure-report