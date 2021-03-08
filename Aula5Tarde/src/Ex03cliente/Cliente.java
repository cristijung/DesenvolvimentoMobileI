/*
 Criar uma classe Cliente onde os atributos serão:
privado para nome, idade e renda (String, int, double)
Getters e Setter dos atributos
Criação de métodos para classificação se o cliente for:
- menor o maior de idade
- se é ricou ou não
 */
package Ex03cliente;

public class Cliente {
    //declaração de atributos privados
    private String nome;
    private int idade;
    private double renda;
    
    //métodos acessores Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }
    
    //criação dos métodos de classificar
    public String classificarIdade() {
        //atributo (variável) local do método
        String resposta;
        if(this.idade >= 18) {
            resposta = "Este cliente é maior de idade";
        }else{
            resposta = "Este cliente é menor de idade";            
        }
        return resposta;
    }
    
    public String classificarRenda() {
        //atributo (variável) local do método
        String salario;
        if(this.renda > 15000) {
            salario = "Este cliente é rico";
        }else{
            salario = "Este cliente não é rico";
        }
        return salario;
    }
    
}
