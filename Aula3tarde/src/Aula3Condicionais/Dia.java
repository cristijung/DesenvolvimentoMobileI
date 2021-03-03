//digitar a hora e retornar o período do dia referente
package Aula3Condicionais;

import java.util.Scanner;

public class Dia {
    double hora;
    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Que horas são? ");
        double hora = ler.nextDouble();
        
        //condicional encadeado
        if(hora <= 12) {
            System.out.println("Bom dia");
        }else if(hora <18) {
            System.out.println("Boa Tarde");
        }else{
            System.out.println("Boa Noite");
        }
        
    }
    }
    

