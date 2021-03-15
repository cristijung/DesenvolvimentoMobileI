/*
Criar um programa capaz de armazenar 50 numeros inteiros.
Em seguida faça o seu preenchimento automático com os números de 101
a 150 ---- no índice zero, o array irá receber o 101. Depois, exibir os
valores do array. Automatizado. Programa criado com ARRAY.
 */
package Lacos_Arrays;

public class ArmazenarNumeros {

    public static void main(String[] args) {
        /*declaração do array para que o 
       programa armazene 50 números - 50 posições
        */
        int [] x = new int[50];
        
        /*
        Definição do preenchimento automático apartir do 101;
        Posicionamento do número inicial no array no índice
        
        */
        for (int i = 101; i <= 150; i++){
            x[i - 101] = i;
        }
        
        /*
        executa a contagem até o número chegar na posição 49, 
        ou seja, quando ele finaliza de armazenar as 50 posições.
        */
        for(int i = 0; i <= 49; i++) {
            System.out.println("Posição:  " + (i + 1));
            System.out.println(x[i]);
        }
       
    }
    
}
