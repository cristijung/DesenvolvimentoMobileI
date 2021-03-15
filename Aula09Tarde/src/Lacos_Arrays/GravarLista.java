/*
 Gravar Lista
 */
package Lacos_Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class GravarLista {   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> lista = new ArrayList<>();
        
        System.out.println("Gravando dados no ArrayList com a classe Scanner");
        System.out.println("INSTRUÇÃO: Digite 0 quando desejar finalizar a lista: ");
        System.out.println("****************************************");
        
        //declaração da leitura dos dados digitados e inseridos no ArrayList
        for(int i = 0; i < 15;) {
            System.out.println("Digite um número para inserir na Lista: ");
            int num1 = ler.nextInt();
            
            if(num1 == 0) {
                break;
            }
            lista.add(num1);
        }
        
        int tamanho = lista.size();
        System.out.println("A quantidade de números da lista é:   " + tamanho);
        
        System.out.println("Os valores digitados foram:  ");
        for(Integer integer : lista) {
            System.out.println(integer);
        }
       
    }
    
}