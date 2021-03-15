/*
Criar um programinha onde o Array retornará a classificação
em ordem alfabética.
Usar importação de ArrayList e Collections
 */
package Lacos_Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class NomesPessoas {

    public static void main(String[] args) {
       ArrayList<String> pessoas = new ArrayList<>();
       pessoas.add("Marcela");
       pessoas.add("João");
       pessoas.add("Josefa");
       pessoas.add("Ana");
       pessoas.add("Pafúncio");
       pessoas.add("Marcelo");
       pessoas.add("Anarciso");
       pessoas.add("Tonho");
       pessoas.add("Margarinete");
       pessoas.add("Isadora");
       pessoas.add("Guilherme");
       
       //imprimindo na tela
        System.out.println("As pessoas são: " + pessoas);
        
        //tamanho do array
        System.out.println("O Array possui:  " + pessoas.size() + " elementos");
        
        //collections é responsável por iniciar o método sort
        Collections.sort(pessoas);
        System.out.println("As pessoas são: " + pessoas);
        
        //remover um índice
        pessoas.remove(4);
        System.out.println("As pessoas são: " + pessoas);
    }
    
}
