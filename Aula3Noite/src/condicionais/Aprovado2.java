/*
 *Aprovado e Reprovado com todos os atributos dentro do método main
 */
package condicionais;

import java.util.Scanner;

public class Aprovado2 {
    public static void main(String[] args) {
        String nome;
        double nota1, nota2, nota3;    
    
        Scanner ler = new Scanner(System.in);   
        
        System.out.println("Digite o nome do aluna(o): ");
        nome = ler.nextLine();
        
        System.out.println("Digite a Nota 1 do aluno: ");
        nota1 = ler.nextDouble();
        
        System.out.println("Digite a Nota 2 do aluno: ");
        nota2 = ler.nextDouble();
        
        System.out.println("Digite a Nota 3 do aluno: ");
        nota3 = ler.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        //condicionais
        if(media >= 6) {
            System.out.println("O aluno está Aprovado");
        }else{
            System.out.println("O aluno está Reprovado");
        }
    }
    
}
