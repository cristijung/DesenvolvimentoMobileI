
package lacos_repeticao;
import java.util.Scanner;

public class FacaEnquanto {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        double numero, soma = 0;
        
        /*
        "do" que é faça a digitação de um número.
        Se o número for maior do que zero, ele irá somar os números
        digitados, quando o user digitar um número maior do q zero, 
        o programa somará todos os números digitados
        */
        do {
            System.out.println("Digite um número: ");
            numero = ler.nextDouble();
            
            if(numero > 0) {
                soma = numero + soma;
            }
        }while (numero >= 0);
        System.out.println("Soma dos valores: " + soma);
        
    }
    
}
