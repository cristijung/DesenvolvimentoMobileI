/*
Array List
 */
package ArraysLista;

import java.util.ArrayList;
import java.util.Collections;
public class ListaCores {

    public static void main(String[] args) {
       ArrayList<String> cores = new ArrayList<String>();
       cores.add("Branco");
       cores.add("Cinza");
       cores.add("Preto");
       cores.add("Vermelho");
       cores.add("Amarelo");
       cores.add("Verde");
       cores.add("Laranja");
       
       //Impressão do ArrayList
        System.out.println("O array é: " + cores);
        //ordem alfabética
        Collections.sort(cores);
        System.out.println("---------------------");
        System.out.println("O array é: " + cores);
        
        //Consultando um índice
        System.out.println("O índice 4 contém " + cores.get(4));
        
        //mudar o elemento do índice
        cores.set(4, "Roxo");
        System.out.println("O índice 4 contém agora: " + cores.get(4));
        System.out.println("O array é: " + cores);
        
        //método size() verifica o tamanho do ArrayList
        System.out.println("O tamanho do ArrayList é: " + cores.size());
        
        //removendo um índice
        System.out.println("Removendo o índice 1: " + cores.remove(1));
        System.out.println("O array agora é: " + cores);
        System.out.println("O tamanho do ArrayList agora é: " + cores.size());
        
        //limpando o índice inteiro
        cores.clear();
       System.out.println("O array agora é: " + cores);
    }
    
}
