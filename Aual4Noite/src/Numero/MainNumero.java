/*
Criar a interface para execução do programa. Será digitado o número
e o programa retornará se ele é positivo ou negativo
 */
package Numero;

import java.util.Scanner;

public class MainNumero {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();
        
        //invocando os métodos acessores
        System.out.println("Digite um número: ");
        n1.setValor(ler.nextInt());
        
        //invocando o método de verificar
        System.out.println(n1.verificarNumero());
       
    }
    
}
