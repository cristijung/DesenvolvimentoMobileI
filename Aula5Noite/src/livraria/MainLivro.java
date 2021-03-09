/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package livraria;

import java.util.Scanner;

/**
 *
 * @author Cristina Jung
 */
public class MainLivro {

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
        System.out.println("O preço da compra é: " + li.verificarPreco());
        
    }
    
}
    
    

