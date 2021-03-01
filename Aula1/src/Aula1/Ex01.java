//criar um algoritmo onde o user precisa digitar 2 valores e
//o programa exibe a soma
package Aula1;
//classe Scanner, responsável por ler toda e qualquer tipo de
//digitação no teclado
import java.util.Scanner;

public class Ex01 {
    //declaração das variáveis e seus tipos
    //tipo double pode receber números com vírgula
    double n1, n2;
    
    //construtor da classe Scanner, a partir desta instrução a classe será
    //"lida" pelo nome de ler
    static Scanner ler = new Scanner(System.in);
    
    //declaração da classe principal, a classe principal conterá as intruções
    //de execução
    public static void main (String[] args) {
        
        //métodos de saida de dados
        System.out.println("Digite o primeiro valor: ");
        double n1 = ler.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double n2 = ler.nextDouble();
        
        System.out.println("O resultato da soma é? " + (n1 + n2));
        
    }
     
}
