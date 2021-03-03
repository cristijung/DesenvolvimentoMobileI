# DesenvolvimentoMobileI
_____________________________________________________________
## Aula I
O que é um desenvolvedor mobile? O que faz? Como é o mercado? Qual a remuneração?
Linguagem de Programação Java e suas características
Variáveis e constantes;  
Convenções de Nomes na declaração do Java
Bloco de programa do Java
_____________________________________________________________
##  Aula II
Continuação da Estrutura do Código Java
Estrutura do Programa Java

As primeiras coisas que devem ser abordadas para começar a desenvolver em qualquer
linguagem são:
 
- Bloco do programa;
- Declarar variáveis;
- Sintaxes dos comandos; 
Classe Main

Quando escrevemos o código fonte de um programa em Java e o compilamos, ele é transformado em bytecode, que nada mais é que uma linguagem intermediária interpretada por uma máquina virtual,  a JVM (Java Virtual Machine). É a JVM que faz a ponte entre seu código fonte e a máquina, convertendo os bytecodes. Alguns criticam esse reprocessamento porque a linguagem perderia desempenho se comparada com outras, como o C, em que compilamos o código diretamente para linguagem de máquina.
Um projeto em Java pode ser composto por diversas classes. Mas uma delas deve ser responsável pela execução do programa, um ponto de partida. 


Um início. Normalmente chamamos essa classe de Programa, Principal, Main, Teste, etc. Essa classe não possui atributos, e normalmente possui apenas um método chamado de main (principal, em inglês). Nesta classe inserimos os comandos para o programa “funcionar”. Esta é a classe que será “executada”. E que nos retornará finalmente algo na  tela.
O que são métodos? (genérico)
Um método em Java é equivalente a uma função, subrotina ou procedimento em outras linguagens de programação. Não existe em Java o conceito de métodos globais. Todos os métodos devem sempre ser definidos dentro de uma classe.
 
MÉTODOS DE SAÍDA DE DADOS (IMPRESSÃO NA TELA)
Método System.out.println()

A instrução System.out.println(), gera uma saída de texto entre aspas duplas significando uma String, criando uma nova linha e posicionando o cursor na linha abaixo, o que é identificado pela terminação “ln”. 
Sempre temos a possibilidade de mandar mensagens ao usuário, essas mensagens podem conter somente texto, somente respostas, textos e respostas, texto, respostas e mais texto... Isso é possível através de um método de saída de dados, o método out, este método é da classe do sistema, class System, portanto o comando fica: System.out.print(“mensagem”);
__________________________________________________________
## Aula III

Estruturas de decisão e escolha - Condicionais

As linguagens de programação normalmente possuem duas estruturas que permitem a análise condicional de dados, o if(se) e o switch(troca). 

As estruturas de seleção ou decisão são utilizadas quando existe a necessidade de verificar condições para a realização de uma instrução ou de uma sequência de instruções. Os testes de seleção também podem ser utilizados para verificar opções de escolha. 
A seguir são apresentados exemplos para os dois casos. Suponha que uma pessoa esteja jogando um jogo de computador: 

1. Para que o jogador passe de uma fase (etapa) para a fase seguinte, é necessário que se verifique se ele atingiu a pontuação exigida. Assim, existe uma condição para a realização de uma sequência de instruções para liberar o acesso à próxima fase do jogo. 
2. Ao final do jogo, uma pergunta é feita: "Deseja continuar jogando?" O jogador poderá escolher entre as respostas sim ou não. As estruturas de seleção podem ser do tipo simples, composto ou encadeado. 

São utilizadas para verificar se dada condição é atendida: se for, um conjunto de instruções deverá ser executado; se não for, o fluxo da execução do algoritmo seguirá após o fim do bloco de decisão. 

Vamos nos concentrar no if(se):
A estrutura if é utilizada para que o sistema teste possibilidades, e de acordo com cada possibilidade executa um ou mais comandos. Por esta razão muitas vezes é chamado de desvio condicional, ou estrutura de decisão. A estrutura if é utilizada para gerenciar as condições de um programa; assim, podemos programar para que o computador execute um bloco de comandos caso a condição seja verdadeira, ou um outro bloco de comandos caso seja falsa.


Observação: Toda condição pode ser encarada como uma pergunta que pode ter a resposta verdadeiro (.v.) ou falso (. f.). 

## Estruturas de Seleção Compostas

A estrutura de seleção composta prevê uma condição com dois conjuntos de instruções para serem realizados de acordo com a avaliação da resposta: um bloco de instruções para resposta verdadeiro e um bloco de instruções para resposta falso. 
if ---> SE
else ---> senão

## Estruturas de seleção encadeadas

Uma estrutura de seleção encadeada é uma seqüência de testes de seleção, os quais serão executados ou não de acordo com o resultado das condições e de acordo com o encadeamento dos testes, isto é, um teste de seleção pode ter dois conjuntos de instruções, conforme visto na Seção "Estruturas de seleção compostas", um para resultado verdadeiro e outro para falso; porém, esses conjuntos de instruções podem conter outros testes de seleção, que por sua vez também podem conter outros e assim por diante. 

## Estrutura de seleção de múltipla escolha - Switch

Uma estrutura de seleção de múltipla escolha é uma estrutura de seleção que ' funciona como um conjunto de opções para escolha. 
É também denominada estrutura de seleção homogênea. Existem duas maneiras para representá-la: utilizando o encadeamento da instrução se e utilizando a instrução escolha caso. A segunda opção é a mais indicada.Uma estrutura de seleção de múltipla escolha é uma estrutura de seleção que ' funciona como um conjunto de opções para escolha. 
É também denominada estrutura de seleção homogênea. Existem duas maneiras para representá-la: utilizando o encadeamento da instrução se e utilizando a instrução escolha caso. A segunda opção é a mais indicada.
