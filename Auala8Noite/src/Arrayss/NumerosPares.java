/*
 Array
 */
package Arrayss;
//declaração da importação da classe Arrays
import java.util.Arrays;

public class NumerosPares {

    public static void main(String[] args) {
        /*
        declaração do array com valores atribuidos
        nome do array -- pares
        comprimento do array é 12
        índice do array é 11
        */
        
        int [] pares = {2,4,6,8,10,12,14,16,18,20,22,24};
        
        //array com texto do tipo String
        String [] nomes = {"Ana", "Bia", "Carlos", "José"};
        
        System.out.println("Estes são os números pares do Array: ");
        for (int i = 0; i < 12; i++) {
            System.out.println("São eles: " + pares[i]);
        }
        
        //usando o método toString para exibir os valores do Array como array
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(nomes));
        
        //atributo length exibe o comprimento do array
        System.out.println("O Array contém " + pares.length + " elementos");
        System.out.println("O Array contém " + nomes.length + " elementos");
        
        
    }
    
}
