# 📄 Documentação: `Contador.java`

## 📌 Descrição

O programa `Contador` solicita dois números inteiros do usuário e imprime uma contagem com base na diferença entre esses dois valores. Caso o segundo número seja menor que o primeiro, uma exceção personalizada é lançada.

---

## 🧠 Funcionamento

1. O usuário informa dois parâmetros inteiros via terminal.
2. O programa verifica se o segundo parâmetro é maior que o primeiro.
3. Se for, imprime uma contagem até a diferença entre os dois números.
4. Caso contrário, lança uma exceção do tipo `ParametrosInvalidosException`.

---

## 📦 Estrutura do Código

### Classe Principal: `Contador`

Contém o método `main` que:
- Lê dois valores inteiros do usuário usando `Scanner`.
- Chama o método `contar`.
- Trata a exceção `ParametrosInvalidosException`.

---

### Classe Interna: `ParametrosInvalidosException`

```java
public static class ParametrosInvalidosException extends Exception {}
```

- Uma exceção personalizada que estende `Exception`.
- Lançada quando o segundo parâmetro é menor que o primeiro.

---

### Método: `contar(int parametroUm, int parametroDois)`

```java
static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{}
```

#### Parâmetros:
- `parametroUm`: valor inteiro inicial.
- `parametroDois`: valor inteiro final.

#### Lógica:
- Verifica se `parametroUm > parametroDois`.
    - Se verdadeiro, lança `ParametrosInvalidosException`.
- Caso contrário, imprime a contagem de `1` até `parametroDois - parametroUm`.

---

## 💻 Exemplo de Execução

```
Digite o primeiro parâmetro: 3
Digite o segundo parâmetro: 7
Imprimindo número 1
Imprimindo número 2
Imprimindo número 3
Imprimindo número 4
```

---

## ❗ Possíveis Erros

- Se o segundo parâmetro for menor que o primeiro, ocorre:
  ```
  Erro: O segundo parametro deve ser maior que o primeiro
  ```

---

## 🛠️ Sugestões de Melhoria

- Validar a entrada do usuário para garantir que sejam números.
- Permitir reentrada em caso de erro.
- Mostrar o valor real da contagem (`parametroUm + i`) ao invés de apenas `i + 1`.
