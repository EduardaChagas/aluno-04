# Nota da especificação

## Visão Geral

A especificação analisada estava bem simples, possuindo apenas 3 métodos básicos, sem muitos detalhes. Além disso, não especifica como deve ser feita a fila ou seja não diz se é por meio de lista ou array, por exemplo. Poderia ter mais métodos úteis para uma fila tais como o método size() que retorna o tamanho da fila e o método clear() que limpa a fila. Há o comportamento dos métodos que geram exceções, mas não especifica qual o tipo de exceção que pode ser dada, encontrando essa informação somente na implementação do código.

## Métodos utilizados

Na especificação, a assinatura não está completa e falta as informações do retorno dos métodos. Como já dito existem apenas 3 métodos. Vamos analisar a seguir cada um deles.

### Método Add()

É um método que adiciona um objeto qualquer na fila sempre no final, respeitando as regras de uma fila. A parte estranha desse método é que o mesmo está programado para retornar 'true' sempre, ou seja, mesmo que devido a algum problema o elemento não seja adicionado na fila, o retorno do método sempre vai ser 'true' o que não é 100% confiável. Embora aconteça esse fato, os casos de testes passaram.

### Método Remove()

É um método que remove e retorna o primeiro elemento da fila. Se a fila estiver vazia, gera a exceção NoSuchElementException, conforme esperado. Caso a fila não estiver vazia, remove e retorna o elemento desejado, conforme a especificação. Então, este método não apresenta problemas nos testes.

### Método Element()

É um método que apenas retorna o primeiro elemento da fila. Se a fila estiver Se a fila estiver vazia, gera a exceção NoSuchElementException, conforme esperado. Caso a fila não estiver vazia, retorna o elemento desejado, conforme a especificação e, portanto, não apresentou problemas nos testes.
