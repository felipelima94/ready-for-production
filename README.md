# Getting Started

## Descrição

A aplicação é uma api que permite gravar mensagens e recuperar as mensagens gravadas 

## 🛠️ Ferramentas
```
- Java: linguagem
- Maven: gerenciador de dependências
- H2: banco de dados
```

## 🏠 Execução em localhost

Segue os passos para preparar do ambiente de desenvolvimento na máquina local e conseguir executar a aplicação em localhost:

### 📋 Requisitos

```
- Docker
```
ou

```
- Java 17.x.x
- Maven 3.x.x
```

### 🔧 Instalação

Com o Docker:

```
$ docker build -t getting-started-api:latest .
$ docker run -p 8080:8080 getting-started-api:latest
```

Com Java e Maven:

```
$ mvn clean package -DskipTests
$ java -jar target/getting-started-api-0.0.1.jar
```

## 🔁 Atualização

Para aplicar uma atualização da aplicação, é preciso subir o commit na branch `master` e criar uma `release`. Com a release criada, um workflow do `GitHub Actions` sera responsável por buildar e publicar a imagem da aplicação em um repositório na AWS

## 📦 Implantação

A aplicação esta sendo executada por meio de de um container em um cluster `Kubernetes`. Para realizar a manutenção dos seus ambientes, é necessário realizar as mudanças no Dockerfile localizado na raiz do projeto e nos seus respectivos manifestos Kustomization dentro do diretório `k8s/overlays`. Depois de versionar a alteração do kustomization, o `ArgoCD` sera resposável por aplicar automaticamente no Kubernetes

## 📄 Documentação

- [Endpoints](/doc/endpoint.md)
