package livraria;

public class Livro {
    public String titulo, autor;
    private String genero;
    private int ano;
    private double preco;
    
    /*public Livro(String titulo, String autor, String genero, int ano, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.ano = ano;
        this.preco = preco;     
        
    }*/

    Livro() {
        
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
            preco = (preco * 0.8) - preco;
        }else{
            preco = preco;
        }
        return preco;
    }
    
    
    
    
    
    
}
