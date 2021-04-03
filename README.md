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

________________________________________________________________________________________
## Aula XIII de Desenvolvimento de Aplicativo I
Configurando o celular para depuração
Detalhes importantes da Interface do Android Studio
Layouts
Componentes de Layout
Começando um projeto

_____________________________________________________________________________________________________
Fontes:
https://developer.android.com/training/basics/firstapp?hl=pt-br
https://developer.android.com/training/basics/firstapp/building-ui?hl=pt-br 
https://www.devmedia.com.br/tutorial-de-android-studio/34003 

_____________________________________________________________________________________________________
Configurando o celular para depuração

Se você tem um celular Android e pode ser com uma versão mais antiga, podemos fazer a configuração para depuração pelo próprio dispositivo, desta maneira iremos literalmente poupar hardware e tempo para podermos ver a compilação e depuração diretamente pelo celular.

Como fazer?

Pegue seu celular Android e acesse suas configurações;
Com as configurações abertas, acesse o menu Sobre o telefone;
Após, você vai clicar sobre Informações sobre o Software;
Depois em Número de compilação, aqui você irá pressionar umas 10 vezes até receber a mensagem que o modo de desenvolvedor do telefone foi ativado.
Retorne para a tela de Configurações, dê uma atualizada nesta tela e verifique se está aparecendo   no final da tela;
Acesse Opções do desenvolvedor e habilite o recurso Depuração USB;
Pronto, seu celular está apto a receber todas as informações do Android Studio, basta só conectá-lo via USB no computador. Agora vamos abrir o Android Studio e verificar se o seu celular irá aparecer na lista de dispositivos para compilação.
Pronto, apareceu! Seu Android Studio está pronto para exibir as informações e desenvolvimento que faremos no celular. Obviamente que a primeira vez que mandarmos a compilação ele vai demorar, mas isso é normal em função do Gradle que precisa “buildar”, construir o gerenciamento da compilação.

## Detalhes importantes da Interface do Android Studio

Quando abrimos um novo projeto e escolhemos a opção Empty Activity, um código XML é gerado automaticamente. Este arquivo xml conterá todas as informações dos componentes que a nossa aplicação terá, como por exemplo textos, imagens, vídeos e etc. O modo de visualização da imagem abaixo é Code: 

