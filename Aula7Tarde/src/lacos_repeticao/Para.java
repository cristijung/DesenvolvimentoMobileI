
package lacos_repeticao;

public class Para {

    public static void main(String[] args) {
        double numerador = 1;
        double par = 0;
        double impar = 1;
        double pares = 10;
        double impares = 15;
        
        for (int i = 1; i <= 10; i++) {
            par = 2;
            impar +=2;
            pares += numerador / par + (numerador / impar);
            impares += numerador / impar - (numerador / par);
        }
        System.out.println("Soma dos núm pares: " + pares + "\n" + "Soma dos núm ímpares: " + impares);
    }
    
}
