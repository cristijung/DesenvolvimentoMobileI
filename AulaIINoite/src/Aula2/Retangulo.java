/*
 * Crie um algoritmo em que o user digite os lados de um
retângulo e o programa retorna a área e o perímetro da
forma geométrica
 */
package Aula2;
//classe Scanner é responsável pela leitura do dados digitados no teclado
//a classe Scanner é predefinida no Java
import java.util.Scanner;

public class Retangulo {
    //declatação das variáveis - atributos da classe
    int lado1, lado2;
    //criando e instanciando a classe Scanner
    static Scanner ler = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("Digite o lado 1 do retângulo: ");
        int lado1 = ler.nextInt();
        
        System.out.println("Digite o lado 2 do retângulo: ");
        int lado2 = ler.nextInt();
        
        System.out.println("Visualizando os dados do retâmdulo:");
        System.out.println("A área do retâmdulo é? " + (lado1 * lado2));
        System.out.println("O perímetro do retâmdulo é? " + (lado1 + lado2) * 2);
    }
    
}
