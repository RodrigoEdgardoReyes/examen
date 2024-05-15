package ejercicios;

import java.util.Scanner;

public class NombreMascota {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String[] mascota = new String[10];

        for(int i = 0; i < 10; i++) {
            System.out.println("Escriba el nombre de una mascota: [" + i + "]");
            mascota[i] = entrada.next();
        }

        for(int i = 0; i < 10; i+=2){
            System.out.print("[" + i + "]" + mascota[i] + ", ");
        }
    }
}
