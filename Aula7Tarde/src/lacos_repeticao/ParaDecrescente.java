/*
(for) Escreva um programa Java para imprimir na tela todos os números ímpares de 299 
a 101 em ordem decrescente.
*/
package lacos_repeticao;

public class ParaDecrescente {
    public static void main(String[] args) {
        int i;
        
        /*
        faça
        variável i começa de 300
        i for maior do que 101
        ele DECEREMENTAR 1 (i)
        */
        for (i = 300; i > 101; --i){
            System.out.println("O valor: " + --i);
           
       }
   }

}