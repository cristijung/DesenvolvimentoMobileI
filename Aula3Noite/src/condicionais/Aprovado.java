/*
Aprovado e Reprovado .... inicinho da O.O
 */
package condicionais;
import java.util.Scanner;

public class Aprovado {
    String nome;
    double nota1, nota2, nota3;    
    
    static Scanner ler = new Scanner(System.in);
   
    public static void main(String[] args) {
        
        System.out.println("Digite o nome do aluna(o): ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a Nota 1 do aluno: ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a Nota 2 do aluno: ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite a Nota 3 do aluno: ");
        double nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        //condicionais
        if(media >= 6) {
            System.out.println("O aluno está Aprovado");
        }else{
            System.out.println("O aluno está Reprovado");
        }
        
        
    }
    
}
