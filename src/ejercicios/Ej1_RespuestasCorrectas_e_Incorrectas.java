package ejercicios;

import java.util.Scanner;

public class Ej1_RespuestasCorrectas_e_Incorrectas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /*orrectas = 5;
         incorrectas = 2;
         vacias = 0;*/

        int correctas, incorrectas, vacias;
        double puntaje;

        System.out.println("Ingrese el numero de respuestas correctas");
        int num1 = entrada.nextInt();

        System.out.println("Ingrese el numero de respuestas incorrectas");
        int num2 = entrada.nextInt();

        System.out.println("Ingrese el numero de respuestas vacias");
        int num3 = entrada.nextInt();


           correctas = num1 * 5;
           incorrectas = num2 *-2;
           vacias = num3 * 0;

           puntaje = correctas + incorrectas + vacias;

        System.out.println("El puntaje obtenigo es de: " + puntaje);



    }
}
