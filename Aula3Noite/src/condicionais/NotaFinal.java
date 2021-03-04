/*
 A condição estabelecida é média 6.
 */
package condicionais;
import java.util.Scanner;

public class NotaFinal {
    String nome;
    double media;
    
    static Scanner ler = new Scanner(System.in);
    

    public static void main(String[] args) {
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite e média do aluno: ");
        double media = ler.nextDouble();
        
        //teste lógico simples
        //se a média for maior ou igual a 6
        if(media >= 6) {
            System.out.println("O aluno está Aprovado");
        }else{
            System.out.println("O aluno está Reprovado");
            
        }
        
        
    }
    
}
