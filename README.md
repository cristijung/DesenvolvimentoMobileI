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

__________________________________________________________________

## Aula IV e V Desenvolvimento de Aplicativos I - Lógica e Orientação à Objeto

Métodos acessores

Todo o atributo que conter visibilidade private, terá que possuir dois métodos especiais, um método de acesso set para o caso de poder ser alterado, e um método de consulta get para o caso de poder ser consultado. Método set 

O set: é utilizado para que se consiga enviar uma informação para um atributo. 
Exemplo: informar um nome que será guardado na variável-atributo nome. 
O set se caracteriza por ser um método sem retorno, já que seu objetivo é simplesmente armazenar um dado num atributo, e obrigatoriamente deve conter argumento, pois precisa receber um valor externo para poder armazená-lo no atributo. 

Método get: O get é utilizado para consultar/obter o valor de um atributo. Sua função é retornar o valor de um atributo específico. Portanto, sempre tem retorno, e não precisa ter argumentos.

![Sem título](https://user-images.githubusercontent.com/17149877/110377739-86e87200-8033-11eb-820f-972261ff34d4.png)

Por convenção, os métodos responsáveis por modificar o estado interno de um objeto como fazem os métodos “A” e “C” no exemplo são denominados como métodos set e métodos responsáveis por retornar o valor do estado interno de um objeto são denominados como métodos get.

Implementando os métodos gets e sets na classe
Aplicando os conceitos de modificadores de acesso e encapsulamento a classe Cliente é implementada conforme imagem abaixo.

Entendendo o código fonte
 
Logo na linha 2 durante a declaração da classe é informado que a mesma deve ser pública através do modificador de acesso public, podendo ser acessada por qualquer outra classe do sistema.

![Sem título](https://user-images.githubusercontent.com/17149877/110378023-dcbd1a00-8033-11eb-8fb1-6937e45e67e6.png)

## Representação de Visibilidade no Diagrama UML - Outro exemplo

No exemplo acima, percebemos que o atributo nome é de acesso público e os atributos idade e peso são de acessos privados. 
Para estes últimos, teremos dois métodos especiais, um setIdade e getIdade e o setPeso e getPeso. O acesso a estes dados será por intermédio destes métodos, enquanto que o atributo nome, por ter sido definido como público, dispensa estes métodos já que o acesso a ele é direto.

Observando a sintaxe acima, notamos que no método setIdade possui um argumento int idade, e no método setPeso, temos o argumento double peso. Através destes argumentos que os dados serão passados aos atributos privados.

![Sem título](https://user-images.githubusercontent.com/17149877/110378210-12620300-8034-11eb-93ca-45b4e19c0761.png)

## Método Construtor

Em Java, o construtor é definido como um método cujo nome deve ser o mesmo nome da classe e sem indicação do tipo de retorno -- nem mesmo void. O construtor é unicamente invocado no momento da criação do objeto através do operador new. O retorno do operador new é uma referência para o objeto recém-criado.

![Sem título](https://user-images.githubusercontent.com/17149877/110378373-476e5580-8034-11eb-9118-4cef3f9e5c5f.png)

____________________________________________________________________
## Aula VI - Desenvolvimento de Aplicativo I - Java  Orientado a Objeto

O método toString
 
É muito comum que existam situações em que se deseja exibir os dados presentes no estado interno de um objeto. Nestes casos também é comum que existam informações que não seja de interesse que sejam expostas, ou então é importante que estas informações sofram algum tipo de tratamento antes de serem disponibilizadas. 
 
Um exemplo comum são os valores de tipo booleanos onde normalmente um texto é apresentado ao invés de “verdadeiro” ou “falso”.


É comum na programação orientada a objetos que haja um método nas classes responsável por retornar os valores presentes no estado interno do objeto e que são de interesse de serem expostos e em um formato adequado. Este método é comumente denominado de toString.

Implementamos o método toString para retornar o objeto em formato de texto. Ele simplifica a exibição dos atributos do objeto, convertendo o objeto para texto. Neste método, determinamos como os atributos devem ser exibidos.

Sintaxe do método toString 

Este método não pode ser criado de qualquer maneira. Ele possui uma sintaxe padrão, onde alteramos apenas o que vai no “return”. O nome deve ser toString, sempre deve retornar uma String e não possui argumentos. 

![1](https://user-images.githubusercontent.com/17149877/110527229-76003500-80f5-11eb-9853-f581a6c5c3c4.png)

___________________________________________________________________
## Aula VII  - Desenvolvimento de Aplicativo  I - Java Orientado a Objeto  - Laços

Laços de Repetição

Os laços permitem que um determinado bloco de comandos seja executado repetidamente a partir de uma condição. Este tipo de instrução é utilizada em menus (onde o programa irá repetir enquanto o usuário quiser utilizá-lo), em pesquisas (onde podemos determinar a quantidade de pessoas que irão interagir com o programa respondendo a enquete) e, ou até mesmo em métodos que precisam ser executados várias vezes até encontrar a resposta desejada, por exemplo: fatorial de um número. Estas estruturas também ajudam a evitar que se escreva o mesmo comando várias vezes

Tipos de Laços de Repetição: 
 Cada linguagem de programação oferece algumas estruturas para desenvolver algoritmos com laços de repetição. Em Java, trabalhamos basicamente com os comandos: 
while:  enquanto 
do while:  faça enquanto 
for:  para


Tipos de execução:
Laços Determinados:  Os laços determinados são aqueles nos quais nós como programadores temos o controle de quantas vezes o loop será executado, ou seja, sabemos o número de vezes que a instrução irá repetir, temos o controle do início e do fim do laço. 
Exemplos de Laços Determinados: - Uma enquete onde o objetivo é entrevistar 50 pessoas. Neste laço sabemos que a enquete será repetida 50 vezes, e que o início será na 1ª pessoa entrevistada, e o fim será na 50ª pessoa entrevistada.

Os laços indeterminados: são aqueles nos quais não temos controle de quantas vezes serão executados, portanto sabemos o seu início, porém não sabemos o seu fim. 
Exemplos de Laços Indeterminados: - O usuário escolhe se deseja sair ou deseja testar o programa mais vezes. Até agora nossos programas foram executados apenas uma vez, para testarmos novamente temos que fechar o terminal e reabri-lo. Para não termos esse trabalho, podemos apenas colocar um loop no programa e fazer com que antes de terminar o programa o mesmo mostre na tela a seguinte mensagem: 




Resumindo!
As estruturas de repetição também são conhecidas como laços (loops) e são utilizadas para executar, repetidamente, uma instrução ou bloco de instrução enquanto determinada condição estiver sendo satisfeita.
Qualquer que seja a estrutura de repetição, ela contém quatro elementos fundamentais: inicialização, condição, corpo e iteração. 
A inicialização compõe-se de todo código que determina a condição inicial da repetição. 
A condição é uma expressão booleana avaliada após cada leitura do corpo e determina se uma nova leitura deve ser feita ou se a estrutura de repetição deve ser encerrada. 
O corpo compõe-se de todas as instruções que são executadas repetidamente. 
A iteração é a instrução que deve ser executada depois do corpo e antes de uma nova repetição.




While (enquanto):
O laço de repetição while caracteriza-se por ter seu teste de execução antes de iniciar o loop. Neste tipo de laço nem sempre temos a execução dos comandos, ou seja, nem sempre ele entra no loop, traduzindo, o While é utilizado para construir uma estrutura de repetição que executa, repetidamente, uma única instrução ou um bloco delas “enquanto” uma expressão booleana for verdadeira. 

Sintaxe básica:
                          enquanto a condição for verdadeira {
                               executa as instruções
                           }



Exemplos:
int x = 0;
while (x < 10) {
    System.out.println("Item " + x);
    x++;
}

![Sem título](https://user-images.githubusercontent.com/17149877/110692917-a44d4580-81c5-11eb-8646-5076ecccc05b.png)

Do While (faça enquanto): 
A estrutura de repetição do-while é uma variação da estrutura while. Existe uma diferença sutil, porém importante, entre elas. Em um laço while, a condição é testada antes da primeira execução das instruções que compõem seu corpo. Desse modo, se a condição for falsa na primeira vez em que for avaliada, as instruções desse laço não serão executadas nenhuma vez. Em um laço do-while, por outro lado, a condição somente é avaliada depois que suas instruções são executadas pela primeira vez, assim, mesmo que a condição desse laço seja falsa antes de ele iniciar, suas instruções serão executadas pelo menos uma vez.

Condição: O do while executará as instruções enquanto a condição nos parênteses for verdadeira! No momento que a condição for falsa ele para de executar as instruções dentro do bloco do while. 


Observe que na sua primeira execução ele não analisa nenhuma condição: executa primeiro e depois analisa. Instruções – Dentro de um do while podemos utilizar qualquer tipo de instrução, ou seja, podemos: mostrar uma mensagem, declarar variáveis, utilizar if(){}, utilizar um while(){} e assim por diante.

![Sem título](https://user-images.githubusercontent.com/17149877/110693087-d199f380-81c5-11eb-93bc-7fa356ca9214.png)

For (para): 
O for (para, em inglês - quer dizer: “para este caso... fazer...”) pode conter apenas uma instrução no seu corpo. Neste caso não é necessário abrir um bloco. Isso é assim porque o “for” já implementa alguns comandos na sua assinatura, ou seja, no seu cabeçalho, como a inicialização da variável e o passo da re
petição, ou seja, o incremento/decremento da variável (executado sempre no fim de cada ciclo). O laço for é uma estrutura de repetição compacta. Seus elementos de inicialização, condição e iteração são reunidos na forma de um cabeçalho e o corpo é disposto em seguida.
O laço for e o laço while são apenas formas diferentes de uma mesma estrutura básica de repetição. Qualquer laço for pode ser transcrito em termos de um laço while e vice-versa. Do mesmo modo que em um laço while, se a condição de um laço for já é falsa logo na primeira avaliação que se fizer dela, as instruções contidas em seu corpo jamais serão executadas.


Vamos analisar a sintaxe da estrutura for. 
Observe que na primeira linha, dentro dos parênteses, ao invés de termos apenas a condição como acontecia com o while e do while, temos agora três comandos separados por ponto e vírgula. 

![Sem título](https://user-images.githubusercontent.com/17149877/110693195-ef675880-81c5-11eb-94a4-1f689cffd2e8.png)

Comando inicial: Este comando executa apenas uma vez, quando o código entra no loop. Aqui podemos declarar uma variável, por exemplo, como é muito comum. 
Condição: O mesmo tipo de condição que montamos em while e do while. Se ela for verdadeira, as instruções serão executadas. Se for falsa, o loop encerra. 
Comando de loop: Este comando é executado sempre que o for completa uma volta, ou seja, na primeira execução ele pula este comando.

_____________________________________________________________________________________
## Aula VIII -  Array & ArrayList

## Array

Um array é um objeto capaz de armazenar um número fixo de valores de um único tipo. A quantidade de elementos que armazena é estabelecida quando ele é criado e após a criação seu comprimento de mantém fixo (ORACLE, 2012).
O uso de arrays é indicado quando temos uma certa quantidade de elementos que serão manipulados/armazenados. Por exemplo: as notas de um aluno, as questões de uma prova, as alternativas das questões, um conjunto de números, e assim por diante.

![Sem título](https://user-images.githubusercontent.com/17149877/110851590-02def600-8290-11eb-9b81-07ed2dc4bb85.png)


Para que serve um Array?

Um array é uma sequência não ordenada de dados. Os elementos residem em um lugar separado na memória, e seu acesso é feito por meio de um índice na primeira posição de cada elemento




Criando um Array

A declaração de um array utiliza um conjunto de colchetes vazio ao lado do tipo. O tipo pode ser tanto primitivo quanto de referência.
Tipos primitivos: são os tipos de dados básicos da linguagem, com eles podemos criar outros tipos. Exemplos: int, char, byte, boolean, etc.
Tipos de referência: são as classes do sistema, tanto as do Java quanto as criadas pelo programador. Exemplos: String, Pessoa, etc.


Declarações do Array
1ª forma: Declaração e instância em linhas separadas

O exemplo abaixo primeiro declara o Array, utilizando o tipo desejado seguido de colchetes vazios e o nome que se deseja atribuir ao array. Em outra linha, o comando new é responsável pela criação do objeto na memória. No exemplo, seria criado um array com capacidade para 5 números inteiros, organizados em índices de 0 até 4. Cria-se um array vazio, pronto para receber elementos.

![Sem título](https://user-images.githubusercontent.com/17149877/110851698-230eb500-8290-11eb-9d9e-42342ad26ebb.png)

2ª forma: Declaração e instância na mesma linha
O exemplo abaixo é uma forma abreviada de declarar e instanciar o array também vazio.

![Sem título](https://user-images.githubusercontent.com/17149877/110851752-37eb4880-8290-11eb-80ea-ed9161a707cb.png)

3ª forma: Declaração com atribuição de valores
O exemplo abaixo demonstra como criar um array já com elementos armazenados.
O primeiro exemplo criaria um array com 5 elementos, conforme a imagem abaixo. O segundo exemplo criaria um array chamado “cores”

![Sem título](https://user-images.githubusercontent.com/17149877/110851822-53565380-8290-11eb-9d1b-75917b165cc8.png)

Armazenando valores no array
Após a declaração e instância do array, ele está pronto para armazenar valores. Para isso, é necessário indicar em qual posição queremos armazenar o valor. Esta posição pode ser indicada por um número inteiro definido ou por uma variável do tipo inteiro que contenha um valor de índice válido.

Vamos utilizar como exemplo o seguinte array:

![Sem título](https://user-images.githubusercontent.com/17149877/110851907-6cf79b00-8290-11eb-82a9-d6680a52756b.png)

Vamos armazenar um número qualquer na primeira posição do array:

![Sem título](https://user-images.githubusercontent.com/17149877/110851987-8b5d9680-8290-11eb-8f86-a97a25cf24ea.png)

Ocupando a posição 0, as demais ficam à disposição para armazenar outros valores. Caso você utilize novamente a posição 0 para armazenar um valor, ele substituirá o valor antigo pelo novo. Observe o exemplo:

![Sem título](https://user-images.githubusercontent.com/17149877/110852035-9d3f3980-8290-11eb-961a-8e51f8681f2c.png)

Preenchendo outras posições:

![Sem título](https://user-images.githubusercontent.com/17149877/110852128-b9db7180-8290-11eb-9862-1f9030b7d60f.png)

A posição pode ser indicada por uma variável inteira. Observe o exemplo (considere que o array está vazio):

![Sem título](https://user-images.githubusercontent.com/17149877/110852209-d2e42280-8290-11eb-9a9b-b662fb802df2.png)

Preenchendo um array com valores informados pelo usuário:
Para preencher um array com valores informados pelo usuário podemos utilizar um laço de repetição. Observe o exemplo, que preencherá um array criado na classe Main com valores digitados no terminal:

![Sem título](https://user-images.githubusercontent.com/17149877/110852283-ef805a80-8290-11eb-85c6-843a7af9823a.png)

Utilizando a classe Arrays para exibir o conteúdo de um array
A classe Arrays deve ser importada no início da classe. O método toString já possui um formato padrão de exibição, que apresenta os elementos entre colchetes separados por ponto e vírgula. 


O que é o método toString?

Classe Object – método toString()
O método toString() retorna uma String que representa o objeto que está chamando o método. Isso é útil para o propósito de log e debug. Vamos descrever o que esse método está fazendo.




Observe o exemplo:

![Sem título](https://user-images.githubusercontent.com/17149877/110852560-49812000-8291-11eb-85d4-6e84362fb8ab.png)

## Classe ArrayList

Um ArrayList é uma coleção dinâmica capaz de armazenar um número indeterminado de objetos.
A classe ArrayList permite criar um objeto que é capaz de armazenar e gerenciar uma coleção de outros objetos. Um objeto da classe ArrayList é semelhante à estrutura array, porém os arrays são estáticos, nos quais temos que determinar um número de elementos que serão armazenados e esse número de elementos permanece até o final do programa, já a coleção ArrayList é dinâmica, isso significa que a mesma não precisa ter um número determinado para armazenamento e sua estrutura se adapta com cada objeto inserido.

Vantagens em utilizar a classe ArrayList:

Vantagens em relação à estrutura array:
Podemos guardar um conjunto de dados especificando o tipo de objeto;
É dinâmico: não possui tamanho definido;
Já possui métodos para facilitar o gerenciamento da coleção – inserção, exclusão, classificação e assim por diante. 



Importação da Classe:

![Sem título](https://user-images.githubusercontent.com/17149877/110853053-e774ea80-8291-11eb-91b3-023a554a8fa4.png)


Declaração de um ArrayList:


visibilidade 

           ArrayList <TipoObjeto> nomeObjeto;
           nomeObjeto = new ArrayList<>();

ou visibilidade  

ArrayList <TipoObjeto> nomeObjeto = new ArrayList<>();


Tipos de Objetos
Podemos armazenar objetos do tipo números inteiros, números reais, textos,
valores booleanos e objetos de classes criadas no sistema. Vejamos um exemplo de cada.

![Sem título](https://user-images.githubusercontent.com/17149877/110853158-096e6d00-8292-11eb-9740-bf8c42e74216.png)

Dica:

Obs.:
 Dependendo da versão do seu JDK, pode haver necessidade de repetir o tipo de dado.
 Exemplo: 

private ArrayList <Funcionario>listaDeFuncionarios;
listaDeFuncionarios = new ArrayList<Funcionario>();


Métodos da classe ArrayList:

![Sem título](https://user-images.githubusercontent.com/17149877/110853247-2a36c280-8292-11eb-9e57-1a96c0220613.png)

## Referência:
https://docs.google.com/document/d/1K-ZDRFHzORXG6T9AXwdwsGWsclGQRKhTIfkReNZxIRw/edit

_______________________________________________________________________________
## Aula IX - Desenvolvimento de Aplicativo I
Introdução à programação para Mobile
Java
WebServices
Aplicativos do Google Play
O SDK do Android
Android Studio
____________________________________________________________________________________________________
Fontes:
https://developer.android.com/studio/intro/studio-config
https://developer.android.com/studio/run/managing-avds
https://developer.android.com/docs ----> DOCUMENTAÇÃO
https://distancia.qi.edu.br/mod/book/view.php?id=54357&chapterid=39091
https://blog.geekhunter.com.br/java-android/ 
https://www.androidpro.com.br/blog/java/programacao-android-java-basico-parte-01/ 
____________________________________________________________________________________________________
Java

Os aplicativos Android são desenvolvidos com Java – uma das linguagens de programação mais usadas e conhecidas do mundo. Essa linguagem foi uma escolha lógica para a plataforma Android, pois é poderosa, gratuita, de código-fonte aberto e além disso Java possui propriedades que só ela tem e já é conhecida por uma quantidade bastante elevada de desenvolvedores.
 
Os desenvolvedores Java com experiência podem tranquilamente migrar para o desenvolvimento com Android, usando as APIs (interfaces de programação de aplicativo) Android da Google e de outros fabricantes.
 
A linguagem Java é orientada a objetos e tem acesso às amplas bibliotecas de classe que podem auxiliar no desenvolvimento de aplicativos poderosos e robustos com extrema facilidade e rapidez.
 
 
Web Services

Web services são componentes de software localizados em um computador, onde são acessados por um aplicativo (ou por outro componente de software) em outro computador por meio da Internet. Com eles, você pode criar mashups, permitindo o desenvolvimento de aplicativos rapidamente, combinando web services complementares, frequentemente de diferentes organizações e possivelmente com outras formas de feeds de informação.
 
Por exemplo, o 100 Destinations (www.100destinations.co.uk) combina as fotos e tweets do Twitter com os recursos de mapas do Google Maps, permitindo explorar países em todo o mundo por meio de fotos tiradas por outras pessoas. O Programmableweb (http://www.programmableweb.com/) fornece um catálogo com mais de 9.400 APIs e 7.000 mashups, além de guias práticos e exemplos de código para você criar seus próprios mashups.

![Sem título](https://user-images.githubusercontent.com/17149877/111214525-c7ef0200-85b0-11eb-80af-d66f9e78890c.png)

De acordo com o Programmableweb, as três APIs mais utilizadas para mashups são: Google Maps, Twitter e YouTube.



Aplicativos do Google Play

É correto afirmar que existem mais de 1 milhão de aplicativos no Google Play e o número está crescendo rapidamente, talvez até possa se afirmar exponencialmente.
É possível baixar aplicativos por meio do aplicativo Play Store instalado no aparelho. É possível também conectar-se em sua conta no Google Play, no endereço http://play.google.com, com o navegador web e, então, especificar o dispositivo Android no qual deseja instalar o aplicativo. Ele será baixado por meio da conexão Wi-Fi ou 3G/ 4G do aparelho.

 
 
 
O SDK do Android

O SDK (Software Development Kit) do Android fornece as ferramentas necessárias para construir aplicativos Android. Ele está disponível gratuitamente no site Android Developers (https://developer.android.com/).



Android Studio

Android Studio é um ambiente de desenvolvimento integrado (IDE) para desenvolver para a plataforma Android. Teve seu lançamento em 16 de Maio de 2013 na conferência Google I/O.
 
Android Studio é disponibilizado para download gratuitamente sob a licença Apache 2.0.  O Android Studio estava em estágio de acesso antecipado, alpha, desde a versão 0.1 em Maio de 2013, mudando então em estágio beta a partir da versão 0.8 que foi lançada em Junho de 2014. A primeira compilação estável sem os devidos “bugs” foi lançada em Dezembro de 2014, dando início à versão 1.0. 
 
Tendo como base o software IntelliJ IDEA da JetBrains, Android Studio foi feito especificamente para o desenvolvimento para Android. Está disponível para download em Windows, Mac OS X e Linux, substituindo o Eclipse Android Development Tools (ADT) como a IDE primária do Google de desenvolvimento para Android.

Android Studio é um ambiente de desenvolvimento integrado (IDE) com o foco no desenvolvimento para a plataforma Android.
Ele nos oferece uma interface amigável, de fácil utilização e com recursos que aceleram o processo de desenvolvimento.
Entre esses recursos estão um editor gráfico para criar as telas da aplicação e a integração com os emuladores do Android. 

 
Características:

Suporte para compilações baseadas em Gradle.
Refatoração específica para Android e reparações rápidas.
Ferramentas de Lint para capturar performance, usabilidade, compatibilidade de versão e outros problemas.
Integração com ProGuard e capacidade de assinatura de aplicativo.
Um assistente baseado em predefinições com designs e componentes comuns de Android.
Um rico editor de layout que permite que usuários arrastem componentes de interface de usuário, opção de pré-visualizar layouts em várias configurações de tela.
Suporte para a criação de apps para Android Wear.
Suporte nativo para a Google Cloud Platform, permitindo a integração com Google CloudMessaging e AppEngine.


Arquitetura de trabalho do Android Studio

É importante conhecer um pouco mais da arquitetura do Sistema Operacional Android e onde, nessa arquitetura, os aplicativos desenvolvidos se encaixam, para então entender como fazer o uso dos recursos do sistema durante o desenvolvimento.

![Sem título](https://user-images.githubusercontent.com/17149877/111214676-f7057380-85b0-11eb-9e18-2aa49af10180.png)

Componentes básicos de um aplicativo



Existem 4 componentes básicos de um aplicativo Android:
Activity, Service, Content Provider e Broadcast.






As funções desses componentes são:

Activity: é um componente que disponibiliza uma tela para que o usuário possa interagir. Sempre que o usuário visualiza qualquer coisa na tela do dispositivo, esse funcionamento é controlado por uma Activity.

Services: é um componente que permite que o aplicativo tenha acesso ao processamento sem que esteja diretamente vinculado à uma tela. Por exemplo, quando um aplicativo de música não está em primeiro plano e é necessário que a música continue sendo reproduzida, todo o processamento deve ser realizado dentro de um serviço.

Content Provider: devida a arquitetura do Android, que impede que um aplicativo tenha acesso às informações de outro aplicativo, a troca de informações, quando necessária, ocorre através deste componente.

Broadcast: Através deste componente, um aplicativo pode se inscrever para eventos do Android ou de outro aplicativo ou também publicar eventos para outros aplicativos. Assim é possível reagir aos eventos que ocorrem. Por exemplo, se um aplicativo precisa ser acionado sempre que uma chamada telefônica for recebida, é através de um Broadcastreceiver que ele será acionado.


Versões do Android

O Android, assim como a maioria dos softwares, evolui com o passar do tempo. Nas evoluções vários recursos são adicionados, alguns retirados e também há reestruturações arquiteturais para deixar o sistema mais fluído, com menos consumo de recursos, entre outras mudanças.

Para os desenvolvedores é muito importante estar atento a cada nova versão do Android, pois os recursos disponíveis para utilização nos aplicativos também mudam conforme a versão que se deseja atender.

Para a configuração dos projetos internamente, utilizamos o número da versão da API correspondente à versão do sistema operacional, por isso também é importante ter conhecimento das versões da API.

Para você conhecer a história do Android, no link abaixo poderá acessar as principais características do sistema operacional.

História do Android

https://www.android.com/intl/pt-BR_br/history/

__________________________________________________________________________________
## Sistemas Operacionais Mobile

Atualmente, os dois principais sistemas operacionais para smartphones são o Android e iOS. Estes sistemas são desenvolvidos por companhias diferentes que brigam pelo domínio dessa área.
Algumas diferenças: A batalha Android vs iOS: quais suas principais diferenças? | RMA


Contexto histórico

Apesar de ter uma vida um pouco mais longa como sistema operacional (desde 2003), o Android se tornou relevante em 2007 quando a Google anunciou seus planos de disponibilização livre de um sistema operacional para dispositivos móveis com características semelhantes ao recém lançado iPhone.

Por ser um sistema operacional livre, a intenção da empresa foi de buscar parceiros, através da Open Handset Alliance, para fabricação do hardware (telefone celular) e embarcar no seu sistema operacional livre.

Comercialmente isso aconteceu em 2008 quando a HTC lançou o seu primeiro telefone com o sistema operacional Android.


O SO Android

O sistema operacional Android é hoje líder absoluto nos tablets e smartphones disponíveis no mercado mundial. Lançado pelo Google com o intuito claro de disputar com o iPhone da Apple, a
plataforma móvel do “robozinho” ganhou uma enorme fatia do mercado por várias (e merecidas) razões:

Possui uma interface agradável e fácil de usar, que conquista tanto usuários novatos como os mais experientes;
Sua arquitetura aberta possibilita que o mesmo seja utilizado em aparelhos de vários fabricantes;
Utiliza a linguagem Java para criação de seus aplicativos.


Visão geral do armazenamento de dados e arquivos


O sistema operacional Android utiliza Java (ou Kotlin) como a linguagem de programação para seus aplicativos, e traz um conjunto rico de classes e ferramentas para o desenvolvimento de programas que faz uso dos principais recursos existentes nestes aparelhos.



Kotlin é uma Linguagem de programação multiplataforma, orientada a objetos e funcional, concisa e estaticamente tipada, desenvolvida pela JetBrains em 2011, que compila para a Máquina virtual Java e que também pode ser traduzida para a linguagem JavaScript e compilada para código nativo.





Android Studio

O Android Studio é o ambiente de desenvolvimento integrado (IDE, na sigla em inglês) oficial para o desenvolvimento de apps para Android e é baseado no IntelliJ IDEA (link em inglês).

Além do editor de código e das ferramentas de desenvolvedor avançadas do IntelliJ, o Android Studio oferece ainda mais recursos para aumentar sua produtividade na compilação de apps Android, como:

Um sistema de compilação flexível baseado em Gradle
Um emulador rápido com inúmeros recursos
Um ambiente unificado que possibilita o desenvolvimento para todos os dispositivos Android
A aplicação de alterações para enviar alterações de código e recursos ao aplicativo  em execução sem reiniciar o aplicativo 
Modelos de código e integração com GitHub para ajudar a criar recursos comuns de apps e importar exemplos de código
Frameworks e ferramentas de teste cheios de possibilidades 
Ferramentas de lint para detectar problemas de desempenho, usabilidade, compatibilidade com versões, entre outros
Compatibilidade com C++ e NDK
Compatibilidade integrada com o Google Cloud
Platform, facilitando a integração do Google Cloud
Messaging e do App Engine.
Entrada e saída são implementados através do device drivers. Sempre que um novo dispositivo é acrescentado no sistema, o drive deve ser acoplado ao núcleo.


Interface e criando projeto no Android Studio

A estrutura:

Cada projeto no Android Studio contém um ou mais módulos com arquivos de código-fonte e de recursos.

Os tipos de módulos incluem:

Módulos de apps Android
Módulos de biblioteca
Módulos do Google App Engine

![1](https://user-images.githubusercontent.com/17149877/111529551-0d423980-8741-11eb-9189-2c9f86e74076.png)

Por padrão, o Android Studio exibe os arquivos do projeto na visualização de projetos Android, como mostrado na figura abaixo.

Essa visualização é organizada por módulos para permitir o acesso rápido aos principais arquivos de origem do projeto.


![11111](https://user-images.githubusercontent.com/17149877/111529630-24812700-8741-11eb-804b-95122f8085a0.png)

Todos os arquivos de criação podem ser vistos no nível superior em Gradle Scripts, e cada módulo de app contém as pastas a seguir:

manifests: contém o arquivo AndroidManifest.xml. Está o arquivo com configuração do aplicativo. Por exemplo, a configuração do ícone do aplicativo.

Java: Encontram-se todos os arquivos java. Dessa forma, o diretório armazena toda a lógica do aplicativo.

Recursos: Estão armazenados todos os arquivos referentes à interface do usuário, podendo conter imagens, ícones, layouts etc.

Gradle Script: estão armazenados todos os scripts responsáveis pela compilação do aplicativo.





Para navegar na interface do usuário, é preciso clicar duas vezes sobre o arquivo “activity_main.xml”


A Activity é o principal componente de um aplicativo Android. As activities são os componentes associados às telas com que os usuários interagem em um aplicativo.



Configuração do emulador do Android Studio


![2](https://user-images.githubusercontent.com/17149877/111529856-6742ff00-8741-11eb-8707-d671f888702a.png)

Podemos usar outros emuladores também, pois o AVD é extremamente pesado e requer muito do hardware. Abaixo vemos o emulador do Android Studio.

![android](https://user-images.githubusercontent.com/17149877/111530048-9ce7e800-8741-11eb-9472-95dc37a7fa8b.png)

As opções são usar um dos emuladores que já postei na aula IX ou mesmo fazer a emulação pelo celular, para tanto, precisamos que o celular esteja conectado ao computador via USB.


## Vamos fazer o tutorial pelo Genymotion, em aula podemos ver como fazer com os outros.

Primeiro vamos abrir um novo Projeto no Android Studio:


Se já estiver aberto:
Caso tenha um projeto aberto, selecione  File > New > New Project.
Na janela Choose your project, selecionar Empty Activity.
Na janela Configure your project, insira os seguintes valores:

Nome: "MyFirstApp"
Nome do pacote: "com.example.myfirstapp"
Marque a caixa ao lado de Use AndroidX artifacts.
Altere o local do projeto se desejar
Deixe as outras opções como estão. Selecione Java na linguagem.


Agora vamos abrir o Genymotion. E aguardamos ele dar o start

![2222](https://user-images.githubusercontent.com/17149877/111531900-df122900-8743-11eb-943e-aabdb2c1c328.png)

![gen](https://user-images.githubusercontent.com/17149877/111531916-e46f7380-8743-11eb-8c2a-567c1271217f.png)

Após ele dar o start, vamos ativar o dispositivo, se você não tem nenhum dispositivo adicionado, basta clicar no sinal de + e adicionar o que deseja emular para o Android Studio, neste exemplo, temos um Custom Phone selecionado.

Após ele fazer o download, vamos dar o start no dispositivo:

![g1](https://user-images.githubusercontent.com/17149877/111532287-40d29300-8744-11eb-8fb8-c5a744d57f57.png)


Aguardamos o início da virtualização;
O dispositivo começa a ser carregado;

![g2](https://user-images.githubusercontent.com/17149877/111532380-5ba50780-8744-11eb-9715-e017961be6d5.png)

Dispositivo carregado

![g3](https://user-images.githubusercontent.com/17149877/111532430-6a8bba00-8744-11eb-855b-5ccb561e00c1.png)

Dispositivo vinculado no Android Studio

![g4](https://user-images.githubusercontent.com/17149877/111532502-7c6d5d00-8744-11eb-8a90-0ad4742d71a6.png)

Podemos também fazer a emulação pelo celular. No link abaixo você pode encontrar um rápido emulador para celular. Ali tem a documentação também!

https://github.com/barry-ran/QtScrcpy

https://www.genymotion.com/




