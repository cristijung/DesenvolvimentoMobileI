/*
 Criar um algoritmo onde o user digita os lados de um retângulo e o 
programa calcula a área e o perímetro
 */
package AulaII;
import java.util.Scanner;

public class Retangulo {
    int lado1, lado2;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Digite o primeiro lado do retângulo: ");
        int lado1 = ler.nextInt();
        
        System.out.println("Digite o segundo lado do retângulo: ");
        int lado2 = ler.nextInt();
        
        System.out.println("Visualizando os dados da forma:");
        System.out.println("A área do retângulo é? " + (lado1 * lado2));
        System.out.println("O perímetro do retângulo é: " + (lado1 + lado2) * 2);
        
    }
    
}
