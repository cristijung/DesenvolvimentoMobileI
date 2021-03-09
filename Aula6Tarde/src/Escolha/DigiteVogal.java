package Escolha;
import java.util.Scanner;

public class DigiteVogal {
    public static void main(String[] args) {
        char vogal;
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite uma vogal: ");
        vogal = entrada.nextLine().charAt(0);
               
        switch( vogal )
        {
            case 'a':
                System.out.println("Você está no case da vogal 'a'");
            case 'e':
                System.out.println("Você está no case da vogal 'e'");
            case 'i':
                System.out.println("Você está no case da vogal 'i'");
            case 'o':
                System.out.println("Você está no case da vogal 'o'");
            case 'u':
                System.out.println("Você está no case da vogal 'u'");
        
            default:
                System.out.println("Fim!");        
            
        }
        

    }
}
    
