/*
Criando e impressão de um ArrayList
 */
package arrayslista;
//importação da classe do Java ArrayList
import java.util.ArrayList;

public class Exemplo01 {
    public static void main(String[] args) {
        //criação de um ArrayList
        ArrayList<String> cores = new ArrayList<String>();
        cores.add("Amarelo");
        cores.add("Vermelho");
        cores.add("Roxo");
        cores.add("Verde");
        cores.add("Azul");
        cores.add("Laranja");
        cores.add("Bege");
        
        //impressão do ArrayList
        System.out.println("Imprimindo o ArrayList: " + cores);
        
        //consultando um índice específico
        System.out.println("Consultando um índice do ArrayList - índice 3: " +cores.get(3));
        
        //mudando um índice
        cores.set(2, "Preto");
        System.out.println("Mudando o valor do índice 02" + cores);
        
        //retornar o tamanho do ArrayList
        System.out.println("O Tamanho do Array List é: " + cores.size());
        
        //removendo um índice
        System.out.println("Os elementos atuais são: " + cores);
        //removendo o ínidcde
        cores.remove(4);
        System.out.println("Os elementos atuais são: " + cores);
        
        //remover o ArrayList
        cores.clear();
        System.out.println(cores);
    }
    
}
