//Classe Livro
package livraria;

public class Livro {
    public String titulo, autor;
    private String genero;
    private int ano;
    private double preco;
    
    //construtor com parâmetros
    public Livro(String titulo, String autor, String genero, int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;
    }
        
    //construtor sem parâmetro
    public Livro() {
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public double verificarPreco() {
        if(this.preco >= 80) {
            preco = (preco - (preco * 0.2));
        }else{
            preco = preco;
        }
        return preco;
    }
    
    @Override
    public String toString() {
        return "Dados do Livro" + "\n" 
                + "O título do Livro: " + this.titulo + "\n" 
                + "O autor do Livro: " + this.autor + "\n" 
                + "O gênero do Livro: " + this.genero + "\n"
                + "O ano do Livro: " + this.ano + "\n"
                + "O preço do Livro: " + this.preco;
    }
    
    
    
    
    
}
    
