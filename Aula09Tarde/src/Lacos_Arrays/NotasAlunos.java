/*
Crie um programa que leia um conjunto de notas, cuja quantidade seja 
determinada pelo usuário. 
Calcule a média de todas elas. Exiba o conjunto das notas maiores 
do que a média calculada. 
Em seguida, de forma agrupada, exiba o outro conjunto de notas 
(menores do que a média).
Programa com: Array, laço de repetição e if e else
Vetor é Array
 */
package Lacos_Arrays;
import java.util.Scanner;
public class NotasAlunos {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int quantidade;
        double media = 0;
        
        System.out.println("Informe a quantidade de notas:");
        quantidade = ler.nextInt();
        
        //array que recebe a quantidade digitada
        double vetor[] = new double[quantidade];
        
        
        //o laço de repetição (for) que repete até atingir o numero
        //digitado pelo user
        for(int i = 0; i < quantidade; i++) {
            System.out.println("Informe a   " + (i + 1) + "ª Nota");
            vetor[i] = ler.nextInt();
        }
        
        
        //o laço de repetição que vai calcular a média
        //de todos os números q foram digitados até atingir a quantidade
        //de notas estabelecida pelo user
        for(int i = 0; i < quantidade; i++) {
            media = media + vetor[i];
        }
        
        media = media / quantidade;
        
        
        //exibe a mpedia
        System.out.println("A média é:   " + media);
        String maior = "Nota acima da média:  " , menor = "Nota abaixo da média:  ";
        
        
        //o laço exibe as notas de maior média e menor média tendo
        //como referência o numero digitado pelo user
        for(int i = 0; i < quantidade; i++) {
            if(vetor[i] > media) {
                maior = maior + vetor[i] + "     ";
            }else{
                menor = menor + vetor[i];
            }
        }
        System.out.println(maior);
        System.out.println(menor);
    }
    
}
