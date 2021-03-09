//Interface
package livraria;
import java.util.Scanner;
public class ProgramaLivro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro li = new Livro();
        
        System.out.println("Digite o nome do Livro:");
        li.titulo = ler.nextLine();
        
        System.out.println("Digite o autor do livro:");
        li.autor = ler.nextLine();
        
        System.out.println("Digite o gênero do Livro:");
        li.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano do Livro: ");
        li.setAno(ler.nextInt());
        
        System.out.println("Digite o preço do Livro: ");
        li.setPreco(ler.nextDouble());
        
        System.out.println("**************************");
        //a main acessa o método toString
        System.out.println(li);
        /*
        a main acessa os atributos por meio dos métodos acessores,
        q são os privados int e double
        */
        System.out.println("O gênero do livro é: " + li.getGenero());
        System.out.println("O preço do livro é: " + li.getPreco());
        System.out.println("O valor final da compra");
        System.out.println("**************************");
        System.out.println(li.verificarPreco());
        
    }
    
}
