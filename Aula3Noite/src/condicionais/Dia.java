/*
Se a hora digitada for menor do que 12h é Bom Dia;
Se a hora for entre 12 e 18 será Boa tarde
Se a hora for maior do que 18, será Boa Noite
 */
package condicionais;
import java.util.Scanner;

public class Dia {
    double hora;
    static Scanner ler = new Scanner(System.in);
       
    
    public static void main(String[] args) {
       System.out.println("Que horas são? ");
       double hora = ler.nextDouble();
       
       //condicional encadeado
       if(hora <= 12){
           System.out.println("Bom dia");
       }else if(hora > 12 && hora <= 18) {
           System.out.println("Boa Tarde");
       }else{
           System.out.println("Boa Noite");
           
       }
    }
    
}
