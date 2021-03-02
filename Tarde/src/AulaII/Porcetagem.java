/*
 *Criar um algoritmo onde o user terá que digitar o valor de um
produto e o programa retornará valor da compra com desconto
 */
package AulaII;
import java.util.Scanner;

public class Porcetagem {
    double n1, n2;   
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        
        System.out.println("Digite o valor do primeiro produto: ");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite o valor do segundo produto: ");
        double n2 = ler.nextDouble();
        
        System.out.println("O valor da compra é: " + (n1 + n2));
        //cálulo de porcentagem
        System.out.println("O valor do desconto é: " + (n1 + n2) * 0.02);      
       
        
    }
    
}
