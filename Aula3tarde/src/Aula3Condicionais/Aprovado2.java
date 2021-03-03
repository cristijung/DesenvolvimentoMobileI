package Aula3Condicionais;
import java.util.Scanner;

//criação da classe
public class Aprovado2 {
    String nome;
    double nota1, nota2, nota3;
    //o atributo media recebe o cálculo da média aritmética
    double media = (nota1 + nota2 + nota3) / 3;
    //instanciamento da classe Scanner
    static Scanner ler = new Scanner(System.in);

   
    public static String main(String[] args) {
        Aprovado2 ap2 = new Aprovado2();
        
        System.out.println("Digite o nome do aluno: ");
        String nome = ler.nextLine();
        
        System.out.println("Digite a nota 1 do aluno: ");
        double nota1 = ler.nextDouble();
        
        System.out.println("Digite a nota 2 do aluno: ");
        double nota2 = ler.nextDouble();
        
        System.out.println("Digite a nota 3 do aluno: ");
        double nota3 = ler.nextDouble();
        
        //System.out.println("A nota do aluno é: " + ap2.media);
        
        if(ap2.media >= 6) {
            return "Aprovado";
        }else{
            return "Reprovado";
        }
        
    }
    
}
