# Tabela Hash com Encadeamento

## Descrição

Este projeto foi desenvolvido em Java e tem como objetivo implementar uma tabela hash com 100 posições, realizando a inserção de 1.000 números inteiros aleatórios.

Quando ocorre uma colisão, ou seja, quando dois ou mais números são direcionados para a mesma posição, os elementos são armazenados em uma lista simplesmente encadeada.

## Funcionamento

O programa realiza as seguintes operações:

1. Cria uma tabela com 100 posições.
2. Gera 1.000 números aleatórios entre 0 e 100.000, utilizando `Random` com a seed `1090`.
3. Calcula a posição de cada número utilizando o operador módulo (`numero % 100`).
4. Caso a posição esteja vazia, insere o número diretamente.
5. Caso ocorra uma colisão, adiciona o novo elemento ao final da lista encadeada.
6. Após todas as inserções, apresenta os resultados obtidos.

## Estrutura utilizada

Foi criada uma classe `No`, responsável por armazenar o valor do elemento e a referência para o próximo nó da lista.

A implementação utiliza vetores, estruturas condicionais (`if` e `else`) e estruturas de repetição (`for` e `while`), sem utilizar estruturas de dados prontas, como `LinkedList` ou `ArrayList`.

## Resultados

Ao final da execução, o programa apresenta:

- Quantidade de listas que tiveram colisões.
- Quantidade de posições vazias.
- Número total de colisões.
- Posição e elementos da maior lista encadeada.
- Os três últimos valores inseridos em listas por colisão.

Com a seed `1090`, foram obtidos os seguintes resultados:

| Informação | Resultado |
|---|---|
| Elementos inseridos | 1.000 |
| Listas com colisões | 100 |
| Posições vazias | 0 |
| Total de colisões | 900 |
| Maior lista | Posição 62, com 17 elementos |
| Últimos três valores | 28163, 20395 e 33346 |

## Como executar

O programa pode ser executado em qualquer ambiente com suporte a Java.

Para compilar e executar pelo terminal:

```bash
javac Main.java
java Main
```

## Conclusão

O projeto demonstra o funcionamento de uma tabela hash utilizando encadeamento para resolver colisões. A implementação permite armazenar diversos elementos na mesma posição, mantendo os valores organizados em listas encadeadas.

Dessa forma, foi possível aplicar conceitos de vetores, referências entre nós, estruturas de repetição e tratamento de colisões.
