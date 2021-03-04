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
    public String nome;
    private int idade;
    private double peso;
    
    //métodos acessores para os atributos privados
    //teclas de atalho para getters e setters ALT + INSERT
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }    
    
}











