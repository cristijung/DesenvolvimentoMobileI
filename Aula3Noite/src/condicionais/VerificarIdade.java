
package condicionais;
import java.util.Scanner;

public class VerificarIdade {
    String nome;
    int idade;
    static Scanner ler = new Scanner(System.in);

    
    public static void main(String[] args) {
        System.out.println("Digite o seu nome: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a sua idade: ");
        int idade = ler.nextInt();
        
        if(idade >= 18) {
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é uma criança!");
        }
        
    }
    
}
