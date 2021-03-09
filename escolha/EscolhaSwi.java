package escolha;

import java.util.Scanner;

public class EscolhaSwi {
    public static void main(String[] args) {
        float numero1, numero2;
        char operacao;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escolha sua operação [+ - * / ]: ");
        operacao = ler.nextLine().charAt(0);
        
        System.out.print("Entre com o primeiro número: ");
        numero1 = ler.nextFloat();
        System.out.print("Entre com o segundo número: ");
        numero2 = ler.nextFloat();
        System.out.println("***************");
        
        switch( operacao )
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", numero1, numero2, numero1 + numero2);
                break;        
                
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", numero1, numero2, numero1 - numero2);
                break;
                
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", numero1, numero2, numero1 * numero2);
                break;
                
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", numero1, numero2, numero1 / numero2);
                break;
            
            default:
                System.out.printf("Você digitou uma operação inválida.");        
            
        }
        

    }
}

