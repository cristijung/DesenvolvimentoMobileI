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

________________________________________________________________
##  Aula IV e V - Desenvolvimento de Aplicativo I
- Introdução a Orientação a Objeto
- Conceitos sobre a Orientação a Objeto
- Classes
- Encapsulamento
- Público & Privado
- Métodos Acessores
- Representação gráfica da classe

## Programação Orientada a Objeto

Até o início da década de 70, o computador era utilizado somente por grandes empresas. Neste período, com a queda de preço dos computadores e a consequente proliferação de uso destes, cresceu a demanda por software. As técnicas de desenvolvimento de software utilizadas até então não eram suficientes para contornar problemas existentes no desenvolvimento de sistemas, principalmente quando desenvolvidos em grande escala, como então se exigia. Na verdade, pouco se possuía de técnicas que estivessem realmente sendo aplicadas.

##  Na programação orientada a Objetos

Os objetos são a chave para a compreensão da tecnologia orientada a objeto. Olhe em volta agora e
você vai encontrar muitos exemplos de objetos do mundo real: seu cachorro, sua mesa, sua televisão. Os objetos do mundo real partilham duas características: eles possuem estado e comportamento. Os cães têm estado (nome, cor, raça) e comportamento (latidos, cheirando, abanando o rabo). Bicicletas também

A programação orientada a objetos representa uma mudança no enfoque da programação, na forma como os sistemas eram vistos até então. Representa uma quebra de paradigma, revolucionando todos os conceitos de projeto e desenvolvimento de sistemas existentes anteriormente.

O enfoque tradicional para o desenvolvimento de sistemas e, por consequência, para a programação, baseia-se no conceito de que um sistema é um conjunto de programas inter-relacionados que atuam sobre um determinado conjunto de dados que se deseja manipular de alguma forma para obter os resultados desejados. 

O enfoque da modelagem de sistemas por objetos procura enxergar o mundo como um conjunto de objetos que interagem entre si e apresentam características e comportamento próprios representados por seus atributos e suas operações. Os atributos estão relacionados aos dados, e as operações, aos processos que um objeto executa. Assim, supondo que se deseje desenvolver um sistema de controle de estoque para uma empresa, procura-se identificar os objetos relacionados ao sistema, como os produtos, os pedidos de compra, os recibos, as pessoas etc., conforme está detalhado a seguir. 

Pode-se dizer que é possível modelar, por meio da orientação a objetos, um setor, um departamento e até uma empresa inteira. Esse enfoque justifica-se, de forma resumida, pelo fato de que os objetos existem na natureza muito antes de haver qualquer tipo de negócio envolvido ou qualquer tipo de sistema para controlá-los. Equipamentos, pessoas, materiais, produtos, peças, ferramentas, combustíveis etc. existem por si sós e possuem características próprias determinadas pelos seus atributos (nome, tamanho, cor, peso) e um determinado comportamento no mundo real relacionado aos processos que eles sofrem.  

## 0 que é um Objeto

Um dos primeiros conceitos básicos da orientação a objetos é o do próprio objeto. Um objeto é uma extensão do conceito de objeto do mundo real, em que se podem ter coisas tangíveis, um incidente (evento ou ocorrência) ou uma interação (transação ou contrato). 

## Por exemplo, em um sistema acadêmico em que João é um aluno objeto e Carlos é um professor objeto que ministra aulas objeto da disciplina objeto algoritmos, para que João possa assistir às aulas da disciplina do prof. Carlos, ele precisa fazer uma matricula objeto no curso objeto de computação. 

Têm-se as ocorrências de objetos mencionados. 
• tangíveis: aluno e professor; 
• incidente: curso, disciplina, aula; 
• interação: matrícula. 

A identificação dos objetos em um sistema depende do nível de abstração de quem faz a modelagem, podendo ocorrer a identificação de diferentes tipos de objetos e diferentes tipos de classificação desses objetos. Não existe um modelo definitivamente correto; isso vai depender de quem faz a modelagem e de processos sucessivos de refinamento, até que se possa encontrar um modelo adequado a sua aplicação.

Como visualizar um Objeto?  

Pode-se imaginar um objeto como algo que guarda dentro de si os dados ou informações sobre sua estrutura (seus atributos) e possui um comportamento definido pelas suas operações. 
- objeto 
- operações 
- estrutura de dados

![classeNumero](https://user-images.githubusercontent.com/17149877/110023388-e846d300-7d0b-11eb-9bf9-9df208754fbf.png)
___________________________________________________________________

## Exemplo  de exibição gráfica de classe:

![uml](https://user-images.githubusercontent.com/17149877/110050618-0e339e00-7d33-11eb-80e7-1befec0de973.png)
