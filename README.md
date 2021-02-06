# Desafio Stone - Vitor Vidal - vitorvidal.dev@gmail.com

## Instruções para compilação e execução

Para facilitar os testes do programa, abaixo estão as instruções para compilar e executar o programa usando Docker e usando o Terminal do sistema operacional.

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

Para facilitar os testes, as listas de item e email estão em arquivos textos independentes. A seguir estão as instruções para a edição desses arquivos.

### emails.txt

Esse arquivo contém a lista de emails que será usada no programa. 

Deve-se garantir, em caso de edição, que cada linha do arquivo corresponda a um email. Exemplo:

```
vitorvidal.dev@gmail.com
vitorvidal@unifei.edu.br
maria@gmail.com
joao@outlook.com
```

### items.txt

Esse arquivo contém a lista de itens que será usada no programa.

Cada linha corresponde a um item. Os itens adicionados devem necessariamente seguir esse padrão.

Um item é composto pelos parâmetros 'nome', 'preço' e 'quantidade'. Cada linha do arquivo texto contém esses parâmetros, nessa ordem, separados por um ponto e vírgula. O último valor da linha, correspondente a quantidade do item, não é seguido de ponto e vírgula.

Exemplo:
```
biscoito;400;10
ventilador;70000;1
```

Os itens adicionados devem necessariamente seguir a ordem:

| Nome | Preço | Quantidade |