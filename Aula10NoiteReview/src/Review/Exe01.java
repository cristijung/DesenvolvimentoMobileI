/*
1. Faça um programa que receba somente nºs positivos e 
exibe e calcule:
- o número digitado
- a soma dos números digitados
- a quantidade de números digitados
- a média dos números digitados
*/

package Review;
import java.util.Scanner;
import java.util.ArrayList;

public class Exe01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num = 0;
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("**************************************");
        System.out.println("Lista de números digitados");
        System.out.println(""); 
        
        System.out.println("Digite a quantidade de números desejados e para \n"
                + "parar o programa, basta digitar zero ou um número negativo");
        
        /*
        1ª Parte do programa - número digitado
        ordem que o programa FAÇA o 
        - digitar numero;
        - gravar numero
        - adicionar o numero no arraylist
        ENQUANTO o numero for maior que ZERO
        */
        do{
          System.out.println("Digite um número: ");
          num = ler.nextInt();
          //adiciona o elemento no ArrayList
          lista.add(num);
        }while(num > 0);
        
        /*
        remove o número digitado que não confere ao solicitado no progama
        ou seja, o zero e número negativo não contará no arraylist
        */
        int ultimo = lista.size();
        lista.remove(ultimo - 1);
        System.out.println("Mostrar a minha lista  " + lista);
        
        /*
        2ª Parte do Programa - a soma dos números digitados
        foreach (:) que significa "para cada"
        para cada numero digitado ele soma estes valores 
        */
        int soma = 0;  
        for(int numero : lista){
            soma += numero;            
        }
        System.out.println("A soma dos números digitados é:    " + soma);
        
        /*
        3ª parte do programa - a quantidade de números digitados
        método size();
        */
        System.out.println("A quantidade dos números digitados é:    " + lista.size());
        
        /*
        4ª parte do programa - - a média dos números digitados
        calcular e exibir a média
        */
        int media = 0;
        media = soma / lista.size();
        
        System.out.println("A média dos números digitados é:    " + media);
    }
    
    
}
