//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;
public class Main {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int dados2, dados3, imc, opciones;
        boolean x = true;
        Scanner teclado = new Scanner(System.in);
        while (x) {
            System.out.println("que opcion eliges? ");
            System.out.println("1. 2 dados ");
            System.out.println("2. 3 dados ");
            System.out.println("3. indice de masa corporal (IMC)");
            System.out.println("4. calaculadora de milisegundos ");
            System.out.println("5. ...");
            System.out.println("6. salir");
            opciones = teclado.nextInt();
            switch (opciones) {
                case 1:
                    dados2();
                    break;

                case 2:
                    dados3();
                    break;

                case 3:
                    imc();
                    break;

                case 4:
                    calculadoraMilisegundos();
                    break;
                case 5:

                    break;

                case 6:
                    x = false;
                    break;
            }

        }

    }

    public static void dados2() {
        Random aleatorio = new Random();
        int d1, d2, guardarDato1 = 0, guardarDato2 = 0;

        for (int i = 0; i <= 20; i++) {
            d1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            d2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            guardarDato1 += d1;
            guardarDato2 += d2;
        }

        System.out.println("total dado 1 " + guardarDato1);
        System.out.println("total dado 2 " + guardarDato2);

        if (guardarDato1 > guardarDato2) {
            System.out.println("el dado 1 es el ganador");
        } else if (guardarDato2 > guardarDato1) {
            System.out.println("el dado 2 es el ganador");
        } else {
            System.out.println("los dos dados tienen la misma suma");
        }
    }

    public static void dados3() {
        Random aleatorio = new Random();
        int d1, d2, d3, guardarDato1 = 0, guardarDato2 = 0, guardarDato3 = 0;

        for (int i = 0; i <= 20; i++) {
            d1 = aleatorio.nextInt((6 - 1) + 1) + 1;
            d2 = aleatorio.nextInt((6 - 1) + 1) + 1;
            d3 = aleatorio.nextInt((6 - 1) + 1) + 1;
            guardarDato1 += d1;
            guardarDato2 += d2;
            guardarDato3 += d3;
        }

        System.out.println("total dado 1 " + guardarDato1);
        System.out.println("total dado 2 " + guardarDato2);
        System.out.println("total dado 3 " + guardarDato3);

        //por si hay empates
        if (guardarDato1 == guardarDato2 && guardarDato2 == guardarDato3) {
            System.out.println("¡Empate entre los tres dados!");
        } else if (guardarDato1 == guardarDato2 && guardarDato1 > guardarDato3) {
            System.out.println("Empate entre dado 1 y dado 2 como ganadores.");
            System.out.println("El tercer lugar es del dado 3.");
        } else if (guardarDato1 == guardarDato2 && guardarDato1 < guardarDato3) {
            System.out.println("El primer lugar es del dado 1.");
            System.out.println("Empate entre dado 1 y dado 2 como perdedores.");
        } else if (guardarDato1 == guardarDato3 && guardarDato1 > guardarDato2) {
            System.out.println("Empate entre dado 1 y dado 3 como ganadores.");
            System.out.println("El tercer lugar es del dado 2.");
        } else if (guardarDato1 == guardarDato3 && guardarDato1 < guardarDato2) {
            System.out.println("El primer lugar es del dado 2.");
            System.out.println("Empate entre dado 1 y dado 3 como segundo y tercer lugar.");

        } else if (guardarDato2 == guardarDato3 && guardarDato2 > guardarDato1) {
            System.out.println("Empate entre dado 2 y dado 3 como ganadores.");
            System.out.println("El tercer lugar es del dado 1.");

        } else if (guardarDato1 > guardarDato2 && guardarDato1 > guardarDato3) {
            System.out.println("El dado ganador es el dado 1.");
            if (guardarDato2 > guardarDato3) {
                System.out.println("El segundo lugar es del dado 2.");
                System.out.println("El tercer lugar es del dado 3.");
            } else {
                System.out.println("El segundo lugar es del dado 3.");
                System.out.println("El tercer lugar es del dado 2.");
            }
        } else if (guardarDato2 > guardarDato1 && guardarDato2 > guardarDato3) {
            System.out.println("El dado ganador es el dado 2.");
            if (guardarDato1 > guardarDato3) {
                System.out.println("El segundo lugar es del dado 1.");
                System.out.println("El tercer lugar es del dado 3.");
            } else {
                System.out.println("El segundo lugar es del dado 3.");
                System.out.println("El tercer lugar es del dado 1.");
            }
        } else if (guardarDato3 > guardarDato1 && guardarDato3 > guardarDato2) {
            System.out.println("El dado ganador es el dado 3.");
            if (guardarDato1 > guardarDato2) {
                System.out.println("El segundo lugar es del dado 1.");
                System.out.println("El tercer lugar es del dado 2.");
            } else {
                System.out.println("El segundo lugar es del dado 2.");
                System.out.println("El tercer lugar es del dado 1.");
            }
        }
    }

    public static String imc() {
        double peso, estatura, IMC;
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite su peso en kg");
        peso = teclado.nextDouble();
        System.out.println("digite su estatura en mts");
        estatura = teclado.nextDouble();

        IMC = peso / (Math.pow(estatura, 2));
        System.out.println("tu indice de mas acorporal es de: " + IMC);
        if (IMC < 18.5) {
            System.out.println("tienes un bajo peso");
        } else if (IMC >= 18.5 && IMC <= 24.9) {
            System.out.println("tienes un peso normal");
        } else if (IMC >= 25 && IMC <= 26.9) {
            System.out.println("tienes sobrepeso de grado 1");
        } else if (IMC >= 27 && IMC <= 29.9) {
            System.out.println("tienes sobrepeso de grado 2");
        } else if (IMC >= 30 && IMC <= 34.9) {
            System.out.println("tienes obesidad de tipo 1");
        } else if (IMC >= 35 && IMC <= 39.9) {
            System.out.println("tienes obesidad de tipo 2");
        } else if (IMC >= 40 && IMC <= 49.9) {
            System.out.println("tienes obesidad de tipo 3 (morbida)");
        } else if (IMC > 50) {
            System.out.println("tienes obesidad de tipo 4 (extrema)");
        }
        return "el IMC es: ";
    }

    public static void calculadoraMilisegundos() {

        Scanner teclado = new Scanner(System.in);
        int dias, horas, minutos, segundos;

        System.out.print("Ingrese día: ");
        dias = teclado.nextInt();

        System.out.print("Ingrese horas: ");
        horas = teclado.nextInt();

        System.out.print("Ingrese minutos: ");
        minutos = teclado.nextInt();

        System.out.print("Ingrese segundos: ");
        segundos = teclado.nextInt();

        long totalMillisegundos = convertirMilisegundos(dias, horas, minutos, segundos);
        System.out.println("La cantidad total es de : " + totalMillisegundos + " milisegundos");
    }

    public static long convertirMilisegundos(int dias, int horas, int minutos, int segundos) {
        long millisegundos = 0;
        millisegundos += dias * 24L * 60 * 60 * 1000;
        millisegundos += horas * 60L * 60 * 1000;
        millisegundos += minutos * 60L * 1000;
        millisegundos += segundos * 1000L;
        return millisegundos;
    }



}