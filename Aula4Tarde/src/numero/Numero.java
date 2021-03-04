/*
 *Criar uma classe "Numero" com as seguintes informações:
Atributos:
valor (de tipo int)
Métodos
getValor (método acessor)
setValor (método acessor)
verificarValor (retornando uma String informando SE (if) o valor é positivo ou  negativo)
 */
package numero;

public class Numero {
    //atributo está definido como privado
    //privado do tipo inteiro com nome de valor
    private int valor;
    
    //métodos acessores
    //método set é responsável por "gravar, armazenar" o valor do atributo
    public void setValor(int valor) {
        this.valor = valor;
        
    }
    
    //método get - obtém o dado que foi digitado no método set
    public int getValor() {
        return this.valor;
    }
    
    //criação do método verificarValor()
    public String verificarValor() {
        //variável (atributo) local que será visível e usada somente neste métodos
        String resposta;
        
        //se este valor(atributo) for maior igual a zero
        if(this.valor >= 0) {
            resposta = "Este número é positivo";
        }else{
            resposta = "Este número é negativo";
        }
        return resposta;        
    }
    
    
}
















