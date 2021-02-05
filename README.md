# Desafio Stone - Vitor Vidal - vitorvidal.dev@gmail.com

## Instruções para compilação e execução

### Docker

Para executar o programa usando docker, basta efetuar os seguintes comandos

```
docker build -t desafio .
```

```
docker run -it --rm --name desafio desafio
```

Em caso de edição dos arquivos texto que contém as listas, é preciso executar todos os comandos acimas novamente.

### Terminal

**É preciso instalar e configurar o seu sistema operacional para executar programas em Java.**

Para compilar a solução, execute
```
javac Main.java
```

Para executar o programa, digite
```
java Main
```

Em caso de edição dos arquivos texto que contém as listas, é preciso executar somente o último comando acima.

## Instruções para mudar os valores das listas de email e item

### emails.txt

Esse arquivo contém a lista de emails que será usada no programa. 

Deve-se garantir, em caso de edição, que cada linha do arquivo corresponde a um email. O programa não irá considerar múltiplos emails em uma mesma linha.

### items.txt

Esse arquivo contém a lista de items que será usada no programa.

Cada linha corresponde a um item. Os itens adicionados devem necessariamente seguir esse padrão.

Um item é composto pelos parâmetros 'nome', 'preço' e 'quantidade'. Cada linha do arquivo texto contém esses parâmetros, nessa ordem, separados por um ponto e vírgula. O último valor da linha, correspondente a quantidade do item, não é seguido de ponto e vírgula.

Exemplo:

```
biscoito;400;10
ventilador;70000;1
```

Os itens adicionados devem necessariamente seguir a ordem 'nome';'preço';'quantidade'.