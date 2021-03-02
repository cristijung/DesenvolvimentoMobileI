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
