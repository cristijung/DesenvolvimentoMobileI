/*
 Criar uma classe com nome Pessoa
Atributos:
Nome publico
idade privado
peso privado
Métodos acessores
(getters e setters)
 */
package pessoa;

public class Pessoa {
    //atributos da classe
    public String nome;
    private int idade;
    private double peso;
    
    //métodos da classe
    //método set responsável por "grava" o dado no atributo
    //método que não tem retorno pq recebe o que foi digitado
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    //método get, para obter o dado gravado
    //método com retorno, pois "exibe" o que digitado no atributo
    public int getIdade() {
        return idade;
    }
    
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public double getPeso() {
        return peso;
    }
    
}









