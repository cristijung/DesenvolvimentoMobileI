/*
Criar a interface do programa onde o user terá que digitar o nome, a
idade e a renda do cliente.
O programa retornará o nome + o resultado da idade (se for maior
ou menor de idade) +  o resultado se ele é rico ou não
 */
package Ex03cliente;
import java.util.Scanner;

public class MainCliente {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Cliente c1 = new Cliente();
        
        //invocação dos métodos acessores
        System.out.println("Nome do Cliente: ");
        c1.setNome(ler.nextLine());
        
        System.out.println("Digite a idade do cliente: ");
        c1.setIdade(ler.nextInt());
        
        System.out.println("Digite a renda do cliente: ");
        c1.setRenda(ler.nextDouble());
        
        System.out.println("--------------------------");
        //configuração das visualizações dos métodos
        //invocação dos métodos get
        System.out.println(c1.getNome());
        System.out.println(c1.getIdade());
        System.out.println(c1.getRenda());
        System.out.println("--------------------------");
        System.out.println("Classificando os dados do cliente:");
        System.out.println(c1.classificarRenda());
        System.out.println(c1.classificarIdade());       
        
    }
    
}
