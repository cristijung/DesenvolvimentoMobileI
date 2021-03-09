//INTERFACE, é onde o user do sistema irá interagir
package AtividadeAula04;

import java.util.Scanner;
public class MainCliente {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        /*invocação dos métodos acessores
        Invocações para gravar os dados nos
        atributos privados da classe cliente
        */
        System.out.println("Nome do cliente:");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a idade: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite o salário do cliente:");
        c1.setRenda(ler.nextDouble());
        
        /*Visualização dos dados digitados
        Invocação dos métodos acessores get
        */
        System.out.println("******************");
        System.out.println("Visualizando os dados do Cliente");
        System.out.println("******************");
        //invocando os getters
        System.out.println("O nome do cliente é: " + c1.getNome());
        System.out.println("A idade do cliente é: " + c1.getIdade());
        System.out.println("O salário do cliente é: " + c1.getRenda());
        
        //Chamar os métodos criados
        System.out.println(c1.classificarIdade());
        System.out.println(c1.classificarRenda());
    }
    
}
