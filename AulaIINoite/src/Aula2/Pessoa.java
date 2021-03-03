/*
 * Criar um programa onde o usuário precisa digitar o nome, idade,
altura, peso e cidade da pessoa. O programa irá mostrar estes dados
 */
package Aula2;
import java.util.Scanner;

public class Pessoa {
    //declaração dos atributos(vairáveis) da classe pessoa
    String nome, cidade;
    //int idade;
    double altura, peso;
    //instanciamento da classe Scanner
    static Scanner leitura = new Scanner(System.in);

    public static void main(String[] args) {
       System.out.println("**** Seja Bem vindo ****");
       
       System.out.println("Digite o seu nome: ");
       String nome = leitura.nextLine();
       
       System.out.println("Digite a sua idade: ");
       int idade = leitura.nextInt();
       
       System.out.println("Digite a sua altura: ");
       double altura = leitura.nextDouble();
       
       System.out.println("Digite o seu peso: ");
       double peso = leitura.nextDouble();
       
       System.out.println("Digite sua cidade natal: ");
       String cidade = leitura.nextLine();
    }
    
}
