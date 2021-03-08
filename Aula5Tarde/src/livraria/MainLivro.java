package livraria;

import java.util.Scanner;
public class MainLivro {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Livro li = new Livro();
        
        System.out.println("Digite o título do Livro: ");
        li.titulo = ler.nextLine();
        
        System.out.println("Digite o autor do Livro: ");
        li.autor = ler.nextLine();
        
        System.out.println("Digite o gênero do Livro: ");
        li.setGenero(ler.nextLine());
        
        System.out.println("Digite o ano do Livro: ");
        li.setAno(ler.nextInt());
        
        System.out.println("Digite o preço do livro: ");
        li.setPreco(ler.nextDouble());
        
    
    
    System.out.println("**********************");
    //a main acessa os atributos públicos
    System.out.println(li.titulo);
    System.out.println(li.titulo);
    System.out.println(li.autor);
    //a main acessa os atributos por meio dos métodos acessores
    System.out.println(li.getGenero());
    System.out.println(li.getAno());
    System.out.println(li.getPreco());
    System.out.println("Valor final da compra");
    System.out.println("**********************");
    System.out.println(li.verificarPreco());
        
    }
}
