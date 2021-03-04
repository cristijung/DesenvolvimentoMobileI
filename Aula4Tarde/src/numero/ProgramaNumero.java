//classe principal que é a interface do programa
package numero;
import java.util.Scanner;

public class ProgramaNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //instanciamento da classe Numero
        Numero n1 = new Numero();
        
        
        //invocar os métodos acessores
        System.out.println("Digite um número: ");
        n1.setValor(ler.nextInt());
        
        //invocando o método de verificação
        System.out.println(n1.verificarValor());
        
        
           }
    
}
