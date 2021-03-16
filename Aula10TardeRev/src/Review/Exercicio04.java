/*
4. Um determinado material radioativo perde metade de 
sua massa a cada 50 segundos. Dada a massa inicial, em gramas, 
fazer um programa em Java que calcule o tempo necessário para 
que essa massa se torne menor que 0,5 grama. O programa deve 
escrever a massa inicial, a massa final e o tempo calculado 
em horas, minutos e segundos.

 */
package Review;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //atributos
        int meiaVida = 0;
        double gramas = 0;
        double segundos = 0, minutos = 0, horas = 0;
        
        System.out.println("Digite o valor da massa inicial do material:   ");
        gramas = ler.nextDouble();
        
        /*
        ENQUANTO a variável gramas for maior do que 0.5,
        o programa pega o valor de gramas e divide pela metada e
        incrementa a variável meiaVida
        */
        while (gramas > 0.5) {
            gramas /= 2;
            meiaVida ++;
        }
        
        //recebendo os valores e multiplicando e dividindo
        segundos = meiaVida * 50;
        minutos = segundos / 60;
        horas = minutos / 60;
        
        System.out.println("Tempo usado para que a massa possa atingir um valor menor do que 0.5: \n" 
                + segundos + "    Segundos."  + "\n"
                + minutos + "   Minutos" + "\n"
                + horas + "   horas");
                
    }
    
}
