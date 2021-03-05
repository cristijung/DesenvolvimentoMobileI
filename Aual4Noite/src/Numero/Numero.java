/*
 *Criar uma classe "Numero" com as seguintes informações:
Atributos:
valor (de tipo int)
Métodos
getValor (método acessor)
setValor (método acessor)
verificarValor (retornando uma String informando SE (if) o valor é positivo ou  negativo)
 */
package Numero;

public class Numero {
    //atributo privado
    private int valor;
    
    //métodos acessores
    //get é obter e tem retorno
    public int getValor() {
        return valor;
    }
    
    //set é gravar é sem retorno
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    //método para verificar se o número que foi digitado
    //é positivo ou negativo
    public String verificarNumero() {
        String resposta;
        //teste lógico
        if(this.valor >= 0) {
            resposta = "Este número é positivo";
        }else{
            resposta = "Este número é negativo";
        }
        return resposta;
    }
    
    
}
