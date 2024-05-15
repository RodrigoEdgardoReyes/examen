package ejercicios;

import java.util.Scanner;

public class NumImpares {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num1;
        int i = 1;

        System.out.println("Ingrese un numero entero positivo");
        num1 = entrada.nextInt();

        System.out.println("Los numeros impares entre" + i + " Y " + num1 + " Son los siguientes: ");
while (i <= num1){
    System.out.println(i);
    i+=2;
}

    }
}
