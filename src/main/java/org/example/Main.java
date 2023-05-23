package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader capturarTeclado = new InputStreamReader(System.in);
        BufferedReader buffer = new BufferedReader(capturarTeclado);

        System.out.println("Ingrese el primero numero a evaluar: ");
        String strnum1 = buffer.readLine();

        System.out.println("Ingrese el segundo numero a evaluar: ");
        String strnum2 = buffer.readLine();

        System.out.println("Ingrese el tercer numero a evaluar: ");
        String strnum3 = buffer.readLine();

        int num1 = Integer.parseInt(strnum1);
        int num2 = Integer.parseInt(strnum2);
        int num3 = Integer.parseInt(strnum3);

        if (num1 > num2) {
            if (num1 > num3) {
                if (num3 > num2) {
                    System.out.println("El numero mayor que ha ingresado es: " + num1);
                    System.out.println("El numero menor que ha ingresado es: " + num2);

                } else {
                    System.out.println("El numero mayor que ha ingresado es: " + num1);
                    System.out.println("El numero menor que ha ingresado es: " + num3);
                }
            } else {

                        System.out.println("El numero mayor que ha ingresado es: " + num3);
                        System.out.println("El numero menor que ha ingresado es: " + num2);

                }
        } else {
            if (num2 > num3) {
                if (num1 > num3) {
                    System.out.println("El numero mayor que ha ingresado es: " + num2);
                    System.out.println("El numero menor que ha ingresado es: " + num3);
                } else {
                    System.out.println("El numero mayor que ha ingresado es: " + num2);
                    System.out.println("El numero menor que ha ingresado es: " + num3);
                }
            }else{
                if(num3 > num1) {
                    System.out.println("El numero mayor que ha ingresado es: " + num3);
                    System.out.println("El numero menor que ha ingresado es: " + num1);
                }
            }
        }
    }
}