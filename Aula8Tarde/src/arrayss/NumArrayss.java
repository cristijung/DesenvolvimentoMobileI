/*
Utilizando a classe Arrays para exibir o conteúdo de um array
A classe Arrays deve ser importada no início da classe. 
O método toString já possui um formato padrão de exibição, 
que apresenta os elementos entre colchetes separados por ponto e vírgula. 
 */
package arrayss;

import java.util.Arrays;
public class NumArrayss {
    
    public static void main(String[] args) {
        /*
        declaração do array com valores atribuidos,
        nome do array --- pares
        array possui tamanho fixo
        índices do array pares
        0 = 4
        1 = 6
        2 = 8
        3 = 10
        4 = 12
        5 = 14
        6 = 16
        7 = 18
        */
        int [] pares = {4,6,8,10,12,14,16,18};
        
        System.out.println("Números pares:");
        for(int i = 0; i < 8; i++)  {        
        System.out.println(pares[i]);        
         
        }
        //usando o método toString para exibir os valores do Array
        System.out.println(Arrays.toString(pares));
        
        //usando o atributo length = comprimento do array
        System.out.println("O array contém " + pares.length + " elementos");
    }
    
}
