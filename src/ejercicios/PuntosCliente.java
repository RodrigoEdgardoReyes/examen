package ejercicios;

import java.util.Scanner;

public class PuntosCliente {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int puntos;

        System.out.println("Ingrese la cantidad de puntos obtenidos");
        puntos = entrada.nextInt();

        if(puntos < 1000)
            System.out.println("Tipo de cliente: Bronce");
        else if(puntos == 1000 || puntos <= 3000)
            System.out.println("Tipo de cliente: Plata");
        else
            System.out.println("Tipo cliente: Oro");
    }
}