![Sem título](https://user-images.githubusercontent.com/17149877/112015763-ddad7b80-8b0a-11eb-8c7f-49fdade1cc08.png)

Já o arquivo em Java, será responsável pelo “setamento e mapeamento” dos componentes, pela Classe R (que logo veremos) e pela lógica e programação em Java propriamente dito, ou seja, a programação da nossa aplicação.
No modo Split, poderemos trabalhar diretamente olhando o nosso layout e a parte da programação.

![Sem título](https://user-images.githubusercontent.com/17149877/112015937-06357580-8b0b-11eb-9a45-0f069d8c6a5b.png)

## Criando um Projeto Novo
Layouts e Componentes de Layouts

Para criar um novo projeto: Menu File/New/Project, em layout, vamos escolher a opção Empty Activity, pois iremos fazer o nosso projeto do zero. Bem importante a escolha dos nomes do projeto e de seu pacote, selecionar a linguagem Java e, na versão do Android, vamos escolher a opção Android 4.4 - KitKat ou o 7 também, o Nuget.

Depois que escolhermos a definição do nosso projeto, iremos fazer uma calculadora e definir o tipo de layout que vamos usar. Ele será Linear, pois é mais fácil de adaptar do que o ConstraintLayout.
Para que possamos trocar o tipo de layout de forma rápida e eficiente, iremos acessar o arquivo XML. Observe que, por padrão o AS já vem com o ConstraintLayout, na paleta Component Tree.

![Sem título](https://user-images.githubusercontent.com/17149877/112016129-311fc980-8b0b-11eb-87fa-c4709ba770d1.png)

Vamos acessar o arquivo XML e:

![Sem título](https://user-images.githubusercontent.com/17149877/112016222-4b59a780-8b0b-11eb-979a-e48407f0ea31.png)

Trocar o tipo de Layout! Vale salientar que o arquivo activity_main.xml se refere ao layout da nossa aplicação, observe que ele fica na pasta RES (Ressource) no lado esquerdo da tela do AS. 
Na primeira linha deste XML, encontramos a definição do layout Constraint, vamos apagar até androidx e digitamos linear. Vamos selecionar a opção da imagem abaixo!

![Sem título](https://user-images.githubusercontent.com/17149877/112016357-69270c80-8b0b-11eb-8800-81fbaed5f615.png)

Observe como o activity_main.xml ficou agora (imagem abaixo): 
Toda vez que alteramos para o layout linear, precisamos fazer a configuração da orientação da nossa aplicação, neste caso, iremos optar pela vertical. 
Ainda no arquivo activity_main, no nó xml que se refere ao layout, iremos inserir:
android:orientation="vertical"


De volta ao modo de Design, vamos observar que o “Hello World” está no canto superior esquerdo e na paleta de Component Tree, o layout mudou! Agora temos Linear. 
As questões do layout Linear são mais fáceis de manipular, pois o Constraint é responsivo mas opera em mapeamento de pontos para inserir os componentes. Trabalhar com o Linear é mais simplificado e podemos definir a distribuição (diagramação) em “peso”, ou seja, em quanto de espaço cada componente irá ocupar!

Na próxima etapa poderemos fazer as configurações do nosso layout, na Paleta, quando selecionamos a opção de layout, vários componentes aparecem para facilitar a nossa construção.

Agora iremos selecionar o texto Hello World e trocar por Calculadora, para isso, basta selecionar a caixa de texto, na paleta atributos, em Declared Atributes, em text, vamos fazer as alterações. Para fazer outras alterações, na mesma paleta ao lado direito, vamos em All Atributes! 
Em All Atributes encontramos muitas opções para podermos elaborar o nosso Layout!
Na imagem abaixo, o tamanho, a cor e o posicionamento do texto foram alterados! Ou utilizamos o gravity para fazer alinhamentos!

![Sem título](https://user-images.githubusercontent.com/17149877/112016674-b1462f00-8b0b-11eb-83c1-881cd748daf9.png)

Próxima etapa do que iremos fazer, será inserir uma imagem! Como estamos fazendo de uma calculadora, iremos buscar na Internet a imagem da Calculadora. Uma dica para vocês! Quando salvamos a imagem da Web vamos ter o cuidado de não colocar números neste nome, existe um possível bug no AS que, quando inserimos uma imagem ele simplesmente fecha tudo.

Podemos arrastar a imagem da calculadora para a pasta RES em DRAWABLE!
Na paleta de Componentes, vamos acessar Widget/ImageView e arrastar para o Layout - Component Tree.


![Sem título](https://user-images.githubusercontent.com/17149877/112016892-e0f53700-8b0b-11eb-97d5-6d7d983501bb.png)


O nosso Layout está começando a ficar dessa forma!

![Sem título](https://user-images.githubusercontent.com/17149877/112017058-05511380-8b0c-11eb-8e19-f87d6789437e.png)

Agora iremos fazer as configurações de tamanho e proporção dos elementos e componentes que estamos inserindo no layout.
Vamos usar o atributo Layout Weight, peso do layout! É o mais adequado para o tipo de estrutura que estamos criando, pois ele trabalha com a proporção dos elementos e/ou componentes que estão sendo inseridos nele. Eu particularmente gosto muito de usá-lo pois é um recurso em que conseguimos inserir a responsividade dentro de um layout linear.
Após inserirmos todos os nossos elementos, voltaremos aqui para fazer as configurações do weight.
Neste momento, precisamos inserir outros componentes para a nossa calculadora, pois até agora só configuramos o texto e inserimos uma imagem.

Como o nosso layout é vertical, tudo o que fomos inserindo irá ficar empilhado. Então, desta forma, vamos inserir os componentes que precisamos para que o usuário possa digitar os valores para posteriormente ele poder executar os cálculos, vamos arrastar o componente TextView e Number, a árvore de componentes ficará como nas imagens abaixo: 

![Sem título](https://user-images.githubusercontent.com/17149877/112017208-2b76b380-8b0c-11eb-95aa-f1cb28d7b94f.png)

Após, podemos fazer as configurações dos textos. É muito importante salientar que aqui estamos usando a construção do layout com o assistente, também podemos fazer via código, o que, com o tempo fica mais fácil e rápido.

![Sem título](https://user-images.githubusercontent.com/17149877/112017500-709ae580-8b0c-11eb-9cb9-d270e073e754.png)

Vamos observar a disposição no XML do nosso Layout, clique sobre Code e observe seu código, ele estará como a imagem abaixo:

![Sem título](https://user-images.githubusercontent.com/17149877/112017666-9627ef00-8b0c-11eb-851d-a9ff05e01dc9.png)

Vamos selecionar os componentes de texto e a imagem se assim desejarem, na paleta Layout, vamos selecionar a opção match_parent em layout width. Gravity iremos configurar como center_horizontal, desta forma nossos elementos sempre se ajustam ao tipo de dispositivo.

![Sem título](https://user-images.githubusercontent.com/17149877/112017775-b192fa00-8b0c-11eb-952f-4ee7f4c3a8c1.png)

Após esta configuração, podemos fazer o afastamento do layout das bordas, para isto, basta selecionarmos o atributo layout_margin e setar as configurações para 20dp layout_marginRight e layout_marginLeft


A próxima etapa, será fazer a configuração do ID das entradas de valores. A identificação que daremos é muito importante, pois ela será a referência do elemento quando iremos inserir a programação nele.

- Selecionamos o primeiro editText;
- Na paleta, vamos em ID;
- Digitamos: edtValor1.

Repetimos a mesma operação para o editText2 e vamos inserir o ID como edtValor2;

![Sem título](https://user-images.githubusercontent.com/17149877/112017992-e606b600-8b0c-11eb-9712-fa1f1f172a0e.png)

Vamos inserir os botões para cálculo e desejamos colocar um ao lado do outro. Como fazer se estamos em um layout linear? Este tipo de layout empilha os elementos ….. desta feita, iremos inserir elementos que nos permite colocar os botões um ao lado do outro.

![Sem título](https://user-images.githubusercontent.com/17149877/112018066-ffa7fd80-8b0c-11eb-898b-bcdb6cf8332c.png)

Agora basta inserirmos os botões para dentro dele …..

![Sem título](https://user-images.githubusercontent.com/17149877/112018239-26feca80-8b0d-11eb-8ebe-99b07cc4a1ce.png)

E vamos configurar o nome destes botões! Para facilitar a nossa vida neste momento, eu coloquei os nomes dos botões da seguinte forma:

- Botão Soma
Text = “+”
ID = btnSoma
- Botão Subtração
Text = “-”
ID = btnSub
- Botão Multiplicação
Text = “*”
ID = btnMulti
- Botão Divisão
Text = “/”
ID = btnDiv

![Sem título](https://user-images.githubusercontent.com/17149877/112018529-69280c00-8b0d-11eb-9a2a-9bb08261560c.png)

## Layout até aqui da Calculadora

![Sem título](https://user-images.githubusercontent.com/17149877/112018700-91b00600-8b0d-11eb-8eb6-4f7b2aafc43d.png)

## Referências
https://docs.google.com/document/d/1l9jEpvOcJXP-0Dx7EgI5kCNHAbXj_OUOZOtb2GjqFVA/edit

_________________________________________________________________________

##  Aula XIV e XV de Desenvolvimento de Aplicativo I
Revisão de Layout
Continuação do projeto Calculadora
Classe R - Android
Método findViewById();
Listener de Eventos
Métodos de Eventos
_____________________________________________________________________________________________________
Fontes:
https://developer.android.com/training/basics/firstapp?hl=pt-br
https://developer.android.com/training/basics/firstapp/building-ui?hl=pt-br 
https://www.devmedia.com.br/tutorial-de-android-studio/34003 
https://developer.android.com/guide/topics/resources/providing-resources?hl=pt-br 
https://tableless.com.br/manipulando-views-com-android/ 
https://developer.android.com/guide/topics/ui/ui-events?hl=pt-br#:~:text=Um%20listener%20de%20eventos%20%C3%A9,com%20o%20item%20na%20IU. 
_____________________________________________________________________________________________________
Continuação do projeto Calculadora 

Vamos dar continuidade ao projeto da calculadora, na aula de ontem, finalizamos o nosso tutorial da seguinte forma:

![Sem título](https://user-images.githubusercontent.com/17149877/112393979-aee5ff80-8cda-11eb-8c1a-944b0cda12fc.png)

Observação: o tutorial está em cor diferente do documento anterior porque estes prints foram feitos em aula e este app ficou mais legal que o original ….. ;)

Na próxima etapa iremos inserir mais um campo de texto para o resultado e para facilitar a nossa vida, iremos fazer via código de acordo com a imagem abaixo! Observem os nomes, eles serão muito importantes.

![Sem título](https://user-images.githubusercontent.com/17149877/112394059-d3da7280-8cda-11eb-80d2-cb8dd87bbf1d.png)

Ainda é possível colocar margin_top ou bottom para configurar o distanciamento dos componentes inseridos no layout do app, ou ainda: zerar todos os atributos layout_height e configurar o layout_weight por valores, tipo 2.4, 3.5 …. desta forma estaremos configurando as alturas pela proporção, o que é aconselhável para controle de tamanho de imagens. 

## Classe R - Android

Afinal, qual é a classe R no Android?

No Android Studio, quando nós criamos um projeto usando uma empty activity, o AS gera o seguinte código!

![Sem título](https://user-images.githubusercontent.com/17149877/112394295-3c295400-8cdb-11eb-9ecb-d7e1357f7be4.png)

A classe R é uma classe de mapeamento e/ou setamento que cria objetos de acesso para todos os componentes/objetos do nosso layout no app. Não é porque criamos os componentes no layout que não precisaremos criar no Java também! Nesta criação é construído um vínculo entre o elemento construído no design e mapeado em nós no xml e o Java, portanto, a classe R é responsável por criar uma “interface de controle” ou comunicação entre as estruturas de um projeto Android - os arquivos xml e Java!

Classe R contém as definições de todos os recursos de um pacote de aplicativo específico . Ele está no namespace do pacote do aplicativo.

Geralmente, há duas R classes com as quais trabalhamos:

Os recursos da estrutura em android.Re
Seu próprio namespace

## Vamos para a Classe R

Alternamos para o modo Code e vamos acessar o arquivo MainActivity.java

1ª Parte! 
Declarando os atributos Java e importando as classes destes dados.

![Sem título](https://user-images.githubusercontent.com/17149877/112394455-81e61c80-8cdb-11eb-9617-b48bf77c1bdd.png)

Agora o mapeamento dos objetos criados no xml e no java!
2ª Parte! 
Pois então! Todo o componente criado no Java precisa ser mapeado para o xml que é o nosso layout, por isso a importância de definirmos os “IDs” de forma correta e adequada ao que cada elemento significa na aplicação. Vamos usar o método findViewById(); Este método tem a função de achar a view do nosso layout e associar (mapear) ao objeto Java criado!

![Sem título](https://user-images.githubusercontent.com/17149877/112394534-a80bbc80-8cdb-11eb-9df7-fcb410cff2fd.png)

Vamos repetir para cada objeto criado no Java! Observe que as cores dos objetos criados em Java mudaram de cor após o mapeamento! Desta forma, após este mapeamento, a aplicação saberá que quando o componente de layout for “chamado” por uma ação do usuário, ele tem a referência do objeto Java especificado.

![Sem título](https://user-images.githubusercontent.com/17149877/112394628-d25d7a00-8cdb-11eb-94cb-fb9fd210681d.png)

3ª Parte! 
Configuração dos Listener de Eventos e os Métodos de Eventos. 

Listener define sempre quando algum componente está "à espera" da ação que é o evento promovido pelo usuário que está manipulando o app que desenvolvemos. 

Os métodos de eventos podem se resumir a:

onClick()
De View.OnClickListener. É chamado quando o usuário toca no item (no modo de toque) ou foca no item com as teclas de navegação ou o trackball e pressiona a tecla "Enter" adequada ou pressiona o trackball.

onLongClick()
De View.OnLongClickListener. É chamado quando o usuário mantém o item pressionado (no modo de toque) ou foca no item com as teclas de navegação ou o trackball e mantém pressionada a tecla "Enter" adequada ou mantém o trackball pressionado (por um segundo).

onFocusChange()
De View.OnFocusChangeListener. É chamado quando o usuário navega para ou do item usando as teclas de navegação ou o trackball.

onKey()
De View.OnKeyListener. É chamado quando o usuário está com foco no item e pressiona ou solta uma tecla de hardware no dispositivo.

onTouch()
De View.OnTouchListener. É chamado quando o usuário realiza uma ação qualificada como um evento de toque, incluindo o pressionamento, a liberação ou qualquer outro gesto de movimento na tela (dentro dos limites do item).

(fonte: https://developer.android.com/guide/topics/ui/ui-events?hl=pt-br#:~:text=Um%20listener%20de%20eventos%20%C3%A9,com%20o%20item%20na%20IU. )

![Sem título](https://user-images.githubusercontent.com/17149877/112395000-5c0d4780-8cdc-11eb-9b3e-d5fcba61340b.png)

## Referência
https://docs.google.com/document/d/1KchQNv4hSoHT6HXuae_fDKAzSuoDE6ScNuDjAvxZXvo/edit

__________________________________________________________________________
## Aula XVII e XVIII - Desenvolvimento de Aplicativo I
Integrando projeto entre Janelas
Criando o primeiro jogo
Layout Relativo
startActivity()
finish()
Intent()
Usando controle de dados condicionais e estruturas (IF, Else e Arrays)
______________________________________________________________________________________________________
Fontes:
Intents e filtros de intents | Desenvolvedores Android 
Start another activity 
Activity 
Iniciar uma atividade usando uma animação | Desenvolvedores Android 
______________________________________________________________________________________________________
Integrando projeto entre Janelas

Na criação de um App ele não se dá somente em uma tela, em um projeto teremos várias telas integradas entre si - cada tela possui um layout próprio e um arquivo Java próprio. O Android Studio não permite que componentes e objetos de layout possuam a mesma referência de identificação, ou seja, o ID. Portanto a documentação registrada do projeto precisa ser precisa e receber nomes diferentes para cada elemento/objeto inserido em uma tela.

Na aula de hoje, iremos criar um jogo (Jogo da Velha) onde iremos definir desde o início os cuidados com as nomenclaturas e organização do projeto.
Vamos abrir um novo projeto onde o nome será: JogodaVelha em um Activity Empty

![Sem título](https://user-images.githubusercontent.com/17149877/113347670-e3297380-930b-11eb-8466-c66fd7087fe1.png)

Após as definições iniciais do nosso projeto, iremos fazer o layout inicial do jogo.
Vamos fazer a alteração para Layout Linear e orientação vertical.

![Sem título](https://user-images.githubusercontent.com/17149877/113485703-44288700-9485-11eb-8121-540a604014b1.png)

Após, iremos buscar na  Internet uma imagem que remete ao tipo de jogo e arrastar para a pasta drawable. Nesta pasta podemos criar outras pastas se forem necessárias para a organização dos nossos arquivos dependentes.


![Sem título](https://user-images.githubusercontent.com/17149877/113485862-2d366480-9486-11eb-9c9b-5900c61bd8e7.png)

Neste exemplo eu inseri uma imagem de fundo com a mesma cor da imagem que escolhi, na verdade, eu cortei a imagem para que ficasse menor e retirei o fundo.
Nunca esqueça de pesquisar na documentação ou em sites confiáveis para ver os últimos releases da IDE e como vocês podem potencializar a inserção de imagens sem perder a qualidade visual da aplicação e sem onerar o usuário que irá utilizar seu App.


ImageView Android: Como utilizar o ImageView para exibir imagens
Visão geral de drawables | Desenvolvedores Android 

![Sem título](https://user-images.githubusercontent.com/17149877/113485880-4b9c6000-9486-11eb-9123-a6d0f7e9dbf8.png)

Elabore o Layout similar como a imagem abaixo, você pode usar outras imagens e cores. Observe os IDs dos componentes - Component tree

![Sem título](https://user-images.githubusercontent.com/17149877/113485902-71c20000-9486-11eb-8033-a8e3fff0b264.png)

Depois que nosso Layout estiver pronto iremos para a Main fazer o mapeamento e abrir outra tela.


![Sem título](https://user-images.githubusercontent.com/17149877/113485933-9b7b2700-9486-11eb-92dd-5e40a11665ae.png)

A próxima etapa será a criação da nova tela e, para criação da nova tela, precisamos de outra Activity. Vamos criar uma Activity dentro do nosso projeto. Vamos clicar com o botão direito sobre o nosso projeto/Novo/Activity/EmptyActivity.

![Sem título](https://user-images.githubusercontent.com/17149877/113485966-b8aff580-9486-11eb-87c4-d0b4483af179.png)

Vamos inserir o nome de ComoJogar.
Observe que o box de gerar layout de xml está ativo e as demais informações estão apontando para o nosso projeto!
Observe o nosso ambiente de trabalho!

![Sem título](https://user-images.githubusercontent.com/17149877/113485999-e1d08600-9486-11eb-91d3-5b45cbc438ed.png)

Vamos elaborar o seguinte layout em sua estrutura cuidando com as IDs dos botões.
Declaração e mapeamento.

![Sem título](https://user-images.githubusercontent.com/17149877/113486017-03ca0880-9487-11eb-82ed-9fc36ae14ec7.png)

A próxima Activity que iremos criar será a do próprio jogo. Obviamente que para um Jogo da Velha não há necessidade de criar tantas Activities, mas este processo é pedagógico, para que possamos entender o funcionamento da estrutura de um App desenvolvido em Java para Android. 

Vamos repetir o processo para criar Nova Activity no nosso projeto:

Clicar com o botão direito na pasta Java do nosso Projeto;
Selecionar New;
Selecionar Activity;
Empty Activity

Nome: JogoVelha

Vamos fazer o seguinte Layout (imagem abaixo) observando que:

Estamos trabalhando com Layout Linear já desde o início, porém nesta View iremos introduzir o Layout Relativo no AS.

##  Layout relativo

RelativeLayout é um grupo de visualizações que exibe visualizações filhas (dependentes) em posições relativas. A posição de cada visualização pode ser especificada como relativa a elementos irmãos (por exemplo, à esquerda ou abaixo de outra visualização) ou em posições relativas à área RelativeLayout pai (por exemplo, alinhado à parte inferior, à esquerda ou no centro).

É o tipo de layout utilizado no Android para se posicionar os elementos em relação a outro. Por exemplo, se temos um Text View e o desenvolvedor posicionar o botão a sua esquerda, no XML pode-se fazer referência a esse para que o elemento de tela seja posicionado em um determinado lugar de acordo com sua posição. (fonte: Artigo Linear, Table e Relative Layouts com Android Studio )

Você pode ler mais aqui, na documentação do Android:
Layout relativo | Desenvolvedores Android
Layouts | Desenvolvedores Android

![Sem título](https://user-images.githubusercontent.com/17149877/113486070-4db2ee80-9487-11eb-83be-80552f886f84.png)

Não esqueça de importar os componentes de Layout no xml! =D

## Agora vamos à programação do nosso App!


Precisamos fazer a ligação entre as telas, ou seja, a navegação do aplicativo e a lógica do jogo. O que temos até agora são os Layouts e seus xml + o mapeamento dos objetos! Precisamos ….

![Sem título](https://user-images.githubusercontent.com/17149877/113486114-7c30c980-9487-11eb-8ce3-707486b8bb68.png)

Vamos para a primeira classe que é a MainActivity, é a inicial do nosso App!

Nesta classe iremos criar um  método para abrir a outra tela em que temos os nossos layouts. Sempre precisamos analisar como o fluxo do aplicativo se dará, é muito importante! A imagem abaixo não é um fluxograma (mais adequado para desenvolvimento de um App, mas exibe o fluxo da nossa aplicação).

![Sem título](https://user-images.githubusercontent.com/17149877/113486185-d7fb5280-9487-11eb-87aa-31a49a1db23a.png)

Para interligar estas estruturas, vamos usar:

Os Intent() e startActivity();

##  Intent

Um objeto Intent carrega informações que o sistema Android usa para determinar o componente a iniciar (como o nome exato do componente ou categoria do componente que deve receber o intent), além de informações que o componente receptor usa para realizar a ação adequadamente (como a ação a tomar e os dados a usar). No resumo: um Intent é um objeto de mensagem que usamos para solicitar uma ação de um outro componente do aplicativo. Ou seja, podemos solicitar ações de uma Activity, de um Service, de um Content Provider ou de um Broadcast Receiver.

Existem várias formas de componentes se comunicarem, mas temos 3 usos fundamentais:

Iniciar uma Activity
Iniciar um Service
Fornecer uma transmissão, que será recebida pelos Broadcast Receivers





Tipos de Intents
Há dois tipos de Intents:

Os Intents Explícitos especificam o componente. Normalmente, usa-se para iniciar um componente no próprio aplicativo porque se sabe o nome da classe da Activity ou do Service. É o que iremos utilizar na nossa aula.

Os Intents Implícitos não nomeiam nenhum componente específico, mas declaram uma ação a ser feita, o que permite que um componente de outro aplicativo ou do próprio Android a realize. Por exemplo: se você deseja compartilhar algo, a ação do botão de compartilhar pode disparar um Intent implícito e o Android irá perguntar para o usuário qual App deve concluir a ação.

Portanto, nós vamos usar o Intent para abrir uma Janela, na verdade, outra Activity!

![Sem título](https://user-images.githubusercontent.com/17149877/113486226-10029580-9488-11eb-9d84-60787c5637f8.png)

A criação do Método para abrir as  Activities ComoJogar e Jogo, usando Intent.

![Sem título](https://user-images.githubusercontent.com/17149877/113486259-2b6da080-9488-11eb-8a76-b69ceb2a2b14.png)

Nome do método. Este método é privado pois ele é visível somente para esta classe.
Declaração do Intent com o nome da intenção (janela e janelag);
Na criação do Intent estou definindo que este contexto irá abrir as Activities (classe) correspondentes aos botões ComoJogar.class e Jogo.class!
Estamos usando o iniciar uma Activity com o nome que explicamos no Intent (janela e janelag);



startActivity()

O método startActivity() inicia uma instância declarada no Intent, ou seja, inicia outra Activity.
Iniciar outra atividade | Desenvolvedores Android 



finish()

Método para finalizar uma Activity.

![Sem título](https://user-images.githubusercontent.com/17149877/113486277-4e985000-9488-11eb-8c02-69a0f2635221.png)

Agora iremos para a programação do Jogo propriamente dito.
Verifique todos os IDs, se estão corretos e vamos abrir a Activity Jogo.java.

O código completo será postado no github dentro do diretório Aula17, após desenvolvermos em aula.

_________________________________________________________________________________________________
## Referências

https://docs.google.com/document/d/1fQrCmC3AmqJe5UP-tOz9sQhGWBZ-f_dbb2xtlGV4LhA/edit






