/*
1. Faça um programa que receba somente nºs positivos e exibe e calcule:
- o número digitado
- a soma dos números digitados
- a quantidade de números digitados
- a média dos números digitados
 */
package Review;
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        ArrayList<Integer> listaNumDigitados = new ArrayList<>();
        
        System.out.println("Digite a quantidade de números desejados: ");
        System.out.println("Para finalizar o seu programa, você poderá digitar qualquer número negativo: ");
        
        int num = 0;
        
        //laço de repetição do/while
        /*faça o seguinte (o programa):
        Digite o numero ........ leia o numero e adicione o numero
        ENQUANTO o numero foi MAIOR que zero
        E exiba a lista dos números digitados
        */
        do{
            System.out.println("Digite um número: ");
            num = ler.nextInt();
            listaNumDigitados.add(num);
        
        }while(num > 0);
        //esta variável serve para excluir o número negativo que foi 
        //digitato e parou a execução do programa
        int ultimoNum = listaNumDigitados.size();
        listaNumDigitados.remove(ultimoNum -1);
        
        System.out.println("Esta é a lista de números digitados  " + listaNumDigitados);
        
        
        //soma dos números digitados 
        int somaNum = 0;
        /*para cada (for) numero (int n) ele vai somar estes números
        for(var : arraylist){} (for each) --- para cada
        */
        for(int n : listaNumDigitados) {
            somaNum += n;
        }
        
        System.out.println("A soma dos números digitados é    "  + somaNum);
        System.out.println("A quantidade de números digitados é: " + listaNumDigitados.size());
        
        //média dos números digitados
        int mediaNum = 0;
        mediaNum = somaNum / listaNumDigitados.size();
        System.out.println("A média de números digitados é: " + mediaNum);
    }
    
}
