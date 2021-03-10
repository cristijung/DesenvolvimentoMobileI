package escolha;
import java.util.Scanner;
public class Escolha1 {

    public static void main(String[] args) {
        int num;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Entre com um número entre 1 e 4");
        num = ler.nextInt();
        
        //condivional Switch
        switch (num) {
            case 1:
                System.out.println("Você escolheu 1");
                break;
            case 2:
                System.out.println("Você escolheu 2");
                break;
            case 3:
                System.out.println("Você escolheu 3");
                break;
            case 4:
                System.out.println("Você escolheu 4");
                break;
            default:
                System.out.println("Número Inválido");
        }
        
    }
    
}
