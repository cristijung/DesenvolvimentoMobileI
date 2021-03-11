package arrayss;
//importação da classe Arrays
import java.util.Arrays;

public class Numeros {
    public static void main(String[] args) {
        /*declaração do array com valores atribuidos
        nome do array - pares
        */
        int [] pares = {0,2,4,6,8};
        
        System.out.println("Números pares: ");
        for(int i = 0; i < 5; i++) {
            System.out.println(pares[i]);
            //usando o método toString para exibir os valores do Array
            System.out.println(Arrays.toString(pares));
        }
       
    }
    
}
