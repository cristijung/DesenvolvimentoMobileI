/*
Classe Scanner utilização: é uma classe Java que lê o teclado e retorna o valor tipado 
digitado
 */
package AulaII;
//importação da classe Scanner (leitura do teclado)
import java.util.Scanner;

public class ExBasicoII {

    public static void main(String[] args) {
        //variável de texto
        //declaração de variáveis
        String nome;
        int idade;
        double altura;
        String endereco;
        
        /*instanciamento (nome) da classe Scanner
        A partir deste momento no código, a classe Scanner 
        será tratada pelo nome "ler"
        */        
        Scanner ler = new Scanner(System.in);
        
        //Definição da saída dos dados
        System.out.println("Digite o nome da pessoa: ");
        nome = ler.nextLine();
        
        System.out.println("Digite a idade da pessoa: ");
        idade = ler.nextInt();
        
        System.out.println("Digite a altura da pessoa: ");
        altura = ler.nextDouble();
        
        System.out.println("Digite o endereço da pessoa: ");
        endereco = ler.nextLine();   
        
        
    }
    
}
