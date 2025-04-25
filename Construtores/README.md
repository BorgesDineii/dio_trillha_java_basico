# 🚀 Construtores em Java

Este repositório tem como objetivo apresentar de forma simples e prática o uso de **construtores em Java**, um dos fundamentos da programação orientada a objetos.

## 🧱 O que é um Construtor?

Um **construtor** é um **método especial** usado para **inicializar objetos** de uma classe. Ele é chamado automaticamente **no momento da criação do objeto**, utilizando a palavra-chave `new`.

## 🧰 Tipos de Construtores

### 1. 🔹 Construtor Padrão (sem parâmetros)
Se você **não declarar nenhum construtor**, o Java cria um automaticamente.  
Ou você pode criar manualmente:

```java
public class Pessoa {
    public Pessoa() {
        // Código de inicialização
        System.out.println("Objeto Pessoa criado!");
    }
}
