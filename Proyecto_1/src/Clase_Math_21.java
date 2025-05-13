package PACKAGE_NAME;

import java.util.Scanner;

public class Clase_Math_21 {
    public static void main(String[] args) {
        // Scanner entrada = new Scanner(System.in);

        // calculo de raiz cuadrada
        // System.out.println("Ingrese valor a calcular...");
        // int valor = entrada.nextInt();

        int valor = 9;

        // Calculo de raiz cuadrado
        System.out.println("Raiz de: " + valor + " = " + Math.sqrt(valor));

        // calcula de potencia
        var base = 2;
        var potencia = 3;
        System.out.println("Potencia de 2 a la 3 = " + Math.pow(base, potencia));

        // valor absoluto de un numero
        var absoluto = -2.5;
        System.out.println("Valor absoluto de: " + absoluto + " = " + Math.abs(absoluto));

        // identificar mayor valor
        var numero1 = 50.2;
        var numero2 = 3;
        System.out.println("Mayor valor: " + Math.max(numero2, numero1));
        System.out.println("Menor valor: " + Math.min(numero2, numero1));

        // redondear a entero mas cercano
        var total = 5.2826;
        System.out.println(total + " redondeada = " + Math.round(total));

        // redondear hacia abajo
        System.out.println(total + " redondear hacia abajo " + "= "
        + Math.floor(total));

        // redondear hacia arriba
        System.out.println(total + " redondear hacia arriba = " + Math.ceil(total));

        // numero aleatorio
        double aleatorio = Math.round(Math.random() * 10);
        System.out.println("valor aleatorio: " + aleatorio);

        // funcion numero PI
        System.out.println("Valor de pi: " + Math.PI);

        // seno de un angulo
        System.out.println("Seno de un angulo de 90: " + Math.sin(90));

        // coseno de un angulo
        System.out.println("Seno de un angulo de 90: " + Math.cos(180));

        // logaritmo natural del un numero
        var log = 100;
        System.out.println("Logaritmo de: " + log + " = " + Math.log10(log));

    }
}
