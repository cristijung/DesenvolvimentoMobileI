package escolha;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /*
        Atributo do tipo float permite a inserção de valores reais
        inlcuindo decimais. Podemos também definir qtas casas após
        a vírgula esta variável irá armazenar.
        */
        float num1, num2;
        /*
        Atributo Char vem de carcater, portanto ele armazena
        caracteres que posteriormente possam ser referenciados em
        operações.
        */
        char operacao;
        
        Scanner ler = new Scanner(System.in);
        
        //aqui começa ainteratividade do user
        System.out.println("Escolha a sua operação: [+ - * /}");
        /*
        Método charArt(), trata o dado inserido como se fosse ser lido 
        numa sequência estabelecida. Após a leitura do char escolhido, 
        o método retorna ao índice zero
        */
        operacao = ler.nextLine().charAt(0);
        
        System.out.println("Entre com o primeiro n°:");
        num1 = ler.nextFloat();
        
        System.out.println("Entre com o segundo n°:");
        num2 = ler.nextFloat();
        
        System.out.println("********************************");
        /*
        Iniciando o Switch Case
        -> %: recebe o valor digitado. Não é considerado operador aritmético
        pois está numa string.
        -> .2f: indica que o programa irá mostar o número digitado mais
        uma vírgula e 2 casas decimais
        */
        switch (operacao)
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
                System.out.println("Você digitou uma operação inválida");
        }
        
    }
    
}
