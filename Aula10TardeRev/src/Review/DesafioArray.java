/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.Scanner;
import java.util.ArrayList;

public class DesafioArray {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        
        System.out.println("Digite os números que você quer colocar dentro de um conjunto: ");
        System.out.println("(Para parar a execução, digite 0)");
        
        int num = 0;
        
        do {
            System.out.println("Digite um número: ");
            num = in.nextInt();
            
            numeros.add(num);
            
        } while (num > 0);
        
        System.out.println("Números gravados no conjunto: " + numeros);
        
        
        int numConjunto;
        System.out.println("Digite quantas casas você quer que sejam mostradas de seu conjunto: ");
        numConjunto = in.nextInt();
        
        int numero = 0;
        
        for (int i = 0; i < numConjunto; i++) {
            numero = numeros.get(i);
            System.out.println(numero);
        }
         System.out.println("Números gravados no conjunto: " + numeros);
    }
    
}