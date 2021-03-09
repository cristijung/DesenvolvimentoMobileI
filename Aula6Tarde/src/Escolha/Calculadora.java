package Escolha;
import java.util.Scanner;
public class Calculadora {

    public static void main(String[] args) {
        float num1, num2;
        char operacao;
        
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escolha sua operação: [+ - * /]: ");
        operacao = ler.nextLine().charAt(0);
        
        System.out.println("Entre com o primeiro número: ");
        num1 = ler.nextFloat();
        System.out.println("Entre com o segundo número: ");
        num2 = ler.nextFloat();
        
        System.out.println("******************************");
        
        /*switch
        Utilização de formatações especiais no Java
        Usando o System.out.printf();
        %.2f: significa que a impressão receberá o nº digitado mais o ponto e
        duas casas decimais*/
        switch(operacao) 
        {
            case '+':
                System.out.printf("%.2f + %.2f = %.2f", num1, num2, num1 + num2);
                break;
            case '-':
                System.out.printf("%.2f - %.2f = %.2f", num1, num2, num1 - num2);
                break;
            case '*':
                System.out.printf("%.2f * %.2f = %.2f", num1, num2, num1 * num2);
                break;
            case '/':
                System.out.printf("%.2f / %.2f = %.2f", num1, num2, num1 / num2);
                break;
            default:
                System.out.printf("Você digitou uma operação inválida");
                           
        }     
        
    }
    
}
