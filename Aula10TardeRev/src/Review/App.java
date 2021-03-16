/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Review;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        double[] valores = new double[5];

        System.out.print("Digite um valor: ");
        valores[0] = ler.nextDouble();

        System.out.print("Digite mais um valor: ");
        valores[1] = ler.nextDouble();

        System.out.print("Digite mais um valor: ");
        valores[2] = ler.nextDouble();

        System.out.print("Digite mais um valor: ");
        valores[3] = ler.nextDouble();

        System.out.print("Digite mais um valor: ");
        valores[4] = ler.nextDouble();

        System.out.print(valores[0] + ", " + valores[1] + ", " + valores [2] + ", " + valores[3] + ", " + valores[4]);
    }
}