//interface do programa
package pessoa;
import java.util.Scanner;

public class ProgramaPessoa {    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //instanciar a classe Pessoa na classe main
        Pessoa p1 = new Pessoa();
        
        //obtendo o atributo público
        System.out.println("Digite o nome de pessoa: ");
        p1.nome = ler.nextLine();
        
       //Interface invocando os métodos acessores em função da visibilidade
       System.out.println("Digite a idade: ");
       p1.setIdade(ler.nextInt());
       
       System.out.println("Digite o peso: ");
       p1.setPeso(ler.nextDouble());
       
       //configuração da saída
       System.out.println("Visualiando dados!");
       //concatenar dado público da classe = instancia da classe.nome do atributo
       System.out.println("Nome: " + p1.nome);
       //concatenar dado privado da classe = instancia da classe.método get do atributo
       System.out.println("Idade: " + p1.getIdade());
       System.out.println("Peso: " + p1.getPeso());
               
    }
    
}
